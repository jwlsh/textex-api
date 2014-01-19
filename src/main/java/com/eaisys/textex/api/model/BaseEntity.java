package com.eaisys.textex.api.model;

import java.io.Serializable;
import java.util.Date;

import lombok.Data;

@Data
public abstract class BaseEntity implements Serializable { 

  protected Long id;
  protected String uid;
  protected Date created;        
  protected Date lastModified;
  protected String lastModifiedBy;
  
}