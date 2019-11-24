package com.zking.ssm.service.impl;

import com.zking.ssm.mapper.UserFileMapper;
import com.zking.ssm.model.UserFile;
import com.zking.ssm.service.IUserFileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserFileServiceImpl implements IUserFileService {
    @Autowired
    private UserFileMapper userFileMapper;

    @Override
    public int insert(UserFile record) {
        return userFileMapper.insert(record);
    }

    @Override
    public int deleteByPrimaryKey(String id) {
        return userFileMapper.deleteByPrimaryKey(id);
    }


    @Override
    public UserFile selectByPrimaryKey(String userinfoId) {
        return userFileMapper.selectByPrimaryKey(userinfoId);
    }

    @Override
    public int updateByPrimaryKeySelective(UserFile record) {
        return userFileMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(UserFile record) {
        return userFileMapper.updateByPrimaryKey(record);
    }
}
