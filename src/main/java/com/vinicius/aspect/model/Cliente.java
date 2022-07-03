package com.vinicius.aspect.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Cliente {
    private int id;
    private String nome;
    private Integer idade;
    private String endereco;
}
