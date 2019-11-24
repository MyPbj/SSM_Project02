package com.zking.ssm.mapper;

import com.zking.ssm.model.Systemdictionaryitem;
import org.springframework.stereotype.Repository;

import java.sql.SQLException;
import java.util.List;

@Repository
public interface SystemdictionaryitemMapper {
List<Systemdictionaryitem> querySystemdictionaryitemByPid(Integer pid)throws SQLException;
}