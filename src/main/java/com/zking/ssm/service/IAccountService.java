package com.zking.ssm.service;


import com.zking.ssm.model.Account;


public interface IAccountService {
    Account querySingleAccount(String logininfoid);
}