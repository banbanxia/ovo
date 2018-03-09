package com.zly.ovo.controller;

import com.zly.ovo.service.TestService;
import netscape.javascript.JSObject;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class TestController {
    @Autowired
    private TestService testService;
    public static void main(String[] args){
        System.out.println("hello world");
    }
    @Test
    public void test1(){
        System.out.println("--");
    }

    @RequestMapping(value = "/test", method = RequestMethod.GET)
    @ResponseBody
    public String test3(){
        return testService.getUserName();
    }
}
