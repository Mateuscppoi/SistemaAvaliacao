package model;

import javax.persistence.*;

@Entity
@Table(name = "linguagem", schema = "sistemadeavaliacao")
public class Linguagem implements Serializable{
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Linguagem linguagem = (Linguagem) o;

        if (id != null ? !id.equals(linguagem.id) : linguagem.id != null) return false;
        if (descricao != null ? !descricao.equals(linguagem.descricao) : linguagem.descricao != null) return false;
        if (criteriosProvas != null ? !criteriosProvas.equals(linguagem.criteriosProvas) : linguagem.criteriosProvas != null)
            return false;
        return funcionario != null ? funcionario.equals(linguagem.funcionario) : linguagem.funcionario == null;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (descricao != null ? descricao.hashCode() : 0);
        result = 31 * result + (criteriosProvas != null ? criteriosProvas.hashCode() : 0);
        result = 31 * result + (funcionario != null ? funcionario.hashCode() : 0);
        return result;
    }
}



