package dev.moretty.ApiCadastroDeCarros.service;

import dev.moretty.ApiCadastroDeCarros.model.modelCarros;
import dev.moretty.ApiCadastroDeCarros.repository.repositoryCarros;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class serviceCarros {

    //Refatorar a isntancia futuramente
    @Autowired
    private repositoryCarros repo;

    //Post
    public modelCarros addCar(modelCarros carro) {
        return repo.save(carro);
    }

    //List
    public List<modelCarros> getAllCar() {
        return repo.findAll();
    }

    //delete
    public void deleteCar(Long id) {
        repo.deleteById(id);
    }

    //get by id
    public Optional<modelCarros> findById(Long id) {
        return repo.findById(id);
    }

    //put
    public modelCarros updateCar(modelCarros carro) {
        return repo.save(carro);
    }
}
