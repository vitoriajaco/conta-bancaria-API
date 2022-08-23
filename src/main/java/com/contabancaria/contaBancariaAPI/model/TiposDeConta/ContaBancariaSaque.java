package com.contabancaria.contaBancariaAPI.model.TiposDeConta;

import com.contabancaria.contaBancariaAPI.model.ContaBancariaModel;
import com.contabancaria.contaBancariaAPI.model.TiposDeConta.CalculoContaBancaria;

import java.math.BigDecimal;

public class ContaBancariaSaque implements CalculoContaBancaria {

    @Override
    public BigDecimal calcularValorDaConta(BigDecimal valorAtualDaConta, BigDecimal valorDoSaque) {
        BigDecimal valorASerRetirado = valorAtualDaConta.subtract(valorDoSaque);
        return valorASerRetirado;
    }

    @Override
    public BigDecimal calcularValorDaConta(ContaBancariaModel contaBancariaModel) {
        return null;
    }
}
