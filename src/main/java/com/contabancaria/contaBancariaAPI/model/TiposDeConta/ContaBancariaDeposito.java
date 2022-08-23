package com.contabancaria.contaBancariaAPI.model.TiposDeConta;

import com.contabancaria.contaBancariaAPI.model.ContaBancariaModel;
import com.contabancaria.contaBancariaAPI.model.TiposDeConta.CalculoContaBancaria;

import java.math.BigDecimal;

public class ContaBancariaDeposito implements CalculoContaBancaria {
    @Override
    public BigDecimal calcularValorDaConta(BigDecimal valorAtualDaConta, BigDecimal valorDoDeposito) {
        BigDecimal valorASerAcrescido = valorAtualDaConta.add(valorDoDeposito);
        return valorASerAcrescido;
    }

}
