package dto.avaliacao;

public class DTOAvaliacaoUpdate {

    private final Long id;
    private final String link_prova;
    private final String pontos_fortes;
    private final String pontos_melhorar;
    private final String parecer;
    private final String entrega_realizada = "Corrigida";

    public DTOAvaliacaoUpdate(Long id, String link_prova, String pontos_fortes, String pontos_melhorar, String parecer) {
        this.id = id;
        this.link_prova = link_prova;
        this.pontos_fortes = pontos_fortes;
        this.pontos_melhorar = pontos_melhorar;
        this.parecer = parecer;
    }

    public Long getId() { return id; }

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

    public String getEntrega_realizada() {
        return entrega_realizada;
    }
}
