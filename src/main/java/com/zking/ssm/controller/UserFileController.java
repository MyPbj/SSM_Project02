package com.zking.ssm.controller;

import com.zking.ssm.model.UserFile;
import com.zking.ssm.service.IUserFileService;
import com.zking.ssm.util.BaseController;
import com.zking.ssm.util.FtpConection;
import com.zking.ssm.vo.UserFileVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.io.InputStream;
import java.util.Map;

@RestController
@RequestMapping("/userFile")
public class UserFileController extends BaseController{
    @Autowired
    private IUserFileService userFileService;

    @CrossOrigin
    @RequestMapping("download")
    public ResponseEntity<byte[]> download(HttpServletRequest request, @RequestParam String userinfoId) {
        /*根据id查找相对应的用户信息*/
        UserFile userFile = userFileService.selectByPrimaryKey(userinfoId);
        /*创建自己封装的ftp工具类*/
        FtpConection ftp = new FtpConection();
        try {
            HttpHeaders headers = new HttpHeaders();//http头信息
            String downloadFileName = new String(userFile.getImage().getBytes("UTF-8"),"iso-8859-1");//设置编码
            headers.setContentDispositionFormData("attachment", downloadFileName);
            headers.setContentType(MediaType.APPLICATION_OCTET_STREAM);
           return new ResponseEntity<byte[]>(ftp.downloadFileByte("/",userFile.getImage()),headers, HttpStatus.OK);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
    @RequestMapping(value = "upload")
    @CrossOrigin
    public Map<String,Object> upload(UserFileVo userFileVo){
        /*获取文件*/
        MultipartFile file=userFileVo.getUserFile();
        String filename = file.getOriginalFilename();
        /*给用户添加信息*/
        /*图片*/
        userFileVo.setImage(filename);
        /*备注*/
        userFileVo.setRemark("头像");
        userFileService.deleteByPrimaryKey(userFileVo.getUserinfoId());
        int i = userFileService.insert(userFileVo);
        FtpConection ftp = new FtpConection();
        try {
            InputStream inputStream = file.getInputStream();
            /*上传到虚拟机ftp中*/
            boolean b = ftp.uploadFiles(inputStream, filename,"/");
            return json(null,b,"上传成功",0l);
        } catch (IOException e) {
            e.printStackTrace();
            return json(null,false,"上传失败",0l);
        }
    }

}
