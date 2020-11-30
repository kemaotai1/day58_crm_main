package com.kmt.dao;

import com.kmt.entity.Account;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface IAccountDao {
    @Select("select * from account")
    List<Account> findAll();
}
