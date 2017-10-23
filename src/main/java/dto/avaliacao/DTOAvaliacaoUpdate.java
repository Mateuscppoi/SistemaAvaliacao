package dto.avaliacao;

<<<<<<< HEAD
import javax.persistence.Query;

public class DTOAvaliacaoUpdate {

  /*  Query query = manager.createQuery("Select u from Uf u where u.id = :pId");
		query.setParameter("pId", id);*/
=======
import java.util.Date;

public class DTOAvaliacaoUpdate {
    private final String link_prova;
    private final String pontos_fortes;
    private final String pontos_melhorar;
    private final String parecer;
    private final Date conclusao_avaliacao;

    public DTOAvaliacaoUpdate(String link_prova, String pontos_fortes, String pontos_melhorar, String parecer, Date conclusao_avaliacao) {
        this.link_prova = link_prova;
        this.pontos_fortes = pontos_fortes;
        this.pontos_melhorar = pontos_melhorar;
        this.parecer = parecer;
        this.conclusao_avaliacao = conclusao_avaliacao;
    }

    public String getLink_prova() {
        return link_prova;
    }

    public String getPontos_fortes() {
        return pontos_fortes;
    }

    public String getPontos_melhorar() {
        return pontos_melhorar;
    }

    public String getParecer() {
        return parecer;
    }

    public Date getConclusao_avaliacao() {
        return conclusao_avaliacao;
    }
>>>>>>> 957a9ad36b27476f7aa65a9882cd96e709388ccb
}
