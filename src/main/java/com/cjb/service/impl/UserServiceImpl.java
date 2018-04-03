package com.cjb.service.impl;

import com.cjb.common.Constants;
import com.cjb.common.ServerResponse;
import com.cjb.dao.SystemUserMapper;
import com.cjb.dao.UserMapper;
import com.cjb.pojo.SystemUser;
import com.cjb.pojo.SystemUserExample;
import com.cjb.pojo.User;
import com.cjb.pojo.UserExample;
import com.cjb.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author cjb
 * @date 2018/2/1
 */
@Service
public class UserServiceImpl implements UserService{

    @Autowired
    private UserMapper  userMapper;

    @Autowired
    private SystemUserMapper systemUserMapper;
    /**
     * 用户登录
     * @param username
     * @param password
     * @return
     */
    @Override
    public ServerResponse userLogin(String username, String password) {
        UserExample userExample=new UserExample();
        UserExample.Criteria criteria = userExample.createCriteria();
        criteria.andAccountEqualTo(username);
        criteria.andPasswordEqualTo(password);
        List<User> user=userMapper.selectByExample(userExample);
        if(user!=null&&user.size()>=0){
            return ServerResponse.build(Constants.SUCCESS_CODE,"成功登录",user);
        }else{
            return ServerResponse.build(Constants.USER_LOGIN_FAIL,"账号或密码错误");
        }
    }

    /**
     * 医生登录
     * @param username
     * @param password
     * @return
     */
    @Override
    public ServerResponse doctorLogin(String username, String password) {
        UserExample userExample=new UserExample();
        UserExample.Criteria criteria = userExample.createCriteria();
        criteria.andAccountEqualTo(username);
        criteria.andPasswordEqualTo(password);
        List<User> user=userMapper.selectByExample(userExample);
        if(user!=null){
            return ServerResponse.build(Constants.SUCCESS_CODE,"成功登录",user);
        }else{
            return ServerResponse.build(Constants.USER_LOGIN_FAIL,"账号或密码错误");
        }
    }

    /**
     * 管理员登录
     * @param username
     * @param password
     * @return
     */
    @Override
    public ServerResponse adminLogin(String username, String password) {
        SystemUserExample systemUserExample=new SystemUserExample();
        SystemUserExample.Criteria criteria = systemUserExample.createCriteria();
        criteria.andAccountEqualTo(username);
        criteria.andPasswordEqualTo(password);
        List<SystemUser>  systemUser=systemUserMapper.selectByExample(systemUserExample);
        if(systemUser!=null){
            return ServerResponse.build(Constants.SUCCESS_CODE,"成功登录",systemUser);
        }else{
            return ServerResponse.build(Constants.USER_LOGIN_FAIL,"账号或密码错误");
        }
    }
}
