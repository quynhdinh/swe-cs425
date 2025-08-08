package org.miu.cs.cs425.eregistrarwebapi.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @GetMapping("/")
    public ResponseEntity<String> home() {
        return ResponseEntity.ok("Hi, welcome to the E-Registrar Web API");
    }
    
    @GetMapping("/eregistrar")
    public ResponseEntity<String> eregistrarHome() {
        return ResponseEntity.ok("Hi, welcome to the eRegistrar Web API!");
    }
}
