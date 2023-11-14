package org.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller

public class crmController {

    @RequestMapping("/hello")
    @ResponseBody

    public String helloGFG(){
        return "This is the controller class";
    }

}
