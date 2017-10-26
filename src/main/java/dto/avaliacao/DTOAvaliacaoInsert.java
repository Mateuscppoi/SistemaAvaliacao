package dto.avaliacao;

import java.util.Date;

public class DTOAvaliacaoInsert {

    private final Boolean nome;
    private final String link_prova;
    private final String pontos_fortes;
    private final String pontos_melhorar;
    private final String parecer;
  //  private final Date entrega_prova_avaliador;
   // private final Date conclusao_avaliacao;
    private String status_ava;

    public DTOAvaliacaoInsert(Boolean nome, String link_prova, String pontos_fortes, String pontos_melhorar, String parecer, String status_ava) {
        this.nome = nome;
        this.link_prova = link_prova;
        this.pontos_fortes = pontos_fortes;
        this.pontos_melhorar = pontos_melhorar;
        this.parecer = parecer;
     //   this.entrega_prova_avaliador = entrega_prova_avaliador;
     //   this.conclusao_avaliacao = conclusao_avaliacao;
        this.status_ava = status_ava;
    }

    public Boolean getNome() {
        return nome;
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

  //  public Date getEntrega_prova_avaliador() {
  //      return entrega_prova_avaliador;
  //  }

  //  public Date getConclusao_avaliacao() {
   //     return conclusao_avaliacao;
  //  }

    public String getStatus_ava() {
        return status_ava;
    }
}
