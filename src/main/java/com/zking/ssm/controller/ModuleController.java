package com.zking.ssm.controller;

import com.zking.ssm.service.IModuleInfoService;
import com.zking.ssm.util.BaseController;
import com.zking.ssm.vo.ModuleInfoVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/module")
public class ModuleController extends BaseController{
    @Autowired
    private IModuleInfoService moduleInfoService;
    @CrossOrigin
    @RequestMapping(value = {"queryByRoot"})
    public Map<String,Object> queryByRoot(){
        try {
            List<ModuleInfoVo> moduleInfoVos = moduleInfoService.queryByRoot();
            return json(moduleInfoVos,true,"OK",0L);
        } catch (Exception e) {
            e.printStackTrace();
            return json(null,false,"NO",0L);
        }
    }
}
