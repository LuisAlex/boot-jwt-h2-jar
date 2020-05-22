package com.javado.stl.bootjwth2jar.helloworld;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWord {
    @GetMapping(path="/hello")
    public String helloWord(){
        return "You are authenticated";
    }
}
