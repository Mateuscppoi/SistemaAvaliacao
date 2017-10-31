package controller;

import dao.CandidatoDAO;
import dto.candidato.DTOCandidatoInsert;
import model.Candidato;
import model.Prova;

import javax.enterprise.context.ApplicationScoped;
import javax.faces.bean.ManagedBean;
import javax.inject.Inject;
import javax.inject.Named;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.List;

@ManagedBean
@ApplicationScoped
@Named
public class CandidatoController {

    @Inject
    private CandidatoDAO dao;

    private String nome;
    private String email;
    private String telefone;
    private String rede_social;
    private Boolean contratado;
    private List<Prova> prova;



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

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getRede_social() {
        return rede_social;
    }

    public void setRede_social(String rede_social) {
        this.rede_social = rede_social;
    }

    public Boolean getContratado() {
        return contratado;
    }

    public void setContratado(Boolean contratado) {
        this.contratado = contratado;
    }

    public List<Prova> getProva() {
        return prova;
    }

    public void setProva(List<Prova> prova) {
        this.prova = prova;
    }

    public String insereCandidato() {
        DTOCandidatoInsert candidato = new DTOCandidatoInsert(nome,email,telefone,rede_social,contratado = false);
        return dao.insertCandidato(candidato);
    }
}
