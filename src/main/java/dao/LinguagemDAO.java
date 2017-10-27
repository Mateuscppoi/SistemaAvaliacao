package dao;

import dto.linguagem.DTOLinguagemDelete;
import dto.linguagem.DTOLinguagemInsert;
import dto.linguagem.DTOLinguagemUpdate;
import model.Linguagem;

import javax.inject.Inject;
import javax.inject.Named;
import javax.persistence.EntityManager;
import javax.persistence.Query;
import java.util.List;

@Named
public class LinguagemDAO {

    @Inject
    private EntityManager manager;

    public List<Linguagem> showLinguagem () {
        return manager.createQuery("select f from Linguagem f where nome = true ").getResultList();
    }

    public Linguagem getById(Long id) {
        Query query = manager.createQuery("select f from Linguagem f where id = :pId");
        query.setParameter("pId",id);

        return (Linguagem) query.getSingleResult();
    }

    public Linguagem getByName(String nome) {
        Query query = manager.createQuery("select f from Linguagem f where nome like :pNome");
        query.setParameter("pNome","%"+nome+"%");

        return (Linguagem) query.getSingleResult();
    }

    @Transactional
    public String novoLinguagem(DTOLinguagemInsert request){
        Linguagem linguagem = new Linguagem();
        linguagem.setDescricao(request.getNome());
        manager.persist(linguagem);

        return "Completado";
    }

    @Transactional
    public String DeleteLinguagem(DTOLinguagemDelete request){
        Linguagem linguagem = getByName(request.getNome());
        try {
            manager.remove(linguagem);
        } catch (Exception e) {
            System.err.println(e.getMessage());
            return "Erro";
        }
        return "Completado";
    }

    @Transactional
    public String updateLinguagem (DTOLinguagemUpdate request) {

        Linguagem linguagem = getByName(request.getNome());
        linguagem.setDescricao(request.getNome());
        try {
            manager.merge(linguagem);
        } catch (Exception e) {
            System.err.println(e.getMessage());
            return "Erro";
        }

        return "Completado";
    }

}
