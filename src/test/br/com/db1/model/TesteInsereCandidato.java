package br.com.db1.model;

import model.Candidato;
import org.junit.Test;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class TesteInsereCandidato {

    @Test
    public void InsereCanditado() {
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("db1start");
        EntityManager manager = factory.createEntityManager();

        Candidato candidato = new Candidato();
        candidato.setNome("Mateus");
        candidato.setEmail("mateus.cardozo@db1.com.br");
        candidato.setTelefone("997322443");
        candidato.setRede_social("Não possui");
        candidato.setContratado(true);
        manager.getTransaction().begin();
        manager.persist(candidato);
        manager.getTransaction().commit();

        factory.close();
    }
}
