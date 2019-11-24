package com.zking.ssm.service.impl;

import com.zking.ssm.mapper.UserinfoMapper;
import com.zking.ssm.model.Userinfo;
import com.zking.ssm.service.IUserinfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserinfoServiceImpl implements IUserinfoService {
    @Autowired
    private UserinfoMapper userinfoMapper;

    @Override
    public int deleteByPrimaryKey (String id)throws Exception {
        return 0;
    }

    @Override
    public int insert(Userinfo record)throws Exception {
        return 0;
    }

    @Override
    public int insertSelective(Userinfo record)throws Exception {
        return 0;
    }

    @Override
    public Userinfo selectByPrimaryKey(String id)throws Exception {
        return userinfoMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(Userinfo record)throws Exception {
        return userinfoMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(Userinfo record)throws Exception {
        return userinfoMapper.updateByPrimaryKey(record);
    }

    @Override
    public Userinfo login(String username)throws Exception {
        return userinfoMapper.login(username);
    }
}
