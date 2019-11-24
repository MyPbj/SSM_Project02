package com.zking.ssm.vo;

import com.zking.ssm.model.Systemdictionary;
import com.zking.ssm.model.Systemdictionaryitem;
import lombok.Data;
import lombok.ToString;

import java.util.List;

@ToString
@Data
public class SystemdictionaryVo extends Systemdictionary{
    List<Systemdictionaryitem> lst;
}
