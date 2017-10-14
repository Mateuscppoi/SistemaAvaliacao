package model;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "prova", schema = "sistemadeavaliacao")
public class Prova {

    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY)
    private Long id_prova;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "candidato_id_candidato", nullable = false)
    private Candidato candidato;

    @Column
    private String import_prova;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "linguagem_id_linguagem", nullable = false)
    private CriteriosProva criteriosProva;

    @Column
    private Integer prazo;

    @Column
    private Date data_solic_ava;
   // @MapsId
   // @OneToOne
   // @JoinColumn(name = "prova_id")
   // private Avaliacao avaliacao;

    public Long getId_prova() {
        return id_prova;
    }

    public void setId_prova(Long id_prova) {
        this.id_prova = id_prova;
    }

    public Candidato getCandidato() {
        return candidato;
    }

    public void setCandidato(Candidato candidato) {
        this.candidato = candidato;
    }

    public CriteriosProva getCriteriosProva() {
        return criteriosProva;
    }

    public void setCriteriosProva(CriteriosProva criteriosProva) {
        this.criteriosProva = criteriosProva;
    }

    public String getImport_prova() {
        return import_prova;
    }

    public void setImport_prova(String import_prova) {
        this.import_prova = import_prova;
    }

    public Integer getPrazo() {
        return prazo;
    }

    public void setPrazo(Integer prazo) {
        this.prazo = prazo;
    }

    public Date getData_solic_ava() {
        return data_solic_ava;
    }

    public void setData_solic_ava(Date data_solic_ava) {
        this.data_solic_ava = data_solic_ava;
    }
}
