package com.itheima.mapper;

import com.itheima.domain.Account;
import org.apache.ibatis.annotations.Select;

//这里是接口，不能实例化，所以不能使用注解
public interface AccountMapper {


    //登录查询
    @Select("select * from account where username=#{username} and password=#{password}")
    Account findOne(Account account);
}
