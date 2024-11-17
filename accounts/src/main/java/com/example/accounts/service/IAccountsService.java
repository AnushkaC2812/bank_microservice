package com.example.accounts.service;
//all logic should be inside service layer

import com.example.accounts.dto.CustomerDto;
import com.example.accounts.entity.Customer;

public interface IAccountsService {
   void createAccount(CustomerDto customerDto);
   CustomerDto fetchAccount(String mobileNumber);
   boolean updateAccount(CustomerDto customerDto);
   boolean deleteAccount(String mobileNumber);


}

