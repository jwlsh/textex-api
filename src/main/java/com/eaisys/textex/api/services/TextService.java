package com.eaisys.textex.api.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.eaisys.textex.api.model.Conversation;
import com.eaisys.textex.api.model.Text;
import com.eaisys.textex.api.model.User;

import java.util.ArrayList;
import java.util.List;

@Service
public class TextService {

  @Autowired
  UserService userService;

  public List<Conversation> getTextsByUserId(String userId){
    
    List<Conversation> convos = new ArrayList<Conversation>();
    
    Conversation c1 =  createConvo();
    convos.add( c1 );
    
    return convos;
    
  }
  
  Conversation createConvo(){
  
    User user = userService.getByUserId("jwlsh");    
  
    Conversation convo = new Conversation();
    convo.setFrom("Andrea");
    convo.setTo("John");
    convo.getTexts().add(new Text(user, "Andrea", "Hi honey"));
    convo.getTexts().add(new Text(user, "John", "Hi!"));
    convo.getTexts().add(new Text(user, "Andrea", "Need a favor"));
    convo.getTexts().add(new Text(user, "John", "What?"));
    convo.getTexts().add(new Text(user, "Andrea", "Wegmans trip!"));
    
    return convo;
    
  }
  

}