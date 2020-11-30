package com.kmt.service.impl;

import com.kmt.dao.IAccountDao;
import com.kmt.entity.Account;
import com.kmt.service.IAccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class IAccountDaoImpl implements IAccountService {
    @Autowired
    private IAccountDao accountDao;
    @Override
    public List<Account> findAll() {
        return accountDao.findAll();
    }
}
