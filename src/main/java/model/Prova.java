package model;

import javax.persistence.*;
import java.util.Calendar;
import java.util.List;

@Entity
@Table(name = "prova", schema = "sistemadeavaliacao")
public class Prova {

    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private Integer candidato_id;

    /*@ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "candidato_id_candidato", nullable = false)
    private Candidato candidato;*/

    @Column
    private String link_prova;

    @Column
    private Integer criteriosProva;

    /*@OneToMany(fetch = FetchType.LAZY)
    @JoinColumn(name = "linguagem_id_linguagem", nullable = false)
    private List<CriteriosProva> criteriosProva;*/

    @Column
    private String prazo;

    @Column
    private Calendar data_solic_ava;

    @Column
    private Integer avaliacao_id;

    /*@MapsId
   @OneToOne
   @JoinColumn(name = "prova_id")
   private Avaliacao avaliacao;
*/
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }



/*public Candidato getCandidato() {
        return candidato;
    }

    public void setCandidato(Candidato candidato) {
        this.candidato = candidato;
    }*/

    /*public List<CriteriosProva> getCriteriosProva() {
        return criteriosProva;
    }

    public void setCriteriosProva(List<CriteriosProva> criteriosProva) {
        this.criteriosProva = criteriosProva;
    }*/

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

    public Integer getCandidato_id() {
        return candidato_id;
    }

    public void setCandidato_id(Integer candidato_id) {
        this.candidato_id = candidato_id;
    }

    public Integer getCriteriosProva() {
        return criteriosProva;
    }

    public void setCriteriosProva(Integer criteriosProva) {
        this.criteriosProva = criteriosProva;
    }

    public Integer getAvaliacao_id() {
        return avaliacao_id;
    }

    public void setAvaliacao_id(Integer avaliacao_id) {
        this.avaliacao_id = avaliacao_id;
    }
}
