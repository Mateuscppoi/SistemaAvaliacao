package br.com.db1.model;

import model.Avaliacao;
import org.junit.Test;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class TesteAvaliacaoControler {

    @Test
    public void InsereAvaliacao() {
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("db1start");
        EntityManager manager = factory.createEntityManager();

        Avaliacao avaliacao = new Avaliacao();
        avaliacao.setLinkProva("teste@1234.com");
        avaliacao.setParecer("Aprovado para master");
        avaliacao.setPontosFortes("TUDO");
        avaliacao.setPontosMelhorar("NADA");
        avaliacao.setCorrigida(true);
        avaliacao.setStatus_ava("PENDENTE");
        manager.getTransaction().begin();
        manager.persist(avaliacao);
        manager.getTransaction().commit();

        factory.close();
    }
}
