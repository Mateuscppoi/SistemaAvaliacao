package br.com.db1.model;

import model.Funcionario;
import model.Linguagem;
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
        funcionario.setNome("Toico");
        funcionario.setEmail("toico.rules@db1.com.br");
        funcionario.setSenha("eaecambada");
        funcionario.setAvaliador(false);
        funcionario.setAdministrador(true);
        funcionario.setEspecialidade(manager.find(Linguagem.class, 3L));
        manager.getTransaction().begin();
        manager.persist(funcionario);
        manager.getTransaction().commit();

        factory.close();
    }
}
