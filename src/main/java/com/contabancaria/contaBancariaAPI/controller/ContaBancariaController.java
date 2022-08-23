package com.contabancaria.contaBancariaAPI.controller;

import com.contabancaria.contaBancariaAPI.model.ContaBancariaFactory;
import com.contabancaria.contaBancariaAPI.model.ContaBancariaModel;
import com.contabancaria.contaBancariaAPI.service.ContaBancariaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class ContaBancariaController {

   @Autowired
    private ContaBancariaService contaBancariaService;

    @GetMapping(path = "/contabancaria/{codigo}")
    public Optional<ContaBancariaModel> buscarPorID (@PathVariable Long codigo){
        return contaBancariaService.buscarId(codigo);
    }

   @GetMapping(path= "/contabancaria")
    public List<ContaBancariaModel> mostrarTodasAsContas(){
        return contaBancariaService.mostrarTodasAsContas();
    }

    @PostMapping(path= "/contabancaria")
    @ResponseStatus(HttpStatus.CREATED)
    public ContaBancariaModel cadastrarConta(@RequestBody ContaBancariaModel contaBancariaModel, ContaBancariaFactory contaBancariaFactory){
        return contaBancariaService.cadastrarConta(contaBancariaModel, contaBancariaFactory);
    }

    @DeleteMapping
    public void deletarConta(@PathVariable Long codigo){
        contaBancariaService.deletar(codigo);
    }


}
