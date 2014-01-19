package com.eaisys.textex.api.model;

import java.util.Date;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper=true)
public class Text extends BaseEntity {
  
  private User user;
  private String from;
  private String message;
  private Date sent;
  private Date received;
  
  public Text(){}
  
  public Text(User user, String from, String message){
    
    this.user = user;
    this.from = from;
    this.message = message;
  }

}