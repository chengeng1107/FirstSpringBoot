package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
 * @author chengeng
 */
@Controller
public class TestController {

    /**
     *  Change 4.
     *  Change 3.
     *  Change 2.
     *  Change 1.
     *  This is the dev branch.
     *  This is the first change in local IDE.
     *  This is the first change in github website.
     *  This is the change in branch dev on website.
      */
    @RequestMapping(value = "/helloWorld", method = RequestMethod.GET)
    @ResponseBody
    public String helloWorld() {
        return "Hello World!";
    }

    @GetMapping(value = "/getMapping")
    @ResponseBody
    public String testGetMapping() {
        return "testGetMapping";
    }
}
