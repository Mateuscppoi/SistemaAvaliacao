package dao;

import dto.prova.DTOProvaDelete;
import dto.prova.DTOProvaInsert;
import dto.prova.DTOProvaUpdate;
import model.Prova;
import javax.inject.Inject;
import javax.inject.Named;
import javax.persistence.EntityManager;
import javax.persistence.Query;

@Named
public class ProvaDAO {

    @Inject
    private EntityManager manager;

    public List<Prova> showProva () {
        return manager.createQuery("select p from Prova p").getResultList();
    }

    public Prova getById(Long id) {
        Query query = manager.createQuery("select p from Prova p where id = :pId");
        query.setParameter("pId",id);

        return (Prova) query.getSingleResult();
    }

    @Transactional
    public String novoProva(DTOProvaInsert request){
        Prova prova = new Prova();

        prova.setLink_prova(request.getLink_prova());
        prova.setPrazo(request.getPrazo());
        prova.setData_solic_ava(Calendar.getInstance());
        prova.setCandidato(request.getCandidato().get(0));
        prova.setCriteriosProva(request.getCriteriosProva());

        manager.persist(prova);

        return "Completado";
    }

    @Transactional
    public String DeleteProva(DTOProvaDelete request){
        Prova prova = getById(request.getId());
                try {
            manager.merge(prova);
        } catch (Exception e) {
            System.err.println(e.getMessage());
            return "Erro";
        }
        return "Completado";
    }

    @Transactional
    public String updateProva (DTOProvaUpdate request) {
        Prova prova = getById(request.getId());
        prova.setLink_prova(request.getLink_prova());
        prova.setPrazo(request.getPrazo());
        try {
            manager.merge(prova);
        } catch (Exception e) {
            System.err.println(e.getMessage());
            return "Erro";
        }

        return "Completado";
    }

}
