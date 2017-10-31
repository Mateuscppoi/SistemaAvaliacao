package model;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@Table(name = "linguagem", schema = "sistemadeavaliacao")
public class Linguagem implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String descricao;

    @Column
    private Integer criteriosProvas_id;

    @Column
    private Integer funcionario_id;

    /*@OneToMany(fetch = FetchType.LAZY, mappedBy = "linguagem")
    private List<CriteriosProva> criteriosProvas;*/

   /* @OneToMany(fetch = FetchType.LAZY, mappedBy = "especialidade")
    private List<Funcionario> funcionario;*/

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getCriteriosProvas_id() {
        return criteriosProvas_id;
    }

    public void setCriteriosProvas_id(Integer criteriosProvas_id) {
        this.criteriosProvas_id = criteriosProvas_id;
    }

    public Integer getFuncionario_id() {
        return funcionario_id;
    }

    public void setFuncionario_id(Integer funcionario_id) {
        this.funcionario_id = funcionario_id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

   /* public List<CriteriosProva> getCriteriosProvas() {
        return criteriosProvas;
    }

    public void setCriteriosProvas(List<CriteriosProva> criteriosProvas) {
        this.criteriosProvas = criteriosProvas;
    }*/

    /*public List<Funcionario> getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(List<Funcionario> funcionario) {
        this.funcionario = funcionario;
    }*/

}



