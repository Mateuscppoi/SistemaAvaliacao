package model;

import javax.persistence.*;

@Entity
@Table (name = "criterios", schema = "sistemadeavaliacao")
public class CriteriosProva {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column (nullable = false)
    private String descricao;

    @Column (nullable = false)
    private Boolean criteriosObrigatorios;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "tipoprova_id", nullable = false)
    private TipoProva tipoprova;


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

    public Boolean getCriteriosObrigatorios() {
        return criteriosObrigatorios;
    }

    public void setCriteriosObrigatorios(Boolean criteriosObrigatorios) {
        this.criteriosObrigatorios = criteriosObrigatorios;
    }

    public TipoProva getTipoprova() {
        return tipoprova;
    }

    public void setTipoprova(TipoProva tipoprova) {
        this.tipoprova = tipoprova;
    }
}
