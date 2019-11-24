package com.zking.ssm.controller;

import com.alibaba.fastjson.JSON;
import com.zking.ssm.model.Userinfo;
import com.zking.ssm.service.ISystemdictionaryService;
import com.zking.ssm.service.IUserinfoService;
import com.zking.ssm.util.BaseController;
import com.zking.ssm.util.RealNameAuthentication;
import com.zking.ssm.vo.SystemdictionaryVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping(value = "/userinfo")
public class UserinfoController extends BaseController{
    @Autowired
    private IUserinfoService userinfoService;
    @Autowired
    private ISystemdictionaryService systemdictionaryService;
    @RequestMapping("login")
    @CrossOrigin
    public Map<String,Object> login(Userinfo userinfo){
                try {
                    Userinfo user = userinfoService.login(userinfo.getUsername());
                    List<SystemdictionaryVo> systemdictionaryVos = systemdictionaryService.querySystemdictionaryAll();
                    Map<String,Object> map= new HashMap<String,Object>();
                    System.out.println(systemdictionaryVos);
                    map.put("dict",systemdictionaryVos);
                    map.put("user",user);
                    boolean flag = checkCredentials(userinfo.getPassword(), user.getSalt(), user.getPassword());
            if (flag) {
                return json(map,flag,"登陆成功",0l);
            }else {
                return json(null,flag,"登陆失败",0l);
            }
        } catch (Exception e) {
            e.printStackTrace();
            return json(null,false,"系统异常",0l);
        }
    }
    @CrossOrigin
    @RequestMapping("updateUserInfo")
    public Map<String,Object> updateUserInfo(Userinfo userinfo){
        try {
            Userinfo userinfo1=null;
            int i = userinfoService.updateByPrimaryKey(userinfo);
            if(i>0){
                userinfo1 = userinfoService.selectByPrimaryKey(userinfo.getId());
            }
            return json(userinfo1,true,"保存成功",0l);
        } catch (Exception e) {
            e.printStackTrace();
            return json(null,false,"保存失败",0l);

        }
    }
    @CrossOrigin
    @RequestMapping("realNameAuthentication")
    public Map<String,Object> realNameAuthentication(Userinfo userinfo){

        try {
            Userinfo userinfo1=null;
            String authentication = RealNameAuthentication.Authentication(userinfo.getIdnumber(), userinfo.getRealname());
            Map map = JSON.parseObject(authentication, Map.class);
            Object showapi_res_code = map.get("showapi_res_code");
            Integer n=new Integer(String.valueOf(showapi_res_code));
            if (n!=-1){
                int i = userinfoService.updateByPrimaryKeySelective(userinfo);
                if(i>0){
                    userinfo1 = userinfoService.selectByPrimaryKey(userinfo.getId());
                }
                return json(userinfo1,true,"认证成功",0l);
            }
            return json(null,false,"认证失败",0l);
        } catch (Exception e) {
            e.printStackTrace();
            return json(null,false,"认证失败",0l);
        }
    }
}
