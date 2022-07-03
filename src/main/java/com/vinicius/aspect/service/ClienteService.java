package com.vinicius.aspect.service;

import com.vinicius.aspect.model.Cliente;
import org.json.JSONObject;
import org.springframework.stereotype.Service;


@Service
public class ClienteService {

    public Cliente incluir(Cliente cliente) {
        JSONObject json = new JSONObject(cliente);
        System.out.println("Incluindo Service Cliente: " + json.toString());
        return cliente;
    }

}
