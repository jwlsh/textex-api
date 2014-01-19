package com.eaisys.textex.api.model;

import lombok.Data;
import lombok.EqualsAndHashCode;


@Data
@EqualsAndHashCode(callSuper=true)
public class User extends BaseEntity {

  private String name;
  private String userId;
  private String email;
  
  public User(){}

  public User(String userId, String name, String email){
    this.userId = this.userId;
    this.name = name;
    this.email = email;    
  }

}