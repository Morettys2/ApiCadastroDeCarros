package dev.moretty.ApiCadastroDeCarros.controller;

import dev.moretty.ApiCadastroDeCarros.model.modelCarros;
import dev.moretty.ApiCadastroDeCarros.service.serviceCarros;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

// Rota inicial da API
@RestController
@RequestMapping("/api/carros")
public class controllerCarros {

    @Autowired
    private serviceCarros service;

    // Rota para adicionar um carro
    @PostMapping("/add")
    public ResponseEntity<modelCarros> addCarros(@RequestBody modelCarros carro) {
        modelCarros newCarro = service.addCar(carro);
        return new ResponseEntity<>(newCarro, HttpStatus.CREATED);
    }

    // Rota para listar todos os carros
    @GetMapping("/all")
    public ResponseEntity<List<modelCarros>> getAllCarros() {
        List<modelCarros> allCarros = service.getAllCar();
        return new ResponseEntity<>(allCarros, HttpStatus.OK);
    }

    //Rota para deletar um carro por id
    @DeleteMapping("/delete/{id}")
    public void deleteCarros(@PathVariable Long id) {
        service.deleteCar(id);
    }

    //Rota para buscar um carro por id
    @GetMapping("/find/{id}")
    public ResponseEntity<?> findById(@PathVariable Long id) {
        Optional<modelCarros> OptinalCarro = service.findById(id);
        if (OptinalCarro.isPresent()) {
            return new ResponseEntity<>(OptinalCarro.get(), HttpStatus.OK);
        } else {
            return new ResponseEntity<>("Carro não encontrado", HttpStatus.NOT_FOUND);
        }
    }

    //Rota para atualizar um carro por id

    @PutMapping("/update/{id}")
    public ResponseEntity<?> updateCarros(@PathVariable Long id, @RequestBody modelCarros carro) {
        Optional<modelCarros> OptinalCarro = service.findById(id);
        if (OptinalCarro.isPresent()) {
            modelCarros updateCarro = OptinalCarro.get();
            updateCarro.setMarca(carro.getMarca());
            updateCarro.setModelo(carro.getModelo());
            updateCarro.setAno(carro.getAno());
            updateCarro.setCor(carro.getCor());
            updateCarro.setImgUrl(carro.getImgUrl());
            service.addCar(updateCarro);
            return new ResponseEntity<>(updateCarro, HttpStatus.OK);
        } else {
            return new ResponseEntity<>("Carro não encontrado", HttpStatus.NOT_FOUND);
        }
    }

}
