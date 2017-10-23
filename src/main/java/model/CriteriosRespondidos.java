package model;

import javax.persistence.*;

public class CriteriosRespondidos {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private Boolean respondido;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "avaliacao_id", nullable = true)
    private Avaliacao avaliacao;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "linguagem_id")
    private Linguagem linguagem;


}
