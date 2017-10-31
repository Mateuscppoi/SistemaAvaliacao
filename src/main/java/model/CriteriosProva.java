package model;

import javax.persistence.*;

@Entity
@Table (name = "criterios", schema = "sistemadeavaliacao")
public class CriteriosProva {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String descricao;

    @Column(nullable = false)
    private Boolean criteriosObrigatorios;

    @Column
    private Integer linguagem_id;

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

    public Integer getLinguagem_id() {
        return linguagem_id;
    }

    public void setLinguagem_id(Integer linguagem_id) {
        this.linguagem_id = linguagem_id;
    }
}