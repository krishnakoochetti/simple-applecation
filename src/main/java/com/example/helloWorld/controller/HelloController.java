package com.example.helloWorld.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;

@Controller
public class HelloController {

    @RequestMapping("/JenkinsApp")
    public String Helloworld(){
        return "hello";
    }

    @RequestMapping("/hello")
        public String devops(){
        return "devops";
    }


}
