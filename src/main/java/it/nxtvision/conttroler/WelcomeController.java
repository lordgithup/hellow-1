package it.nxtvision.conttroler;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {

    @GetMapping("/h")
    public String welcome() {
        return "Welcome to NxtVision!";
    }
    
    
    @GetMapping("de")
    public String welcom() {
        return "Welcome to webtech!";
    }
}
