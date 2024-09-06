package com.ninos.notes;

import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.ProviderManager;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/hi")
    public String hello(){
        return "hi ninos";
    }


    @GetMapping("/contact")
    public String contact(){
        return "hi contact";
    }

    @GetMapping("/admin")
    public String admin(){
        return "hi admin";
    }




}
