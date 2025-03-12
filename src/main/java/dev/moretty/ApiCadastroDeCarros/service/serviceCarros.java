package dev.moretty.ApiCadastroDeCarros.service;

import dev.moretty.ApiCadastroDeCarros.model.modelCarros;
import dev.moretty.ApiCadastroDeCarros.repository.repositoryCarros;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class serviceCarros {

    //    Refatorar a isntancia futuramente
    @Autowired
    private repositoryCarros repo;

    //Post
    public modelCarros addCar(modelCarros carro) {
        return repo.save(carro);
    }

}
