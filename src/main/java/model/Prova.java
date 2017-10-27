package model;

import javax.persistence.*;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "prova", schema = "sistemadeavaliacao")
public class Prova {

    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY)
    private Long id_prova;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "candidato_id_candidato", nullable = false)
    private List<Candidato> candidato;

    @Column
    private String link_prova;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "linguagem_id_linguagem", nullable = false)
    private List<CriteriosProva> criteriosProva;

    @Column
    private String prazo;

    @Column
    private Calendar data_solic_ava;
   @MapsId
   @OneToOne
   @JoinColumn(name = "prova_id")
   private Avaliacao avaliacao;

    public Long getId_prova() {
        return id_prova;
    }

    public void setId_prova(Long id_prova) {
        this.id_prova = id_prova;
    }

    public List<Candidato> getCandidato() {
        return candidato;
    }

    public void setCandidato(List<Candidato> candidato) {
        this.candidato = candidato;
    }

    public List<CriteriosProva> getCriteriosProva() {
        return criteriosProva;
    }

    public void setCriteriosProva(List<CriteriosProva> criteriosProva) {
        this.criteriosProva = criteriosProva;
    }

    public String getLink_prova() {
        return link_prova;
    }

    public void setLink_prova(String link_prova) {
        this.link_prova = link_prova;
    }

    public String getPrazo() {
        return prazo;
    }

    public void setPrazo(String prazo) {
        this.prazo = prazo;
    }

    public Calendar getData_solic_ava() {
        return data_solic_ava;
    }

    public void setData_solic_ava(Calendar data_solic_ava) {
        this.data_solic_ava = data_solic_ava;
    }
}
