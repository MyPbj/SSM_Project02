package com.zking.ssm.service.impl;

import com.zking.ssm.mapper.BidrequestMapper;
import com.zking.ssm.model.Bidrequest;
import com.zking.ssm.service.IBidrequestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BidrequestServiceImpl implements IBidrequestService {
    @Autowired
    private BidrequestMapper bidrequestMapper;
    @Override
    public int deleteByPrimaryKey(Integer id)throws Exception {
        return 0;
    }
    @Override
    public int insert(Bidrequest record)throws Exception {
        return bidrequestMapper.insert(record);
    }

    @Override
    public int insertSelective(Bidrequest record)throws Exception {
        return 0;
    }

    @Override
    public Bidrequest selectByPrimaryKey(Integer id) {
        return null;
    }

    @Override
    public int updateByPrimaryKeySelective(Bidrequest record)throws Exception {
        return 0;
    }

    @Override
    public int updateByPrimaryKey(Bidrequest record)throws Exception {
        return 0;
    }

    @Override
    public List<Bidrequest> queryBidrequestPager()throws Exception {
        return bidrequestMapper.queryBidrequestPager();
    }
}
