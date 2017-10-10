package br.com.db1.model;

import model.CriteriosProva;
import model.TipoProva;
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
        criteriosProva.setTipoprova(manager.find(TipoProva.class, 1L));
        manager.getTransaction().begin();
        manager.persist(criteriosProva);
        manager.getTransaction().commit();

        factory.close();

    }

    @Test
    public void InsereTipoProva() {
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("db1start");
        EntityManager manager = factory.createEntityManager();

        TipoProva tipoProva= new TipoProva();
        tipoProva.setDescricao("Java");
        manager.getTransaction().begin();
        manager.persist(tipoProva);
        manager.getTransaction().commit();

        factory.close();

    }
}

