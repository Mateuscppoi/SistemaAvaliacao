package controller;

import dao.CandidatoDAO;
import dto.candidato.DTOCandidatoInsert;
import model.Candidato;
import model.Prova;

import javax.annotation.PostConstruct;
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
    private Long id;
    private Integer prova_id;
    private List<Candidato> candidatos;
    //private List<Prova> prova;



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

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getProva_id() {
        return prova_id;
    }

    public void setProva_id(Integer prova_id) {
        this.prova_id = prova_id;
    }

    public List<Candidato> getCandidatos() {
        return candidatos;
    }

    public void setCandidatos(List<Candidato> candidatos) {
        this.candidatos = candidatos;
    }

    public CandidatoDAO getDao() {
        return dao;
    }

    public void setDao(CandidatoDAO dao) {
        this.dao = dao;
    }

    /*    public List<Prova> getProva() {
        return prova;
    }

    public void setProva(List<Prova> prova) {
        this.prova = prova;
    }*/
 /*   @PostConstruct
    public void showCandidato() {
        candidatos.addAll(dao.showCandidato());
    }*//*   @PostConstruct
    public void showCandidato() {
        candidatos.addAll(dao.showCandidato());
    }*/

    public String insereCandidato() {
        DTOCandidatoInsert candidato = new DTOCandidatoInsert(nome,email,telefone,rede_social,contratado = false);
        return dao.insertCandidato(candidato);
    }

}
