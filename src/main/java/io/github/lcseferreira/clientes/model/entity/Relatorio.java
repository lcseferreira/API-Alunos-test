package io.github.lcseferreira.clientes.model.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data // ToString, EqualsAndHashCode, Getter, Setter, RequiredArgsConstructor
@NoArgsConstructor // Constructor sem argumentos
@AllArgsConstructor // Constructor de todas propriedade
@Entity
public class Relatorio {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "resumo_aluno", columnDefinition = "TEXT")
    private String resumoAluno;

    @Column(name = "outras_infos", columnDefinition = "TEXT")
    private String outrasInfos;

    @Column(name = "relatorio_medico", columnDefinition = "TEXT")
    private String relatorioMedico;

    @Column(name = "relatorio_pedagogico", columnDefinition = "TEXT")
    private String relatorioPedagogico;
}
