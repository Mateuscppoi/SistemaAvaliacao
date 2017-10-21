package controller;

import dao.FuncionarioDAO;
import dto.funcionarios.DTOFuncionarioInsert;
import model.Avaliacao;
import model.Linguagem;

import javax.faces.bean.ManagedBean;
import javax.inject.Inject;
import java.util.List;

@ManagedBean
public class FuncionarioController {

    @Inject
    private FuncionarioDAO dao;

    private String nome;
    private String email;
    private String senha;
    private List<Linguagem> especialidade;
    private Boolean avaliador;
    private Boolean administrador;
    private List<Avaliacao> avaliacao;
    private Boolean ativo;

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

    public List<Linguagem> getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(List<Linguagem> especialidade) {
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

    public Boolean getAtivo() {
        return ativo;
    }

    public void setAtivo(Boolean ativo) {
        this.ativo = ativo;
    }

    public String retornaFuncionario() {
        DTOFuncionarioInsert funcionario = new DTOFuncionarioInsert(nome,email, senha, especialidade, avaliador, administrador, avaliacao, ativo);
        return dao.novoFuncionario(funcionario);
    }
}
