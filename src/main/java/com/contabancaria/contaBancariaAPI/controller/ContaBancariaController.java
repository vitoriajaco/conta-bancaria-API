package com.contabancaria.contaBancariaAPI.controller;

import com.contabancaria.contaBancariaAPI.model.ContaBancariaFactory;
import com.contabancaria.contaBancariaAPI.model.ContaBancariaModel;
import com.contabancaria.contaBancariaAPI.service.ContaBancariaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class ContaBancariaController {

   @Autowired
    private ContaBancariaService contaBancariaService;

    @GetMapping(path = "/contabancaria/{codigo}")
    public ResponseEntity<Optional<ContaBancariaModel>> buscarPorID (@PathVariable Long codigo){
        return ResponseEntity.ok(contaBancariaService.buscarId(codigo));
    }

   @GetMapping(path= "/contabancaria")
    public ResponseEntity<List<ContaBancariaModel>> mostrarTodasAsContas(){
        List<ContaBancariaModel> lista = contaBancariaService.mostrarTodasAsContas();
        return ResponseEntity.ok(lista);

    }

    @PostMapping(path= "/contabancaria")
    public ResponseEntity<ContaBancariaModel> cadastrarConta(@RequestBody ContaBancariaModel contaBancariaModel, ContaBancariaFactory contaBancariaFactory){
       ContaBancariaModel conta = contaBancariaService.cadastrarConta(contaBancariaModel, contaBancariaFactory);
       return new ResponseEntity<>(conta, HttpStatus.CREATED);

    }

    @DeleteMapping(path = "/produtos/{codigo}")
    public void deletarConta(@PathVariable Long codigo){
        contaBancariaService.deletar(codigo);
    }


}
