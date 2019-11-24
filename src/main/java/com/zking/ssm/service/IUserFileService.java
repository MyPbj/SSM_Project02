package com.zking.ssm.service;

import com.zking.ssm.model.UserFile;
import org.springframework.stereotype.Service;

public interface IUserFileService {

    int insert(UserFile record);
    int deleteByPrimaryKey(String id);

    UserFile selectByPrimaryKey(String userinfoId);

    int updateByPrimaryKeySelective(UserFile record);

    int updateByPrimaryKey(UserFile record);
}