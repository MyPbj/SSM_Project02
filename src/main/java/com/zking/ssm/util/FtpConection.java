package com.zking.ssm.util;

import org.apache.commons.net.ftp.FTP;
import org.apache.commons.net.ftp.FTPClient;
import org.apache.commons.net.ftp.FTPReply;

import java.io.*;
import java.net.SocketException;


public class FtpConection {

    /**
     * 文件上次的缓存区大小
     */
    private static final int BUF_SIZE = 1024*1024;
    //本地字符编码
    static String LOCAL_CHARSET = "GBK";
    // FTP协议里面，规定文件名编码为iso-8859-1
    static String SERVER_CHARSET = "ISO-8859-1";

//    private Logger logger = LoggerFactory.getLogger(FtpConection.class);


    private static final String hostname="192.168.121.149";//服务器IP地址
    private static final Integer port=21;//服务端口
    private static final String username="ftptest";//用户名
    private static final String password="pbj2824489304.";//密码

    FTPClient client;

    /**
     */
    public FtpConection() {
        client = new FTPClient();
        try {
            client.connect(hostname, port);
            if (FTPReply.isPositiveCompletion(client.sendCommand("OPTS UTF8", "ON"))) {
                this.LOCAL_CHARSET = "UTF-8";
            }
            client.setControlEncoding(LOCAL_CHARSET);
        } catch (SocketException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
//            logger.error("FtpConection:链接FTP服务器发生异常！");
        }

        try {
            client.login(username, password);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
//            logger.error("FtpConection:登陆FTP服务器发生异常！");
        }
    }

    /**
     * 获得原始的FTPClient对象
     * @return FTPClient对象
     */
    public FTPClient getClient() {
        return client;
    }

    /**
     * 测试连接和登录是否成功
     * @return Boolean值，true-连接并登录成功，false-连接超时或登录失败。
     */
    public boolean isConnected() {
        boolean result = false;
        int reply = client.getReplyCode();
        String info = null;
        switch (reply) {
            case 0:
                info = "连接超时！";
                break;
            case 230:
                info = "连接成功，登陆成功！";
                result = true;
                break;
            case 530:
                info = "用户名或密码错误！";
                break;
        }
//        logger.info(info);
        return result;
    }


    /**
     * 上传文件
     * @param localPath 本地文件路径（含文件名）
     * @param serverPath FTP服务器存储路径（含文件名）
     * @return Boolean值，true-上传成功，false-上传失败（文件存在或目录错误）。
     * @throws IOException
     */
    public boolean uploadFiles(String localPath, String serverPath) throws IOException {
        boolean result = false;
        client.setFileType(FTP.BINARY_FILE_TYPE);
        client.enterLocalPassiveMode();
        client.setFileTransferMode(FTP.STREAM_TRANSFER_MODE);
        client.setBufferSize(BUF_SIZE);

        InputStream local = null;
        try {
            local = new FileInputStream(localPath);
            result = client.storeFile(serverPath, local);
        } finally {
            if (local != null) {
                local.close();
            }
        }

        return result;
    }


    /**
     * 利用流 上传文件
     * @param in 本地流
     * @param serverPath 服务器路径
     *   @param pathName 服务器文件名，切换目录访问文件
     * @return True 文件上传成功，False 文件上传失败
     * @throws IOException
     */
    public boolean uploadFiles(InputStream in, String serverPath,String pathName) throws IOException {
        boolean result = false;

        client.setFileType(FTP.BINARY_FILE_TYPE);
        client.enterLocalPassiveMode();
        client.setFileTransferMode(FTP.STREAM_TRANSFER_MODE);
        client.setBufferSize(BUF_SIZE);
        client.changeWorkingDirectory(pathName);
        InputStream local = null;
        try {
            local = in;
            result = client.storeFile(new String(serverPath.getBytes("GBK"),SERVER_CHARSET),local);
        } finally {
            if (local != null) {
                local.close();
            }
        }

        return result;
    }

    public static void main(String[] args) {
        FtpConection ftp = new FtpConection();
        try {
//            boolean b = ftp.downloadFile("timg.jpg", "F:\\timg.jpg");
//            System.out.println(b);
            boolean b = ftp.uploadFiles("C:\\Users\\Administrator\\Desktop\\p2p网贷系统\\imager\\70e4cb21178f86650d95fa5cb40dfa3b.jpg", "陈寅.jpg");
            System.out.println(b);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    /**
     * 下载文件
     * @param serverPath FTP服务器文件路径（含文件名）
     * @param localPath 本地存储文件路径（含文件名）
     * @return Boolean值，true-下载成功，false-下载失败（文件目录不存在或文件不存在）。
     * @throws IOException
     */
    public boolean downloadFile(String serverPath, String localPath) throws IOException {
        boolean result = false;

        client.setFileType(FTP.BINARY_FILE_TYPE);
        client.enterLocalPassiveMode();
        client.setFileTransferMode(FTP.STREAM_TRANSFER_MODE);
        client.setBufferSize(BUF_SIZE);

        OutputStream local = null;
        try {
//            local = new FileOutputStream(localPath);
//            result = client.retrieveFile(serverPath, local);
            InputStream is = client.retrieveFileStream(serverPath);
            is2byte(is);
        } finally {
            try {
                local.close();
            } catch (Exception e) {
                // 本地目录不存在，下载失败。
//                logger.error("FTP 下载文件在本地保存出现异常，本地路径不存在！");
                return false;
            }
        }

        return result;
    }

    /**
     * 下载文件
     * @param pathName FTP服务器文件路径（含文件名）
     * @param fileName 本地存储文件路径（含文件名）
     * @return Boolean值，true-下载成功，false-下载失败（文件目录不存在或文件不存在）。
     * @throws IOException
     */
    public byte[] downloadFileByte(String pathName, String fileName) throws IOException {
        client.setFileType(FTP.BINARY_FILE_TYPE);
        client.enterLocalPassiveMode();
        client.setFileTransferMode(FTP.STREAM_TRANSFER_MODE);
        client.setBufferSize(BUF_SIZE);
        if(pathName!=""){
            client.changeWorkingDirectory(pathName);
        }
        InputStream is = client.retrieveFileStream(fileName);
        return is2byte(is);
    }
    // inputstream转byte[]
    private byte[] is2byte(InputStream is) throws IOException {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        int len = 1024;
        byte tmp [] = new byte[len];
        int i ;
        while((i=is.read(tmp, 0, len))>0){
            baos.write(tmp, 0, i);
        }
        byte imgs[] = baos.toByteArray();
        return imgs;
    }



    /**
     * 退出已登录的FTP用户
     * @return Boolean值，true-退出成功，false-退出失败（连接为登录）。
     * @throws IOException
     */
    public boolean logout() throws IOException {
        return client.logout();
    }

}
