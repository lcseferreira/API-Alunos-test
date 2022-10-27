package io.github.lcseferreira.clientes.model.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.*;
import org.hibernate.validator.constraints.br.CPF;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import java.time.LocalDate;


@Data // ToString, EqualsAndHashCode, Getter, Setter, RequiredArgsConstructor
@NoArgsConstructor // Constructor sem argumentos
@AllArgsConstructor // Constructor de todas propriedades
@Builder
@Entity
public class Aluno {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "nome", nullable = false, length = 150)
    @NotEmpty(message = "Campo Nome é obrigatório")
    private String nome;

    @Column(name = "cpf", length = 11, unique = true)
    @CPF(message = "CPF inválido")
    private String cpf;

    @Column(name = "ra", nullable = false, length = 10)
    @NotEmpty(message = "Campo RA é obrigatório")
    private String ra;

    @Column(name = "data_nascimento")
    @JsonFormat(pattern = "dd/MM/yyyy")
    private LocalDate dataNascimento;

    @Column(name = "sexo")
    @NotEmpty(message = "Campo Sexo é obrigatório")
    private String sexo;

    @Column(name = "deficiencia", length = 150)
    private String deficiencia;

    @Column(name = "necessita_cuidador", length = 10)
    private String necessitaCuidador;

    @OneToOne
    @JoinColumn(name = "responsavel_id")
    private Responsavel responsavel;

    @OneToOne
    @JoinColumn(name = "endereco_id")
    private Endereco endereco;

    @OneToOne
    @JoinColumn(name = "relatorio_id")
    private Relatorio relatorio;

    @Column(name = "data_cadastro", updatable = false)
    @JsonFormat(pattern = "dd/MM/yyyy")
    private LocalDate dataCadastro;

    @PrePersist
    public void prePersist() {
        setDataCadastro(LocalDate.now());
    }
}

