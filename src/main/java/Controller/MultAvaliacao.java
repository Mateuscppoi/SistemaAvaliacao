package Controller;

import DAO.MostraAvaliadores;
import model.Funcionario;


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
public class MultAvaliacao {

    @Inject
    private MostraAvaliadores mostra;

    private List<Funcionario> funcionarios;

    private String nome;
    private Integer qtd_provas;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getQtd_provas() {
        return qtd_provas;
    }

    public void setQtd_provas(Integer qtd_provas) {
        this.qtd_provas = qtd_provas;
    }

    public List<Funcionario> getFuncionarios() {
        return funcionarios;
    }

    public MostraAvaliadores getMostra() {
        return mostra;
    }

    @PostConstruct
    public void showFuncionario() {
        funcionarios = new ArrayList<Funcionario>();
        funcionarios.addAll(mostra.showFuncionarios());
    }
}
