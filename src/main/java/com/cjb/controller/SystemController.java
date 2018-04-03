package com.cjb.controller;

import com.cjb.common.ServerResponse;
import com.cjb.pojo.Department;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author cjb
 * @date 2018/2/7
 */
@Controller
@RequestMapping("hosp")
public class SystemController  extends BaseController{

    @RequestMapping(value = "addDepartment" ,method = RequestMethod.POST)
    @ResponseBody
    public ServerResponse addDepartment(@RequestParam(value = "departmentName")String departmentName){
        return null;
    }
}
