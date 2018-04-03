package com.cjb.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class BaseController {
    @RequestMapping("/go/{folder}/{file}")
    public String goURL(@PathVariable String folder,@PathVariable String file){
        return "forward:/WEB-INF/html/"+folder+"/"+file+".html";
    }
}
