package com.zking.ssm.mapper;

import com.zking.ssm.model.Userinfo;
import org.springframework.stereotype.Repository;

import java.sql.SQLException;

@Repository
public interface UserinfoMapper {
    int deleteByPrimaryKey(String id)throws SQLException;

    int insert(Userinfo record)throws SQLException;

    int insertSelective(Userinfo record)throws SQLException;

    Userinfo selectByPrimaryKey(String id)throws SQLException;

    int updateByPrimaryKeySelective(Userinfo record)throws SQLException;

    int updateByPrimaryKey(Userinfo record)throws SQLException;
    Userinfo login(String username)throws SQLException;
}