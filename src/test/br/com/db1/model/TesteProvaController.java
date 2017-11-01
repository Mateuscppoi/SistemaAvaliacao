package br.com.db1.model;

import model.Candidato;
import model.CriteriosProva;
import model.Prova;
import org.junit.Test;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TesteProvaController {

    @Test
    public void insereProva() {
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("db1start");
        EntityManager manager = factory.createEntityManager();

        Prova prova = new Prova();
        prova.setCandidato_id(2);
        prova.setCriteriosProva(3);
        Date data  = new Date();
        manager.getTransaction().begin();
        manager.persist(prova);
        manager.getTransaction().commit();

        factory.close();
    }
}
