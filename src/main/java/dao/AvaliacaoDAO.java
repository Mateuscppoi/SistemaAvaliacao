package dao;


import dto.avaliacao.DTOAvaliacaoDelete;
import dto.avaliacao.DTOAvaliacaoInsert;
import dto.avaliacao.DTOAvaliacaoUpdate;
import model.Avaliacao;

import javax.inject.Inject;
import javax.inject.Named;
import javax.persistence.EntityManager;
import javax.persistence.Query;
import java.util.List;

@Named
public class AvaliacaoDAO {
    @Inject
    private EntityManager manager;

    public List<Avaliacao> showAvaliacoes(){
        return manager.createQuery("select A from Avaliacao A").getResultList();
    }

    public Avaliacao getById(Long id){
        Query query = manager.createQuery("select A from Avaliacao A where id =:pId");
        query.setParameter("pId",id);
        return (Avaliacao) query.getSingleResult();
    }
    @Transactional
    public String novaAvaliacao(DTOAvaliacaoInsert request){
        Avaliacao avaliacao = new Avaliacao();
        avaliacao.setLinkProva(request.getLink_prova());
        avaliacao.setPontosFortes(request.getPontos_fortes());
        avaliacao.setPontosMelhorar(request.getPontos_melhorar());
        avaliacao.setParecer(request.getParecer());
        avaliacao.setDataConclusaoAvaliacao(request.getEntrega_nao_realizada());
        manager.persist(avaliacao);
        return "Avaliação Corrigida";
    }
    @Transactional
    public String deleteAvaliacao(DTOAvaliacaoDelete request){
        Avaliacao avaliacao = getById(request.getId());
        manager.remove(avaliacao);
    return "Deletado";
    }
    @Transactional
    public String updtadeAvaliacao (DTOAvaliacaoUpdate request){
        Avaliacao avaliacao = getById(request.getId());
        avaliacao.setLinkProva(request.getLink_prova());
        avaliacao.setPontosFortes(request.getPontos_fortes());
        avaliacao.setPontosMelhorar(request.getPontos_melhorar());
        avaliacao.setParecer(request.getParecer());
        avaliacao.setDataConclusaoAvaliacao(request.getEntrega_realizada());
        try {
            manager.merge(avaliacao);
        } catch (Exception e){
            System.err.println(e.getMessage());
            return "ERRO";
        }
        return "Editado";
    }

}
