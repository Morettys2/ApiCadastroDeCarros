package dev.moretty.ApiCadastroDeCarros.repository;

import dev.moretty.ApiCadastroDeCarros.model.modelCarros;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface  repositoryCarros extends JpaRepository<modelCarros, Long> {
}
