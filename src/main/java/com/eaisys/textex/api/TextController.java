package com.eaisys.textex.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.eaisys.textex.api.services.TextService;
import com.eaisys.textex.api.model.Conversation;

import java.util.List;

@RestController
public class TextController {

    @Autowired
    TextService textService;

    @RequestMapping("/")
    @ResponseBody
    String home() {
        return "Hi! Are you lost?";
    }

    @RequestMapping(value = "/{userId}/texts", 
        method = RequestMethod.GET, 
        produces = MediaType.APPLICATION_JSON_VALUE )
    public @ResponseBody List<Conversation> listTexts(@PathVariable("userId") String userId ){
       List<Conversation> lists = textService.getTextsByUserId(userId);
       
       return lists;
    }

}