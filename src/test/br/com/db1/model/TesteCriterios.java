package br.com.db1.model;

import model.CriteriosProva;
import model.Linguagem;
import org.junit.Test;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class TesteCriterios {

    @Test
    public void metodoTest() {
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("db1start");
        EntityManager manager = factory.createEntityManager();

        CriteriosProva criteriosProva = new CriteriosProva();
        criteriosProva.setDescricao("Sprint");
        criteriosProva.setCriteriosObrigatorios(true);
        criteriosProva.setLinguagem(manager.find(Linguagem.class, 2L));
        manager.getTransaction().begin();
        manager.persist(criteriosProva);
        manager.getTransaction().commit();

        factory.close();

    }

    @Test
    public void InsereTipoProva() {
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("db1start");
        EntityManager manager = factory.createEntityManager();

        Linguagem linguagem = new Linguagem();
        linguagem.setDescricao("C#");
        manager.getTransaction().begin();
        manager.persist(linguagem);
        manager.getTransaction().commit();

        factory.close();

    }
}

