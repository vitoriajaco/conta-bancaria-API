package com.contabancaria.contaBancariaAPI.controller;

import com.contabancaria.contaBancariaAPI.model.ContaBancariaModel;
import com.contabancaria.contaBancariaAPI.service.ContaBancariaService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
public class ContaBancariaController {

    private ContaBancariaService contaBancariaService;

    @GetMapping(path = "/contabancaria/{codigo}")
    public Optional<ContaBancariaModel> buscarPorID (@PathVariable Long codigo){
        return contaBancariaService.buscarId(codigo);
    }

   @GetMapping(path= "/contabancaria")
    public List<ContaBancariaModel> mostrarTodasAsContas(){
        return contaBancariaService.mostrarTodasAsContas();
    }

    public void deletarConta(@PathVariable Long codigo){
        contaBancariaService.deletar(codigo);
    }


}
