package com.sasza.tymleaf;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Hello {

    @GetMapping("/hello")
    public String getHello(){
        return "Hello Alesia";
    }

}
