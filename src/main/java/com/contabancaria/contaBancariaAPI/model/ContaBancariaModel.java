package com.contabancaria.contaBancariaAPI.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.math.BigDecimal;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "Conta Bancaria")
public class ContaBancariaModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long codigo;

    @Column
    private String numeroDaConta;

    @Column
    private String agencia;

    @Column
    private String nomeDoUsuario;

    @Column
    private BigDecimal valorAtualDaConta;

    @Column
    private BigDecimal valorFinal;

    @Column
    private String tipoDeServico;

}
