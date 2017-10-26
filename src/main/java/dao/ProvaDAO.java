package dao;

import dto.prova.DTOProvaDelete;
import dto.prova.DTOProvaInsert;
import dto.prova.DTOProvaUpdate;
import model.Funcionario;
import model.Linguagem;
import model.Prova;

import javax.inject.Inject;
import javax.inject.Named;
import javax.persistence.EntityManager;
import javax.persistence.Query;
import java.util.List;

@Named
public class ProvaDAO {

    @Inject
    private EntityManager manager;

    public List<Prova> showProva () {
        return manager.createQuery("select f from Prova f where  = true ").getResultList();
    }

    public Prova getById(Long id) {
        Query query = manager.createQuery("select f from Prova f where id = :pId");
        query.setParameter("pId",id);

        return (Prova) query.getSingleResult();
    }

    public Prova getByName(String nome) {
        Query query = manager.createQuery("select f from Prova f where  like :");
        query.setParameter("pNome","%"+nome+"%");

        return (Prova) query.getSingleResult();
    }

    @Transactional
    public String novoProva(DTOProvaInsert request){
        Prova prova = new Prova();
     /*   prova.setId_prova(request.getLink_prova());
        prova.setPrazo(request.getPrazo());
        prova.setData_solic_ava(request.getData_solic_ava());
        prova.setCandidato(request.getCandidato());*/
        manager.persist(prova);

        return "Completado";
    }

    @Transactional
    public String DeleteProva(DTOProvaDelete request){
        Prova prova = getByName(request.getLink_prova());
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

        Prova prova = getByName(request.getData_solic_ava());
        try {
            manager.merge(prova);
        } catch (Exception e) {
            System.err.println(e.getMessage());
            return "Erro";
        }

        return "Completado";
    }

}
