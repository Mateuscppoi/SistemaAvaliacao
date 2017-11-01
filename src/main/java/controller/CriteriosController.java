package controller;

import dao.CriteriosDAO;
import model.CriteriosProva;
import model.Linguagem;

import javax.annotation.PostConstruct;
import javax.enterprise.context.ApplicationScoped;
import javax.faces.bean.ManagedBean;
import javax.inject.Inject;
import javax.inject.Named;
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
    private Integer linguagem_id;
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

    public Integer getLinguagem_id() {
        return linguagem_id;
    }

    public void setLinguagem_id(Integer linguagem_id) {
        this.linguagem_id = linguagem_id;
    }

    public List<Linguagem> getLinguagem() {
        return linguagem;
    }

    public void setLinguagem(List<Linguagem> linguagem) {
        this.linguagem = linguagem;
    }

    @PostConstruct
    public void showCriterios(){
        System.out.println("passou nos criterios");
        criterios = new ArrayList<CriteriosProva>();
        criterios.addAll(dao.showCriterios());
    }

 /*   public String deleteCriterios(){
        DTOCriteriosDelete criterios = new DTOCriteriosDelete(descricao,id);
        return dao.deleteCriterios(criterios);
    }
    public String updateCriterios(){
        DTOCriteriosUpdate criterios = new DTOCriteriosUpdate(descricao);
        return dao.updateCriterios(criterios);
    }
    public String novoCriterio(){
        DTOCriteriosInsert criterios = new DTOCriteriosInsert(descricao,criteriosObrigatorios,linguagem_id);
        return dao.novoCriterio(criterios);
    }*/
}
