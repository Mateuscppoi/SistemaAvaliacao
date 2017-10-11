package model;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "prova", schema = "sistemadeavaliacao")
public class Prova {

    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "candidato_id", nullable = false)
    private Candidato candidato;

    @Column
    private byte import_avaliacao;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "linguagem_id", nullable = false)
    private CriteriosProva criteriosProva;

    @Column
    private Date prazo;

    @Column
    private Date data_solic_ava;

    @MapsId
    @OneToOne
    @JoinColumn(name = "prova_id")
    private Avaliacao avaliacao;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Candidato getCandidato() {
        return candidato;
    }

    public void setCandidato(Candidato candidato) {
        this.candidato = candidato;
    }

    public byte getImport_avaliacao() {
        return import_avaliacao;
    }

    public void setImport_avaliacao(byte import_avaliacao) {
        this.import_avaliacao = import_avaliacao;
    }

    public CriteriosProva getCriteriosProva() {
        return criteriosProva;
    }

    public void setCriteriosProva(CriteriosProva criteriosProva) {
        this.criteriosProva = criteriosProva;
    }

    public Date getPrazo() {
        return prazo;
    }

    public void setPrazo(Date prazo) {
        this.prazo = prazo;
    }

    public Date getData_solic_ava() {
        return data_solic_ava;
    }

    public void setData_solic_ava(Date data_solic_ava) {
        this.data_solic_ava = data_solic_ava;
    }
}
