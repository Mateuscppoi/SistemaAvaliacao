package dto.candidato;

import java.util.List;

import model.Prova;

public class DTOCandidatoInsert {
    private final String nome;
    private final String email;
    private final String telefone;
    private final String redesocial;
    private final Boolean contratado;
    private final List<Prova> prova;

    public DTOCandidatoInsert (String nome, String email, String telefone, String redesocial, Boolean contratado, List<Prova> prova) {
        this.nome = nome;
        this.email = email;
        this.telefone = telefone;
        this.redesocial = redesocial;
        this.contratado = contratado;
        this.prova = prova;
    }
}
