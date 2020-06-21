package com.itheima.dao;

import com.itheima.domain.Role;

import java.util.List;

/**
 * @Description:
 * @PackageName: com.itheima.dao
 * @ClassName: RoleDao
 * @Author: NH on 2020/5/19:10:23
 */
public interface RoleDao {

    List<Role> findAll();
}
