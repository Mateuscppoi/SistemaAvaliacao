package model;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "funcionario", schema = "sistemadeavaliacao")
public class Funcionario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String nome;

    @Column
    private String email;

    @Column
    private String senha;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "funcionario" )
    private List<TipoProva> especialidade;

    @Column
    private Boolean avaliador;

    @Column
    private Boolean administrador;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "funcionario")
    private List<Avaliacao> avaliacao;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public List<TipoProva> getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(List<TipoProva> especialidade) {
        this.especialidade = especialidade;
    }


    public Boolean getAvaliador() {
        return avaliador;
    }

    public void setAvaliador(Boolean avaliador) {
        this.avaliador = avaliador;
    }

    public Boolean getAdministrador() {
        return administrador;
    }

    public void setAdministrador(Boolean administrador) {
        this.administrador = administrador;
    }

    public List<Avaliacao> getAvaliacao() {
        return avaliacao;
    }

    public void setAvaliacao(List<Avaliacao> avaliacao) {
        this.avaliacao = avaliacao;
    }
}
