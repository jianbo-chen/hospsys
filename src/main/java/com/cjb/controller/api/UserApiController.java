package com.cjb.controller.api;

import com.cjb.common.Constants;
import com.cjb.common.ServerResponse;
import com.cjb.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;

/**
 * @author cjb
 * @date 2018/2/1
 */
@Controller
@RequestMapping("/userApi")
public class UserApiController {
    @Autowired
    private UserService userService;

    /**
     * 用户登录功能
     * @param httpSession
     * @param username
     * @param password
     * @return ServerResponse
     */
    @RequestMapping(value="/userLogin.do",method = RequestMethod.POST)
    @ResponseBody
    public ServerResponse userLogin(HttpSession httpSession,
                                @RequestParam(value="username")String username,
                                @RequestParam(value="password")String password) {
        if(httpSession.getAttribute(Constants.USER_SESSION_NAME)!=null){
            return ServerResponse.build(Constants.USER_LOGINED,"用户已登录，请勿重复登录");
        }
        ServerResponse serverResponse= userService.userLogin(username,password);
        if(serverResponse.getStatus()== Constants.SUCCESS_CODE){
            httpSession.setAttribute(Constants.USER_SESSION_NAME,serverResponse.getData());
        }
        return serverResponse;
    }

    /**
     * 医生登录功能
     * @param httpSession
     * @param username
     * @param password
     * @return ServerResponse
     */
    @RequestMapping(value="/doctorLogin.do",method = RequestMethod.POST)
    @ResponseBody
    public ServerResponse doctorLogin(HttpSession httpSession,
                                     @RequestParam(value="username")String username,
                                     @RequestParam(value="password")String password) {
        if(httpSession.getAttribute(Constants.DOCTOR_SESSION_NAME)!=null){
            return ServerResponse.build(Constants.USER_LOGINED,"医生已登录，请勿重复登录");
        }
        ServerResponse serverResponse= userService.doctorLogin(username,password);
        if(serverResponse.getStatus()== Constants.SUCCESS_CODE){
            httpSession.setAttribute(Constants.DOCTOR_SESSION_NAME,serverResponse.getData());
        }
        return serverResponse;
    }



    /**
     * 获取session的登录用户
     * @param httpSession
     * @return
     */
    @RequestMapping(value="/getLoginAdmin.do")
    @ResponseBody
    public ServerResponse getLoginAdmin(HttpSession httpSession) {
        if(httpSession.getAttribute(Constants.ADMIN_SESSION_NAME)!=null){
            return ServerResponse.build(Constants.SUCCESS_CODE,"已登录",httpSession.getAttribute(Constants.ADMIN_SESSION_NAME));
        }
        return ServerResponse.build(Constants.FAIL_CODE,"未登录用户");
    }
}
