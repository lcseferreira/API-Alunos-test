package io.github.lcseferreira.clientes.model.entity;

import lombok.Data;

import javax.persistence.*;
import java.math.BigDecimal;

// ENTIDADE DO BANCO DE DADOS
@Entity
// Getters, Setters, hashCode, Equals ATRAVÉS DO LOMBOK
@Data
public class Servico {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(nullable = false, length = 255)
    private String descricao;

    // RELACIONAMENTO UM PARA MUITOS
    @OneToMany
    @JoinColumn(name = "id_cliente")
    private Cliente cliente;

    @Column
    private BigDecimal valor;
}
