package com.zking.ssm.service;

import com.zking.ssm.model.Bidrequest;

import java.util.List;

public interface IBidrequestService {
    int deleteByPrimaryKey(Integer id)throws Exception;

    int insert(Bidrequest record)throws Exception;

    int insertSelective(Bidrequest record)throws Exception;

    Bidrequest selectByPrimaryKey(Integer id)throws Exception;

    int updateByPrimaryKeySelective(Bidrequest record)throws Exception;

    int updateByPrimaryKey(Bidrequest record)throws Exception;
    List<Bidrequest> queryBidrequestPager()throws Exception;

}