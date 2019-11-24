package com.zking.ssm.service;

import com.zking.ssm.model.Userinfo;
import org.springframework.stereotype.Repository;

public interface IUserinfoService {
    int deleteByPrimaryKey(String id)throws Exception;

    int insert(Userinfo record)throws Exception;

    int insertSelective(Userinfo record)throws Exception;

    Userinfo selectByPrimaryKey(String id)throws Exception;

    int updateByPrimaryKeySelective(Userinfo record)throws Exception;

    int updateByPrimaryKey(Userinfo record)throws Exception;
    Userinfo login(String username)throws Exception;
}