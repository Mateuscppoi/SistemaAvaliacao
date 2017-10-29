package model;

import javax.persistence.*;

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

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "especialidade", nullable = false)
    private Linguagem especialidade;

    @Column
    private Boolean avaliador;

    @Column
    private Boolean administrador;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "funcionario")
    private List<Avaliacao> avaliacao;

    @Column
    private Integer qtd_provas;

    @Column
    private Boolean ativo;

    public Integer getQtd_provas() {
        return qtd_provas;
    }

    public void setQtd_provas(Integer qtd_provas) {
        this.qtd_provas = qtd_provas;
    }

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

    public Linguagem getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(Linguagem especialidade) {
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

    public Boolean getAtivo() {
        return ativo;
    }

    public void setAtivo(Boolean ativo) {
        this.ativo = ativo;
    }

    public List<Avaliacao> getAvaliacao() {
        return avaliacao;
    }

    public void setAvaliacao(List<Avaliacao> avaliacao) {
        this.avaliacao = avaliacao;
    }
}
