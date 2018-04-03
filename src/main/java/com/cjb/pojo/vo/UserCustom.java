package com.cjb.pojo.vo;

import com.cjb.pojo.User;

/**
 * @author cjb
 * @date 2018/2/2
 */
public class UserCustom extends User {
    private String roleName;
    private String roleDesc;

    public String getRoleDesc() {
        return roleDesc;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    public void setRoleDesc(String roleDesc) {
        this.roleDesc = roleDesc;
    }
}