package dto.prova;

import model.Candidato;
import model.CriteriosProva;

import java.util.Calendar;
import java.util.List;

public class DTOProvaInsert {
    private final String link_prova;
    private final String prazo;
    private final Calendar data_solic_ava;
    private final List<Candidato> candidato;
    private final List<CriteriosProva> criteriosProva;

    public DTOProvaInsert(String link_prova, String prazo, Calendar data_solic_ava, List<Candidato> candidato, List<CriteriosProva> criteriosProva) {
        this.link_prova = link_prova;
        this.prazo = prazo;
        this.data_solic_ava = data_solic_ava;
        this.candidato = candidato;
        this.criteriosProva = criteriosProva;
    }

    public String getLink_prova() {
        return link_prova;
    }

    public String getPrazo() {
        return prazo;
    }

    public List<Candidato> getCandidato() {
        return candidato;
    }

    public List<CriteriosProva> getCriteriosProva() {
        return criteriosProva;
    }

    public Calendar getData_solic_ava() {
        return data_solic_ava;
    }
}
