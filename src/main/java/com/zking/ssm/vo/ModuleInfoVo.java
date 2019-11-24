package com.zking.ssm.vo;

import com.zking.ssm.model.ModuleInfo;
import lombok.Data;
import lombok.ToString;

import java.util.List;

@ToString
@Data
public class ModuleInfoVo extends ModuleInfo{
    private List<ModuleInfoVo> moduleInfoss;
}
