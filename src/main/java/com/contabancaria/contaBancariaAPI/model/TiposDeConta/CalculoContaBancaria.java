package com.contabancaria.contaBancariaAPI.model.TiposDeConta;

import com.contabancaria.contaBancariaAPI.model.ContaBancariaModel;

import java.math.BigDecimal;

public interface CalculoContaBancaria {

    public BigDecimal calcularValorDaConta(BigDecimal valorAtualDaConta, BigDecimal valorFinal);

    BigDecimal calcularValorDaConta(ContaBancariaModel contaBancariaModel);
}
