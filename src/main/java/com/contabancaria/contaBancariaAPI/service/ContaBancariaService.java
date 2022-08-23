package com.contabancaria.contaBancariaAPI.service;

import com.contabancaria.contaBancariaAPI.model.ContaBancariaFactory;
import com.contabancaria.contaBancariaAPI.model.ContaBancariaModel;
import com.contabancaria.contaBancariaAPI.repository.ContaBancariaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.List;
import java.util.Optional;

@Service
public class ContaBancariaService {

    @Autowired
    private ContaBancariaRepository contaBancariaRepository;

    public List<ContaBancariaModel> mostrarTodasAsContas(){
        return contaBancariaRepository.findAll();
    }

    public Optional<ContaBancariaModel> buscarId(Long codigo){
        return contaBancariaRepository.findById(codigo);
    }

    public void deletar(Long codigo){
        contaBancariaRepository.deleteById(codigo);
    }

    public ContaBancariaModel cadastrarConta(ContaBancariaModel contaBancariaModel, ContaBancariaFactory contaBancariaFactory){

        contaBancariaModel.getCodigo();
        contaBancariaModel.getNumeroDaConta();
        contaBancariaModel.getAgencia();
        contaBancariaModel.getNomeDoUsuario();
        contaBancariaModel.getTipoDeServico();
        contaBancariaModel.getValorSaqueDeposito();
        BigDecimal resultado = contaBancariaFactory.getCalculoContaBancaria(contaBancariaModel.getTipoDeServico()).calcularValorDaConta(contaBancariaModel.getValorAtualDaConta(),contaBancariaModel.getValorSaqueDeposito());
        contaBancariaModel.setValorFinal(resultado);
        return contaBancariaRepository.save(contaBancariaModel);
    }
}
