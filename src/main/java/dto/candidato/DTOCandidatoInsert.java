package dto.candidato;

import java.util.List;

import model.Prova;

public class DTOCandidatoInsert {
    private final String nome;
    private final String email;
    private final String telefone;
    private final String rede_social;
    private final Boolean contratado;
    private final List<Prova> prova;

    public DTOCandidatoInsert (String nome, String email, String telefone, String rede_social, Boolean contratado, List<Prova> prova) {
        this.nome = nome;
        this.email = email;
        this.telefone = telefone;
        this.rede_social = rede_social;
        this.contratado = contratado;
        this.prova = prova;
    }
}
