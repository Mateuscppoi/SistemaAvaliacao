package model;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "tipoprova", schema = "public")
public class TipoProva {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String descricao;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "tipoprova")
    private List<CriteriosProva> criteriosProvas;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public List<CriteriosProva> getCriteriosProvas() {
        return criteriosProvas;
    }

    public void setCriteriosProvas(List<CriteriosProva> criteriosProvas) {
        this.criteriosProvas = criteriosProvas;
    }
}


