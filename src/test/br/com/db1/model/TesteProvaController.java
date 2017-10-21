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
        prova.setCandidato(manager.find(Candidato.class, 4L));
        prova.setImport_prova("");
        prova.setCriteriosProva(manager.find(CriteriosProva.class, 2L));
        Date data  = new Date();
        prova.setData_solic_ava(data);
        prova.setPrazo(40);
        manager.getTransaction().begin();
        manager.persist(prova);
        manager.getTransaction().commit();

        factory.close();
    }
}
