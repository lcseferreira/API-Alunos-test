package io.github.lcseferreira.clientes.model.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;

@Data // ToString, EqualsAndHashCode, Getter, Setter, RequiredArgsConstructor
@NoArgsConstructor // Constructor sem argumentos
@AllArgsConstructor // Constructor de todas propriedade
public class Escola {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "nome", nullable = false, length = 150)
    @NotEmpty(message = "Campo 'Nome da escola' é obrigatório")
    private String nome;

    @Column(name = "serie_escolar", length = 40)
    private String serieEscolar;

    @Column(name = "periodo_escolar", length = 40)
    private String periodoEscolar;

    @OneToOne
    @JoinColumn(name = "endereco_id")
    private Endereco endereco;
}
