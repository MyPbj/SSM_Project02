package com.zking.ssm.mapper;

import com.zking.ssm.model.Systemdictionary;
import com.zking.ssm.vo.SystemdictionaryVo;
import org.springframework.stereotype.Repository;

import java.sql.SQLException;
import java.util.List;

@Repository
public interface SystemdictionaryMapper {
List<SystemdictionaryVo> querySystemdictionaryAll()throws SQLException;
}