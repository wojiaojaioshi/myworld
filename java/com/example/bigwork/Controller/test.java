package com.example.bigwork.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class test {
    @RequestMapping("/test")
    public String c()
    {
        return "index";
    }

}
