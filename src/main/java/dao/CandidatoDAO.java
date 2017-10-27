package dao;

import dto.candidato.DTOCandidatoInsert;
import dto.candidato.DTOCandidatoUpdate;
import model.Candidato;
import model.Linguagem;

import javax.inject.Inject;
import javax.inject.Named;
import javax.persistence.EntityManager;
import javax.persistence.Query;
import java.util.List;

@Named
public class CandidatoDAO {

    @Inject
    private EntityManager manager;

    public List<Candidato> showCandidato () {
        return manager.createQuery("select c from Candidato c").getResultList();
    }

    public Candidato getById(Long id) {
        Query query = manager.createQuery("select c from Candidato c where id = :pId");
        query.setParameter("pId",id);

        return (Candidato) query.getSingleResult();
    }

    public Linguagem getByName(String nome) {
        Query query = manager.createQuery("select f from Ca f where nome like :pNome");
        query.setParameter("pNome","%"+nome+"%");

        return (Linguagem) query.getSingleResult();
    }

    public String novoCandidato(DTOCandidatoInsert request){


        return "Realizado com sucesso";
    }

    public String UpdateCandidato (DTOCandidatoUpdate request) {

        return "Realizado com sucesso";
    }
}
