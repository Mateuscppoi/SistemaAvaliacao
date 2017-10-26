package controller;

import dao.LinguagemDAO;
import model.Linguagem;

import javax.annotation.PostConstruct;
import javax.enterprise.context.ApplicationScoped;
import javax.faces.bean.ManagedBean;
import javax.inject.Inject;
import javax.inject.Named;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.ArrayList;
import java.util.List;

@ManagedBean
@ApplicationScoped
@Named
public class LinguagemController {

    @Inject
    private LinguagemDAO dao;

    private String descricao;

    private List<Linguagem> linguagem;

    public LinguagemController() {
        linguagem = new ArrayList<Linguagem>();
    }

    public List<Linguagem> getLinguagem() {
        return linguagem;
    }

    public void setLinguagem(List<Linguagem> linguagem) {
        this.linguagem = linguagem;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String retornaTipo () {
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("db1start");
        EntityManager manager = factory.createEntityManager();

        Linguagem linguagem = new Linguagem();
        linguagem.setDescricao(descricao);
        manager.getTransaction().begin();
        manager.persist(linguagem);
        manager.getTransaction().commit();

        factory.close();

        return "Completado";
    }

    @PostConstruct
    public void showLinguagem(){
        linguagem.addAll(dao.showLinguaguem());
    }
}
