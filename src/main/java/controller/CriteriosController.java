package controller;

import dao.CriteriosDAO;
import dao.Transactional;
import dto.avaliacao.DTOAvaliacaoUpdate;
import dto.criterios.DTOCriteriosDelete;
import dto.criterios.DTOCriteriosInsert;
import dto.criterios.DTOCriteriosUpdate;
import model.CriteriosProva;
import model.Linguagem;

import javax.annotation.PostConstruct;
import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;
import javax.inject.Inject;
import javax.inject.Named;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.ArrayList;
import java.util.List;

@ManagedBean
@ApplicationScoped
@Named
public class CriteriosController {

    @Inject
    private CriteriosDAO dao;

    private Long id;
    private CriteriosProva criteriosProva = new CriteriosProva();
    private String descricao;
    private Boolean criteriosObrigatorios;
    private List<Linguagem> linguagem;
    private List<CriteriosProva> criterios;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public CriteriosDAO getDao() {
        return dao;
    }

    public void setDao(CriteriosDAO dao) {
        this.dao = dao;
    }

    public List<CriteriosProva> getCriterios() {
        return criterios;
    }

    public void setCriterios(List<CriteriosProva> criterios) {
        this.criterios = criterios;
    }

    public CriteriosProva getCriteriosProva() {
        return criteriosProva;
    }

    public void setCriteriosProva(CriteriosProva criteriosProva) {
        this.criteriosProva = criteriosProva;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Boolean getCriteriosObrigatorios() {
        return criteriosObrigatorios;
    }

    public void setCriteriosObrigatorios(Boolean criteriosObrigatorios) {
        this.criteriosObrigatorios = criteriosObrigatorios;
    }

    public List<Linguagem> getLinguagem() {
        return linguagem;
    }

    public void setLinguagem(List<Linguagem> linguagem) {
        this.linguagem = linguagem;
    }

    @PostConstruct
    public void showCriterios(){
        criterios = new ArrayList<CriteriosProva>();
        criterios.addAll(dao.showCriterios());
    }
    public String deleteCriterios(){
        DTOCriteriosDelete criterios = new DTOCriteriosDelete(descricao,id);
        return dao.deleteCriterios(criterios);
    }
    public String updateCriterios(){
        DTOCriteriosUpdate criterios = new DTOCriteriosUpdate(descricao);
        return dao.updateCriterios(criterios);
    }
    public String novoCriterio(){
        DTOCriteriosInsert criterios = new DTOCriteriosInsert(descricao,criteriosObrigatorios,linguagem);
        return dao.novoCriterio(criterios);
    }
}
