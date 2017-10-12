package Controller;

import model.CriteriosProva;
import model.Linguagem;

import javax.faces.bean.ManagedBean;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

@ManagedBean
public class InsereCriterios {

    private CriteriosProva criteriosProva = new CriteriosProva();
    private String descricao;
    private Boolean criteriosObrigatorios;
    private Linguagem linguagem;

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

    public Linguagem getLinguagem() {
        return linguagem;
    }

    public void setLinguagem(Linguagem linguagem) {
        this.linguagem = linguagem;
    }

    public String retornaCriterios() {

        EntityManagerFactory factory = Persistence.createEntityManagerFactory("db1start");
        EntityManager manager = factory.createEntityManager();


        CriteriosProva criteriosProva = new CriteriosProva();
        criteriosProva.setDescricao(descricao);
        criteriosProva.setCriteriosObrigatorios(criteriosObrigatorios);
        criteriosProva.setLinguagem(getLinguagem());
        manager.getTransaction().begin();
        manager.persist(criteriosProva);
        manager.getTransaction().commit();

        return "Completado";
    }
}
