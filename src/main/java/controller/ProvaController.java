package controller;

import dao.FuncionarioDAO;
import dao.ProvaDAO;
import dto.prova.DTOProvaInsert;
import model.Candidato;
import model.CriteriosProva;
import model.Linguagem;
import model.Prova;

import javax.enterprise.context.ApplicationScoped;
import javax.faces.bean.ManagedBean;
import javax.inject.Inject;
import javax.inject.Named;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
<<<<<<< HEAD
=======

>>>>>>> 9c05f180a5289cf58a46ec5b0e4301637dc4f7d0

@ManagedBean
@ApplicationScoped
@Named
public class ProvaController {

    @Inject
    private ProvaDAO dao;

    private List<Candidato> candidato;
    private Integer id;
    private String link_prova;
    private List<CriteriosProva> criteriosProva;
<<<<<<< HEAD
    private List<Linguagem> linguagem;
=======
    private Linguagem linguagem;
>>>>>>> 9c05f180a5289cf58a46ec5b0e4301637dc4f7d0
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

<<<<<<< HEAD
    public List<Linguagem> getLinguagem() {
        return linguagem;
    }

    public void setLinguagem(List<Linguagem> linguagem) {
        this.linguagem = linguagem;
=======
    public ProvaDAO getDao() {
        return dao;
    }

    public void setDao(ProvaDAO dao) {
        this.dao = dao;
    }

    public List<Candidato> getCandidato() {
        return candidato;
    }

    public void setCandidato(List<Candidato> candidato) {
        this.candidato = candidato;
>>>>>>> 9c05f180a5289cf58a46ec5b0e4301637dc4f7d0
    }

    public List<CriteriosProva> getCriteriosProva() {
        return criteriosProva;
    }

    public void setCriteriosProva(List<CriteriosProva> criteriosProva) {
        this.criteriosProva = criteriosProva;
    }

    public void setCandidato(List<Candidato> candidato) {
        this.candidato = candidato;
    }

    public List<Candidato> getCandidato() {
        return candidato;
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
        DTOProvaInsert prova = new DTOProvaInsert(link_prova,prazo,data_solic_ava,candidato,criteriosProva);
        return dao.novoProva(prova);
    }
}
