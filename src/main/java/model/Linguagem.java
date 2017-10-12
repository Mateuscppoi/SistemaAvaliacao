package model;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "linguagem", schema = "sistemadeavaliacao")
public class Linguagem {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String descricao;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "linguagem")
    private List<CriteriosProva> criteriosProvas;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "especialidade")
    private List<Funcionario> funcionario;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public List<CriteriosProva> getCriteriosProvas() {
        return criteriosProvas;
    }

    public void setCriteriosProvas(List<CriteriosProva> criteriosProvas) {
        this.criteriosProvas = criteriosProvas;
    }

    public List<Funcionario> getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(List<Funcionario> funcionario) {
        this.funcionario = funcionario;
    }
}



