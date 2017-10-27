package controller;

import dao.CriteriosDAO;
import model.CriteriosProva;
import model.Linguagem;

import javax.enterprise.context.ApplicationScoped;
import javax.faces.bean.ManagedBean;
import javax.inject.Named;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

@ManagedBean
@ApplicationScoped
@Named
public class CriteriosController {

    private CriteriosDAO dao;
    private String descricao;
    private Boolean criteriosObrigatorios;
    private Linguagem linguagem;

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Boolean getCriteriosObrigatorios() {
        return criteriosObrigatorios;
    }

    public void setCriteriosObrigatorios(Boolean criteriosObrigatorios) {
        this.criteriosObrigatorios = criteriosObrigatorios;
    }

    public Linguagem getLinguagem() {
        return linguagem;
    }

    public void setLinguagem(Linguagem linguagem) {
        this.linguagem = linguagem;
    }

    public String retornaCriterios() {

        EntityManagerFactory factory = Persistence.createEntityManagerFactory("db1start");
        EntityManager manager = factory.createEntityManager();


        CriteriosProva criteriosProva = new CriteriosProva();
        criteriosProva.setDescricao(descricao);
        criteriosProva.setCriteriosObrigatorios(criteriosObrigatorios);
        criteriosProva.setLinguagem(getLinguagem());
        manager.getTransaction().begin();
        manager.persist(criteriosProva);
        manager.getTransaction().commit();

        return "Completado";
    }
}
