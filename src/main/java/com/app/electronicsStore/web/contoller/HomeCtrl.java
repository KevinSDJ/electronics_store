package com.app.electronicsStore.web.contoller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.app.electronicsStore.inventory.use_case.InventoryCaseUse;

import lombok.RequiredArgsConstructor;
import reactor.core.publisher.Mono;

@Controller
@RequestMapping("/")
@RequiredArgsConstructor
public class HomeCtrl {

    private final InventoryCaseUse inventory;

    @GetMapping
    Mono<String> getHome(final Model model){
        model.addAttribute("product",inventory.getProducts());
        return  Mono.just("home");
    }
    
}
