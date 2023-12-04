package com.app.electronicsStore.web.contoller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import reactor.core.publisher.Mono;

@Controller
@RequestMapping("/session/")
public class SessionCtrl {
    
    @GetMapping("sign-in")
    Mono<String> getSignIn(){
        
       return Mono.just("signIn");
    }
}
