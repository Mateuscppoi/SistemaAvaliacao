package dao;

import dto.criterios.DTOCriteriosDelete;
import dto.criterios.DTOCriteriosInsert;
import dto.criterios.DTOCriteriosUpdate;
import model.CriteriosProva;
import model.Linguagem;

import javax.inject.Inject;
import javax.inject.Named;
import javax.persistence.EntityManager;
import javax.persistence.Query;
import java.util.List;

@Named
public class CriteriosDAO {
    @Inject
    private EntityManager manager;

    public List<CriteriosProva> showCriterios (Integer id) {
       Query query = manager.createQuery("select c from CriteriosProva c where linguagem_id = :pId");
       query.setParameter("pId",id);
      return query.getResultList();
    }

    @Transactional
    public String novoCriterio(DTOCriteriosInsert request){
        CriteriosProva criteriosProva = new CriteriosProva();
        criteriosProva.setDescricao(request.getDescricao());
        criteriosProva.setCriteriosObrigatorios(request.getObrigatorio());
        criteriosProva.setLinguagem_id(request.getLinguagem());
        manager.persist(criteriosProva);

        return "Completado";
    }

  /*  @Transactional
    public String deleteCriterios(DTOCriteriosDelete request){
        CriteriosProva criteriosProva = getByName(request.getDescricao());
        try {
            manager.merge(criteriosProva);
        } catch (Exception e) {
            System.err.println(e.getMessage());
            return "Erro";
        }
        return "Completado";
    }

    @Transactional
    public String updateCriterios (DTOCriteriosUpdate request) {

        CriteriosProva criteriosProva = getByName(request.getDescricao());
        try {
            manager.merge(criteriosProva);
        } catch (Exception e) {
            System.err.println(e.getMessage());
            return "Erro";
        }

        return "Completado";
    }
    */

}