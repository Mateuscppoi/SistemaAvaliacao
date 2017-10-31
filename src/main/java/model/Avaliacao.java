package model;

import javax.persistence.*;
import java.util.Calendar;
import java.util.Date;

@Entity
@Table(name = "avaliacao", schema = "sistemadeavaliacao")
public class Avaliacao {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private Integer prova_id;

    @Column
    private Boolean corrigida;

    @Column
    private String linkProva;

    @Column
    private String pontosFortes;

    @Column
    private String pontosMelhorar;

    @Column
    private String parecer;

    @Column
    private Calendar dataConclusaoAvaliacao;

    @Column
    private String status_ava;

    @Column
    private Integer funcionario_id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getProva_id() {
        return prova_id;
    }

    public void setProva_id(Integer prova_id) {
        this.prova_id = prova_id;
    }

    public Boolean getCorrigida() {
        return corrigida;
    }

    public void setCorrigida(Boolean corrigida) {
        this.corrigida = corrigida;
    }

    public String getLinkProva() {
        return linkProva;
    }

    public void setLinkProva(String linkProva) {
        this.linkProva = linkProva;
    }

    public String getPontosFortes() {
        return pontosFortes;
    }

    public void setPontosFortes(String pontosFortes) {
        this.pontosFortes = pontosFortes;
    }

    public String getPontosMelhorar() {
        return pontosMelhorar;
    }

    public void setPontosMelhorar(String pontosMelhorar) {
        this.pontosMelhorar = pontosMelhorar;
    }

    public String getParecer() {
        return parecer;
    }

    public void setParecer(String parecer) {
        this.parecer = parecer;
    }

    public Calendar getDataConclusaoAvaliacao() {
        return dataConclusaoAvaliacao;
    }

    public void setDataConclusaoAvaliacao(Calendar dataConclusaoAvaliacao) {
        this.dataConclusaoAvaliacao = dataConclusaoAvaliacao;
    }

    public String getStatus_ava() {
        return status_ava;
    }

    public void setStatus_ava(String status_ava) {
        this.status_ava = status_ava;
    }

    public Integer getFuncionario_id() {
        return funcionario_id;
    }

    public void setFuncionario_id(Integer funcionario_id) {
        this.funcionario_id = funcionario_id;
    }
}
