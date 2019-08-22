package com.jxust.controller;

import com.jxust.PersonProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Peng
 * Time: 2016/12/15 20:55
 */
@RestController
public class HelloController {

   @Autowired
   private PersonProperties personProperties;

    @RequestMapping(value = "/hello",method = RequestMethod.GET)
    public String say(){
        return personProperties.getName()+personProperties.getAge();
    }
}
