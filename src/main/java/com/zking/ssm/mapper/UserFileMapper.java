package com.zking.ssm.mapper;

import com.zking.ssm.model.UserFile;
import org.springframework.stereotype.Repository;

@Repository
public interface UserFileMapper {
    int deleteByPrimaryKey(String id);

    int insert(UserFile record);

    int insertSelective(UserFile record);

    UserFile selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(UserFile record);

    int updateByPrimaryKey(UserFile record);
}