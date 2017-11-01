package controller;

import dao.FuncionarioDAO;
import dao.Transactional;
import dto.funcionarios.DTOFuncionarioDelete;
import dto.funcionarios.DTOFuncionarioInsert;
import dto.funcionarios.DTOFuncionarioUpdate;

import model.Avaliacao;
import model.Funcionario;
//import model.Linguagem;
import javax.annotation.PostConstruct;
import javax.enterprise.context.ApplicationScoped;
import javax.faces.bean.ManagedBean;
import javax.inject.Inject;
import javax.inject.Named;
import java.util.ArrayList;
import java.util.List;

@ManagedBean
@ApplicationScoped
@Named
public class FuncionarioController {

    @Inject
    private FuncionarioDAO dao;

    private String nome;
    private String email;
    private String senha;
    private String linguagem;
    //private Linguagem linguagemSelecionado;
    private Boolean avaliador;
    private Boolean administrador;
    private List<Avaliacao> avaliacao;
    private Boolean ativo;
    private List<Funcionario> funcionarios;

    public FuncionarioController() {
        funcionarios = new ArrayList<Funcionario>();
    }

    public FuncionarioDAO getDao() {
        return dao;
    }

    public void setDao(FuncionarioDAO dao) {
        this.dao = dao;
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

//    public Linguagem getLinguagemSelecionado() {
//        return linguagemSelecionado;
//    }
//
//    public void setLinguagemSelecionado(Linguagem linguagemSelecionado) {
//        this.linguagemSelecionado = linguagemSelecionado;
//    }

    public Boolean getAvaliador() {
        return avaliador;
    }

    public String getLinguagem() {
        return linguagem;
    }

    public void setLinguagem(String linguagem) {
        this.linguagem = linguagem;
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

    public List<Funcionario> getFuncionarios() {
        return funcionarios;
    }

    public void setFuncionarios(List<Funcionario> funcionarios) {
        this.funcionarios = funcionarios;
    }

    @PostConstruct
    public void showFuncionario() {
        funcionarios.addAll(dao.showFuncionarios());
    }

    public String deleteFuncionario() {
        DTOFuncionarioDelete funcionario = new DTOFuncionarioDelete(false, nome);
        return dao.deleteFuncionario(funcionario);
    }

    public String updateFuncionario() {
        DTOFuncionarioUpdate funcionario = new DTOFuncionarioUpdate(nome,email,senha);
        return dao.updateFuncionario(funcionario);
    }

    public String novoFuncionario() {
        DTOFuncionarioInsert funcionario = new DTOFuncionarioInsert(nome,email,senha,linguagem,avaliador,administrador,ativo);
        return dao.novoFuncionario(funcionario);
    }
}