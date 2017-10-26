package dao;

import dto.candidato.DTOCandidatoInsert;
import dto.candidato.DTOCandidatoUpdate;
import model.Candidato;
import model.Linguagem;

import javax.inject.Inject;
import javax.inject.Named;
import javax.persistence.EntityManager;
import java.util.List;

@Named
public class CandidatoDAO {

    @Inject
    private EntityManager manager;

    public List<Candidato> showCandidato () {
        return manager.createQuery("select f from Candidato f where nome = ").getResultList();
    }

    public String novoCandidato(dto.candidato.DTOCandidatoInsert request){
        Candidato candidato = new Candidato();

        candidato.setNome(request.getNome());
        candidato.setEmail(request.getEmail());
        candidato.setTelefone(request.getTelefone());
        candidato.setEmail(request.getEmail());
        candidato.setRede_social(request.getRede_social());
        candidato.setContratado(true);


        manager.getTransaction().begin();
        manager.persist(candidato);
        manager.getTransaction().commit();

        return "Realizado com sucesso";
    }

    public String UpdateCandidato (DTOCandidatoUpdate request) {

        return "Realizado com sucesso";
    }
}
