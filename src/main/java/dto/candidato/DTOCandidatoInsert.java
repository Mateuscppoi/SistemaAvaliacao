package dto.candidato;

import model.Prova;

import java.util.List;

public class DTOCandidatoInsert {
    private final String nome;
    private final String email;
    private final String telefone;
    private final String rede_social;
    private final Boolean contratado;
  //  private final List<Prova> prova;


    public DTOCandidatoInsert(String nome, String email, String telefone, String rede_social, Boolean contratado) {
        this.nome = nome;
        this.email = email;
        this.telefone = telefone;
        this.rede_social = rede_social;
        this.contratado = contratado;
    }

    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }

    public String getTelefone() {
        return telefone;
    }

    public String getRede_social() {
        return rede_social;
    }

    public Boolean getContratado() {
        return contratado;
    }


    //  public List<Prova> getProva() {
  //      return prova;
   // }
}
