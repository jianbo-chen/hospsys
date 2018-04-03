package com.cjb.common;

public interface Constant {
    //用于JSON成功的状态码
    int SUCCESS_CODE=200;
    //用于JSON失败的状态吗
    int FAIL_CODE=400;
    //用户未登录
    int USER_LOGINED=1001;
    //用户已登录
    int USER_LOGOUT_FAIL=2001;
    //登录已失效
    int PASS_WORD_NULL=2002;
    //验证码为空
    int VALIDATE_CODE_NULL=2003;
    //用户注册失败
    int USER_REGISTER_FAIL=2004;
    //用户登录失败（账号或者密码错误）
    int USER_LOGIN_FAIL=2005;
    //获取用户信息失败
    int GET_USERINFO_FAIL=2006;
    // 无改动信息
    int UPDATA_USERINFO_FAIL=2007;
    //修改密码失败
    int UPDATA_PASSWORD_FAIL=2008;
    //获取用户地址失败
    int GET_USERADDRESS_FAIL=2009;
    //增加用户地址失败
    int ADD_USERADDRESS_FAIL=2010;
    //删除用户地址失败
    int DELETE_USERADDRESS_FAIL=2011;
    //更新用户地址失败
    int UPDATA_USERADDRESS_FAIL=2012;
    //获取用户收藏失败
    int GET_USERCOLLECTION_FAIL=2013;
    //收藏已存在
    int ADD_USERCOLLECTION_FAIL=2014;
    //删除用户收藏失败
    int DELETE_USERCOLLECTION_FAIL=2015;
    //原密码错误
    int OLD_PASSWORD_FAIL=2016;
    //两次输入新密码不同
    int CONFIRM_PASSWORD_FAIL=2017;

    int USER_LOGINED_FAIL=2018;

    int NEW_PASSWORD_FAIL=2019;

    String USER_SESSION_NAME="user";

    String DOCTOR_SESSION_NAME="doctor";

    String ADMIN_SESSION_NAME="admin";

}
