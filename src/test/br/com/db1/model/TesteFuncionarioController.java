package br.com.db1.model;

import model.Funcionario;
import model.Linguagem;
import org.junit.Test;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class TesteFuncionarioController {

    @Test
    public void InsereFuncionario() {
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("db1start");
        EntityManager manager = factory.createEntityManager();

        Funcionario funcionario = new Funcionario();
        funcionario.setNome("admin");
        funcionario.setEmail("admin");
        funcionario.setSenha("admin");
        funcionario.setAvaliador(false);
        funcionario.setAdministrador(true);
        funcionario.setAtivo(true);
        funcionario.setLinguagem("java");
        manager.getTransaction().begin();
        manager.persist(funcionario);
        manager.getTransaction().commit();

        factory.close();
    }
}
