package controller;

import dao.FuncionarioDAO;
import dao.ProvaDAO;
import dto.prova.DTOProvaInsert;
import model.Candidato;
import model.CriteriosProva;
import model.Linguagem;
import model.Prova;

import javax.faces.bean.ManagedBean;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.Calendar;
import java.util.Date;


@ManagedBean
public class ProvaController {

    @Inject
    private ProvaDAO dao;

    private Candidato candidato;
    private Integer id;
    private String link_prova;
    private CriteriosProva criteriosProva;
    private Linguagem linguagem;
    private String prazo;
    private Calendar data_solic_ava;
    private String status;


//   private Avaliacao avaliacao;


    public String getPrazo() {
        return prazo;
    }

    public void setPrazo(String prazo) {
        this.prazo = prazo;
    }

    public Candidato getCandidato() {
        return candidato;
    }

    public void setCandidato(Candidato candidato) {
        this.candidato = candidato;
    }

    public CriteriosProva getCriteriosProva() {
        return criteriosProva;
    }

    public void setCriteriosProva(CriteriosProva criteriosProva) {
        this.criteriosProva = criteriosProva;
    }

    public Linguagem getLinguagem() {
        return linguagem;
    }

    public void setLinguagem(Linguagem linguagem) {
        this.linguagem = linguagem;
    }

    public void setData_solic_ava(Calendar data_solic_ava) {
        this.data_solic_ava = data_solic_ava;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Integer getId() {
        return id;
    }

    public String getLink_prova() {
        return link_prova;
    }

    public void setLink_prova(String link_prova) {
        this.link_prova = link_prova;
    }

    public Calendar getData_solic_ava() {
        return data_solic_ava;
    }

    public void setId(Integer id) {
        this.id = id;
    }
    //   public Avaliacao getAvaliacao() {
 //       return avaliacao;
 //   }

 //   public void setAvaliacao(Avaliacao avaliacao) {
 //       this.avaliacao = avaliacao;
 //   }

    public String insereProva() {
        DTOProvaInsert prova = new DTOProvaInsert(link_prova,prazo,data_solic_ava,candidato,linguagem);
        return dao.novoProva(prova);
    }
}
