package com.cjb.controller;

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
@RequestMapping("/user")
public class UserController extends BaseController{
    @Autowired
    private UserService userService;


    /**
     * 管理员登录功能
     * @param httpSession
     * @param username
     * @param password
     * @return ServerResponse
     */
    @RequestMapping(value="/adminLogin.do",method = RequestMethod.POST)
    @ResponseBody
    public ServerResponse adminLogin(HttpSession httpSession,
                                @RequestParam(value="username")String username,
                                @RequestParam(value="password")String password) {
        if(httpSession.getAttribute(Constants.ADMIN_SESSION_NAME)!=null){
            return ServerResponse.build(Constants.USER_LOGINED,"管理员已登录，请勿重复登录");
        }
        ServerResponse serverResponse= userService.adminLogin(username,password);
        if(serverResponse.getStatus()== Constants.SUCCESS_CODE){
            httpSession.setAttribute(Constants.ADMIN_SESSION_NAME,serverResponse.getData());
        }
        return serverResponse;
    }

    /**
     * 管理员登出功能
     * @param httpSession
     * @return
     */
    @RequestMapping(value="/adminLogout.do")
    @ResponseBody
    public ServerResponse adminLogout(HttpSession httpSession) {
        if(httpSession.getAttribute(Constants.ADMIN_SESSION_NAME)==null){
            return ServerResponse.build(Constants.USER_LOGOUT_FAIL,"登录已失效");
        }
        httpSession.removeAttribute(Constants.ADMIN_SESSION_NAME);
        return ServerResponse.build(Constants.SUCCESS_CODE,"退出成功");
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
