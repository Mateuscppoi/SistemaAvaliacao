package DAO;

import model.Funcionario;

import javax.inject.Inject;
import javax.inject.Named;
import javax.persistence.EntityManager;
import java.util.List;

@Named
public class MostraAvaliadores {

    @Inject
    private EntityManager manager;

    public List<Funcionario> showFuncionarios () {
        return manager.createQuery("select f from Funcionario f where avaliador = true ").getResultList();
    }

}
