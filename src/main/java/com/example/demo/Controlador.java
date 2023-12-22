package com.example.demo;

import org.springframework.web.bind.annotation.RestController;

import lombok.extern.slf4j.Slf4j;

import org.springframework.web.bind.annotation.GetMapping;


@RestController
@Slf4j
public class Controlador {

    @GetMapping("/")
    public String iniciar(){
        log.info("controlador ejecuntadose");
        return "Hola mundo";
    }
    
}
