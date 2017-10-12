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

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "linguagem_id", nullable = false)
    private Linguagem linguagem;


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

    public Linguagem getLinguagem() {
        return linguagem;
    }

    public void setLinguagem(Linguagem linguagem) {
        this.linguagem = linguagem;
    }
}


