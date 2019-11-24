package com.zking.ssm.service.impl;

import com.zking.ssm.mapper.ModuleInfoMapper;
import com.zking.ssm.service.IModuleInfoService;
import com.zking.ssm.vo.ModuleInfoVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ModuleInfoServiceImpl implements IModuleInfoService {
    @Autowired
    private ModuleInfoMapper moduleInfoMapper;
    @Override
    public List<ModuleInfoVo> queryByRoot()throws Exception {
        List<ModuleInfoVo> moduleInfoVos = moduleInfoMapper.queryByRoot();
        moduleInfoVos.forEach(item->
                {
                    try {
                        item.setModuleInfoss(queryByPid(item.getId()));
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
        );
        return moduleInfoVos
                ;
    }

    @Override
    public List<ModuleInfoVo> queryByPid(String pid)throws Exception {
        return moduleInfoMapper.queryByPid(pid);
    }
}
