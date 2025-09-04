package com.Ecommerse.Backend;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {
    @RequestMapping("/")
    public String greet(){
        return "Hello, This is From Backend" ;
    }
}
