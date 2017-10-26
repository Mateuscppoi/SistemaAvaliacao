package dao;

import model.Linguagem;

import javax.inject.Inject;
import javax.inject.Named;
import javax.persistence.EntityManager;
import java.util.List;

@Named
public class LinguagemDAO {

    @Inject
    private EntityManager manager;

    public List<Linguagem> showLinguaguem() {
        return manager.createQuery("select l from Linguagem l ").getResultList();
    }
}
