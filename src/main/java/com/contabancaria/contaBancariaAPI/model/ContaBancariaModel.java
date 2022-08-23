package com.contabancaria.contaBancariaAPI.model;

import lombok.*;

import javax.persistence.*;
import java.math.BigDecimal;

@Data
@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "contabancaria")
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

    private BigDecimal valorSaqueDeposito;

}
