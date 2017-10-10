package Controller;

import model.TipoProva;

import javax.faces.bean.ManagedBean;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

@ManagedBean
public class InsereTipoProva {

    private TipoProva tipoProva;
    private String descricao;

    public TipoProva getTipoProva() {
        return tipoProva;
    }

    public void setTipoProva(TipoProva tipoProva) {
        this.tipoProva = tipoProva;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String retornaTipo () {
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("db1start");
        EntityManager manager = factory.createEntityManager();

        TipoProva tipoProva = new TipoProva();
        tipoProva.setDescricao(descricao);
        manager.getTransaction().begin();
        manager.persist(tipoProva);
        manager.getTransaction().commit();

        factory.close();

        return "Completado";
    }
}
