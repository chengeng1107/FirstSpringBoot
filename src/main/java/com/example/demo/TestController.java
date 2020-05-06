package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class TestController {

    // This is the dev branch.
    // This is the first change in local IDE.
    // This is the first change in github website.
    @RequestMapping(value = "/helloWorld", method = RequestMethod.GET)
    @ResponseBody
    public String HelloWorld() {
        return "Hello World!";
    }
}
