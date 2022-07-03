package com.vinicius.aspect.controller;


import com.vinicius.aspect.model.Cliente;
import com.vinicius.aspect.service.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("ClienteController")
@RequestMapping("/cliente")
public class ClienteController extends BaseController {

    @Autowired
    private ClienteService clienteService;

    @PostMapping("/incluir")
    public Object publish(@RequestBody Cliente cliente) {
        return clienteService.incluir(cliente);
    }
}
