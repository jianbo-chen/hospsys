package com.cjb.service;

import com.cjb.common.ServerResponse;
import com.cjb.dao.UserMapper;
import com.cjb.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpSession;

/**
 * @author cjb
 * @date 2018/2/1
 */
public interface UserService {
    /**
     * 用户密码登录方法
     * @param username
     * @param password
     * @return
     */
    ServerResponse userLogin (String username, String password);

    /**
     * 医生登录方法
     * @param username
     * @param password
     * @return
     */
    ServerResponse doctorLogin (String username, String password);

    /**
     * 管理员登录方法
     * @param username
     * @param password
     * @return
     */
    ServerResponse adminLogin (String username, String password);
}
