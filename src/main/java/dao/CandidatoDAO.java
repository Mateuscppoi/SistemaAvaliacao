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

    @Transactional
    public String insertCandidato(DTOCandidatoInsert request){
        Candidato candidato = new Candidato();
        candidato.setNome(request.getNome());
        candidato.setContratado(false);
        candidato.setRede_social(request.getRede_social());
        candidato.setTelefone(request.getTelefone());
        candidato.setEmail(request.getEmail());
        manager.persist(candidato);
        return "Realizado com sucesso";
    }

    public String UpdateCandidato (DTOCandidatoUpdate request) {

        return "Realizado com sucesso";
    }
}
