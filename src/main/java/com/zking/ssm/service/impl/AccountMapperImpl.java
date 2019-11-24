package com.zking.ssm.service.impl;

import com.zking.ssm.mapper.AccountMapper;
import com.zking.ssm.model.Account;
import com.zking.ssm.service.IAccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class AccountMapperImpl implements IAccountService {
    @Autowired
    private AccountMapper accountMapper;
    @Override
    public Account querySingleAccount(String logininfoid) {
        return accountMapper.querySingleAccount(logininfoid);
    }


}
