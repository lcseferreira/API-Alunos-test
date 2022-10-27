package io.github.lcseferreira.clientes.model.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.br.CPF;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;

@Data // ToString, EqualsAndHashCode, Getter, Setter, RequiredArgsConstructor
@NoArgsConstructor // Constructor sem argumentos
@AllArgsConstructor // Constructor de todas propriedade
public class Responsavel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "nome", nullable = false, length = 150)
    @NotEmpty(message = "Campo Nome é obrigatório")
    private String nome;

    @Column(name = "cpf", length = 11, unique = true)
    @CPF(message = "CPF inválido")
    private String cpf;

    @Column(name = "rg", length = 11, unique = true)
    private String rg;

    @Column(name = "contato1", length = 32)
    private String contato1;

    @Column(name = "contato2", length = 32)
    private String contato2;

    @OneToOne
    @JoinColumn(name = "endereco_id")
    private Endereco endereco;
}
