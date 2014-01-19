package com.eaisys.textex.api.services;

import org.springframework.stereotype.Service;

import com.eaisys.textex.api.model.User;

@Service
public class UserService {

  public User getByUserId(String userId){
    User user = new User(userId, "John Walsh", "john.walsh@eaisys.com");
    
    return user;
  }

}