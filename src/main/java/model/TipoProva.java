package model;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "tipoprova", schema = "sistemadeavaliacao")
public class TipoProva {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String descricao;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "tipoprova")
    private List<CriteriosProva> criteriosProvas;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "especialidade", nullable = false)
    private Funcionario funcionario;


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

    public Funcionario getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(Funcionario funcionario) {
        this.funcionario = funcionario;
    }
}



