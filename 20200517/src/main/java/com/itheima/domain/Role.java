package com.itheima.domain;

import java.io.Serializable;
import java.util.List;

/**
 * @Description:
 * @PackageName: com.itheima.domain
 * @ClassName: Role
 * @Author: NH on 2020/5/19:10:19
 */
public class Role implements Serializable {

   private int id;
   private String roleName;
   private String roleDesc;
   private List<User> user;

    @Override
    public String toString() {
        return "Role{" +
                "id=" + id +
                ", roleName='" + roleName + '\'' +
                ", roleDesc='" + roleDesc + '\'' +
                ", user=" + user +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    public String getRoleDesc() {
        return roleDesc;
    }

    public void setRoleDesc(String roleDesc) {
        this.roleDesc = roleDesc;
    }

    public List<User> getUser() {
        return user;
    }

    public void setUser(List<User> user) {
        this.user = user;
    }
}
