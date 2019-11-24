package com.zking.ssm.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/goto")
public class GoToController {
    @RequestMapping("/{dir}/{page}")
    public String gotoPage(@PathVariable String dir, @PathVariable String page){
        return dir+"/"+page;
    }
    @RequestMapping("/{page}")
    public String gotoPage(@PathVariable String page){
        return page;
    }
}
