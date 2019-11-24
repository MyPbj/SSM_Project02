package com.zking.ssm.service;

import com.zking.ssm.vo.ModuleInfoVo;

import java.util.List;

public interface IModuleInfoService {
    List<ModuleInfoVo> queryByRoot()throws Exception;
    List<ModuleInfoVo> queryByPid(String pid)throws Exception;
}