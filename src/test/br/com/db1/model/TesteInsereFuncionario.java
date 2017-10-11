package br.com.db1.model;

import model.Funcionario;
import model.TipoProva;
import org.junit.Test;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class TesteInsereFuncionario {

    @Test
    public void InsereFuncionario() {
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("db1start");
        EntityManager manager = factory.createEntityManager();

        Funcionario funcionario = new Funcionario();
        funcionario.setNome("Tamara");
        funcionario.setEmail("tamara.rules@db1.com.br");
        funcionario.setSenha("aieunaosei");
        funcionario.setAvaliador(false);
        funcionario.setAdministrador(true);
        manager.getTransaction().begin();
        manager.persist(funcionario);
        manager.getTransaction().commit();

        factory.close();
    }
}
