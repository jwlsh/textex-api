package com.eaisys.textex.api.model;

import lombok.Data;

@Data
public class Media extends BaseEntity {

  private String mediaType;
  private String name;
  private String location;

}