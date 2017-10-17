package DAO;

import model.Linguagem;

import javax.faces.bean.ManagedBean;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

@ManagedBean
public class InsereLinguagem {

    private Linguagem linguagem;
    private String descricao;

    public Linguagem getLinguagem() {
        return linguagem;
    }

    public void setLinguagem(Linguagem linguagem) {
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
}
