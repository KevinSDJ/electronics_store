package com.app.electronicsStore.controller;

import java.time.Duration;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import reactor.core.publisher.Mono;

@Controller
@RequestMapping("/")
public class HomeCtrl {

    @GetMapping
    Mono<String> getHome(final Model model){
        
        return  Mono.just("index");
    }
    
}
