package dev.moretty.ApiCadastroDeCarros.controller;

import dev.moretty.ApiCadastroDeCarros.model.modelCarros;
import dev.moretty.ApiCadastroDeCarros.service.serviceCarros;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/carros")
public class controllerCarros {

    @Autowired
    private serviceCarros service;

    @PostMapping("/add")
    public ResponseEntity<modelCarros> addCarros(@RequestBody modelCarros carro) {
     modelCarros newCarro = service.addCar(carro);
     return new ResponseEntity<>(newCarro,HttpStatus.CREATED);
    }


}
