package com.zking.ssm.controller;

import com.zking.ssm.model.Account;
import com.zking.ssm.model.UserFile;
import com.zking.ssm.service.IAccountService;
import com.zking.ssm.service.IUserFileService;
import com.zking.ssm.util.BaseController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/account")
public class AccountController extends BaseController{
    @Autowired
    private IAccountService accountService;

    @Autowired
    private IUserFileService userFileService;

    @CrossOrigin
    @RequestMapping("querySingleAccount")
    private Map<String,Object> querySingleAccount(String logininfoid){
        Account account = accountService.querySingleAccount(logininfoid);
        UserFile userFile = userFileService.selectByPrimaryKey(logininfoid);
        Map<String,Object> map=new HashMap<>();
        map.put("account",account);
        map.put("userFile",userFile);
        return json(map,true,"OK",0L);
    }
}
