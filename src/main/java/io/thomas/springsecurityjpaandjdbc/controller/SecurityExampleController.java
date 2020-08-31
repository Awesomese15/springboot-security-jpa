package io.thomas.springsecurityjpaandjdbc.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class SecurityExampleController {

    @GetMapping("/show")
    public String showSomthing(){
        return "<h1>Welcome</h>";
    }

    @GetMapping("/user")
    public String showSomthingForUser(){
        return "<h1>Welcome User</h>";
    }

    @GetMapping("/admin")
    public String showSomthingForAdmin(){
        return "<h1>Welcome Admin</h>";
    }

}
