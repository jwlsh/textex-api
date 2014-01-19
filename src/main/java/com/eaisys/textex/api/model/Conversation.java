package com.eaisys.textex.api.model;

import java.util.ArrayList;
import java.util.List;

import lombok.Data;

@Data
public class Conversation extends BaseEntity {

  private String from;
  private String to;  
  private List<Text> texts  = new ArrayList<Text>();

}