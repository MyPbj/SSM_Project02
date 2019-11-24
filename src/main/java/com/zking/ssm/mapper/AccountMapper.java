package com.zking.ssm.mapper;


import com.zking.ssm.model.Account;
import org.springframework.stereotype.Repository;

@Repository
public interface AccountMapper {
  Account querySingleAccount(String logininfoid);
}