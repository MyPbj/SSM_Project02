package com.zking.ssm.service.impl;

import com.zking.ssm.mapper.SystemdictionaryMapper;
import com.zking.ssm.mapper.SystemdictionaryitemMapper;
import com.zking.ssm.model.Systemdictionaryitem;
import com.zking.ssm.service.ISystemdictionaryService;
import com.zking.ssm.vo.SystemdictionaryVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.SQLException;
import java.util.List;
@Service
public class SystemdictionaryServiceImpl implements ISystemdictionaryService {
    @Autowired
    private SystemdictionaryMapper systemdictionaryMapper;
    @Autowired
    private SystemdictionaryitemMapper systemdictionaryitemMapper;

    @Override
    public List<SystemdictionaryVo> querySystemdictionaryAll()throws Exception {
        List<SystemdictionaryVo> systemdictionaryVos = systemdictionaryMapper.querySystemdictionaryAll();
        systemdictionaryVos.forEach(item->{
            try {
                List<Systemdictionaryitem> systemdictionaryitems = systemdictionaryitemMapper.querySystemdictionaryitemByPid(item.getId());
                item.setLst(systemdictionaryitems);
            } catch (SQLException e) {
                e.printStackTrace();
            }
        });
        return systemdictionaryVos;
    }
}
