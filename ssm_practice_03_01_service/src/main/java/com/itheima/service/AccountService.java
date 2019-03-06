package com.itheima.service;

import com.itheima.domain.Account;

public interface AccountService {

    //登录查询
    Account findOne(Account account);
}
