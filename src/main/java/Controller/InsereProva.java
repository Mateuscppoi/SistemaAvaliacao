package Controller;

import model.Avaliacao;
import model.Candidato;
import model.CriteriosProva;
import model.Prova;

import javax.faces.bean.ManagedBean;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.Calendar;
import java.util.Date;


@ManagedBean
public class InsereProva {

    private Candidato candidato;
    private String import_avaliacao;
    private CriteriosProva criteriosProva;
    private String linguagem;
    private Integer prazo;
    private Date data_solic_ava;
    private Avaliacao avaliacao;

    public Candidato getCandidato() {
        return candidato;
    }

    public void setCandidato(Candidato candidato) {
        this.candidato = candidato;
    }

    public String getImport_avaliacao() {
        return import_avaliacao;
    }

    public void setImport_avaliacao(String import_avaliacao) {
        this.import_avaliacao = import_avaliacao;
    }

    public CriteriosProva getCriteriosProva() {
        return criteriosProva;
    }

    public void setCriteriosProva(CriteriosProva criteriosProva) {
        this.criteriosProva = criteriosProva;
    }

    public String getLinguagem() {
        return linguagem;
    }

    public void setLinguagem(String linguagem) {
        this.linguagem = linguagem;
    }

    public Integer getPrazo() {
        return prazo;
    }

    public void setPrazo(Integer prazo) {
        this.prazo = prazo;
    }

    public void setData_solic_ava(Date data_solic_ava) {
        this.data_solic_ava = data_solic_ava;
    }

    public Avaliacao getAvaliacao() {
        return avaliacao;
    }

    public void setAvaliacao(Avaliacao avaliacao) {
        this.avaliacao = avaliacao;
    }

    public String retornaProva() {

        EntityManagerFactory factory = Persistence.createEntityManagerFactory("db1start");
        EntityManager manager = factory.createEntityManager();

        Prova prova = new Prova();
        prova.setCandidato(manager.find(Candidato.class, candidato.getId_candidato()));
        prova.setImport_avaliacao("www.seilaoq.com.br");
        prova.setCriteriosProva(manager.find(CriteriosProva.class, getLinguagem()));


        return"Completado";
    }
}
