package Controller;

import model.CriteriosProva;
import model.TipoProva;

import javax.faces.bean.ManagedBean;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

@ManagedBean
public class InsereCriterios {

    private CriteriosProva criteriosProva = new CriteriosProva();
    private String descricao;
    private Boolean criteriosObrigatorios;
    private TipoProva tipoProva;

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

    public TipoProva getTipoProva() {
        return tipoProva;
    }

    public void setTipoProva(TipoProva tipoProva) {
        this.tipoProva = tipoProva;
    }

    public String retornaCriterios() {

        EntityManagerFactory factory = Persistence.createEntityManagerFactory("db1start");
        EntityManager manager = factory.createEntityManager();


        CriteriosProva criteriosProva = new CriteriosProva();
        criteriosProva.setDescricao(descricao);
        criteriosProva.setCriteriosObrigatorios(criteriosObrigatorios);
        criteriosProva.setTipoprova(getTipoProva());
        manager.getTransaction().begin();
        manager.persist(criteriosProva);
        manager.getTransaction().commit();

        return "Completado";
    }
}
