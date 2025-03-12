package dev.moretty.ApiCadastroDeCarros.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
@Table(name = "carros")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class modelCarros {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private Long id;
    private String marca;
    private String modelo;
    private String ano;
    private String cor;
    private String imgUrl;



}
