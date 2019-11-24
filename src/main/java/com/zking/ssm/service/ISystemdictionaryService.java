package com.zking.ssm.service;

import com.zking.ssm.vo.SystemdictionaryVo;
import org.springframework.stereotype.Repository;

import java.util.List;

public interface ISystemdictionaryService {
List<SystemdictionaryVo> querySystemdictionaryAll()throws Exception;
}