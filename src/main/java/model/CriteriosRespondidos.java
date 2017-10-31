package model;

import javax.persistence.*;
import javax.persistence.criteria.CriteriaBuilder;

public class CriteriosRespondidos {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private Boolean respondido;

    @Column
    private Integer avaliação_id;

    @Column
    private Integer linguagem_id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Boolean getRespondido() {
        return respondido;
    }

    public void setRespondido(Boolean respondido) {
        this.respondido = respondido;
    }

    public Integer getAvaliação_id() {
        return avaliação_id;
    }

    public void setAvaliação_id(Integer avaliação_id) {
        this.avaliação_id = avaliação_id;
    }

    public Integer getLinguagem_id() {
        return linguagem_id;
    }

    public void setLinguagem_id(Integer linguagem_id) {
        this.linguagem_id = linguagem_id;
    }
}
