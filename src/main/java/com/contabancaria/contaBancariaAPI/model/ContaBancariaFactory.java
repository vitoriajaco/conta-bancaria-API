package com.contabancaria.contaBancariaAPI.model;

import com.contabancaria.contaBancariaAPI.model.TiposDeConta.CalculoContaBancaria;
import com.contabancaria.contaBancariaAPI.model.TiposDeConta.ContaBancariaDeposito;
import com.contabancaria.contaBancariaAPI.model.TiposDeConta.ContaBancariaSaque;

public class ContaBancariaFactory {

    public CalculoContaBancaria getCalculoContaBancaria(String status){
        if (status.equalsIgnoreCase("deposito")){
            return new ContaBancariaDeposito();

        } else if (status.equalsIgnoreCase("saque")) {
            return new ContaBancariaSaque();

        }
        return null;
    }
}
