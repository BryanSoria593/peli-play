package com.basm.play;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    private final PeliPlayAiService peliPlayAiService;

    public HelloController(PeliPlayAiService peliPlayAiService) {
        this.peliPlayAiService = peliPlayAiService;
    }

    @GetMapping("/")
    public String Hello(){
        return this.peliPlayAiService.generateGreeting();
    }
}
