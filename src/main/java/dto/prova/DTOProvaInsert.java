package dto.prova;

import model.Candidato;
import model.Linguagem;

import java.util.List;

public class DTOProvaInsert {
    private final String link_prova;
    private final String prazo;
    private final String data_solic_ava;
    private final List<Candidato> candidato;
    private final List<Linguagem> linguagem;

    public DTOProvaInsert(String link_prova, String prazo, String data_solic_ava, List<Candidato> candidato, List<Linguagem> linguagem) {
        this.link_prova = link_prova;
        this.prazo = prazo;
        this.data_solic_ava = data_solic_ava;
        this.candidato = candidato;
        this.linguagem = linguagem;
    }

    public String getLink_prova() {
        return link_prova;
    }

    public String getPrazo() {
        return prazo;
    }

    public String getData_solic_ava() {
        return data_solic_ava;
    }

    public List<Candidato> getCandidato() {
        return candidato;
    }

    public List<Linguagem> getLinguagem() {
        return linguagem;
    }
}
