package com.itheima.dao;

import com.itheima.domain.Account;

import java.util.List;

/**
 * @Description:
 * @PackageName: com.itheima.dao
 * @ClassName: AccountDao
 * @Author: NH on 2020/5/18:16:23
 */
public interface AccountDao {

    List<Account> findAll();
}
