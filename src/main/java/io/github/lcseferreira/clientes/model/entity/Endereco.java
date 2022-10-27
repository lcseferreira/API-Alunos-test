package io.github.lcseferreira.clientes.model.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotEmpty;

@Data // ToString, EqualsAndHashCode, Getter, Setter, RequiredArgsConstructor
@NoArgsConstructor // Constructor sem argumentos
@AllArgsConstructor // Constructor de todas propriedade
public class Endereco {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "logradouro", length = 150)
    private String logradouro;

    @Column(name = "numero")
    private int numero;

    @Column(name = "bairro", length = 50)
    private String bairro;

    @Column(name = "cidade", length = 50)
    private String cidade;

    @Column(name = "estado", length = 2)
    private String estado;

    @Column(name = "pais", length = 10)
    private String pais;

    @Column(name = "cep", length = 10)
    private String cep;
}
