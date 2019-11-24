package com.zking.ssm.mapper;

import com.zking.ssm.vo.ModuleInfoVo;
import org.springframework.stereotype.Repository;

import java.sql.SQLException;
import java.util.List;

@Repository
public interface ModuleInfoMapper {
    List<ModuleInfoVo> queryByRoot()throws SQLException;
    List<ModuleInfoVo> queryByPid(String id)throws SQLException;
}