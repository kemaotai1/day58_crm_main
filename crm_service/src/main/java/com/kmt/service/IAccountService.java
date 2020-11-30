package com.kmt.service;

import com.kmt.entity.Account;

import java.util.List;

public interface IAccountService {
    List<Account> findAll();
}
