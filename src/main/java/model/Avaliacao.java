package model;

import org.jboss.classfilewriter.annotations.LongAnnotationValue;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "avaliacao", schema = "sistemadeavaliacao")
public class Avaliacao {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne
    @PrimaryKeyJoinColumn
    private  Prova prova;

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
    private Date dataEntregaProvaAvaliador;

    @Column
    private String dataConclusaoAvaliacao;

    @Column
    private String status_ava;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "avaliador_id", nullable = false)
    private Funcionario funcionario;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public Date getDataEntregaProvaAvaliador() {
        return dataEntregaProvaAvaliador;
    }

    public void setDataEntregaProvaAvaliador(Date dataEntregaProvaAvaliador) {
        this.dataEntregaProvaAvaliador = dataEntregaProvaAvaliador;
    }

    public String getDataConclusaoAvaliacao() {
        return dataConclusaoAvaliacao;
    }

    public void setDataConclusaoAvaliacao(String dataConclusaoAvaliacao) {
        this.dataConclusaoAvaliacao = dataConclusaoAvaliacao;
    }

    public Funcionario getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(Funcionario funcionario) {
        this.funcionario = funcionario;
    }

    public Prova getProva() {
        return prova;
    }

    public void setProva(Prova prova) {
        this.prova = prova;
    }

    public Boolean getCorrigida() {
        return corrigida;
    }

    public void setCorrigida(Boolean corrigida) {
        this.corrigida = corrigida;
    }

    public String getStatus_ava() {
        return status_ava;
    }

    public void setStatus_ava(String status_ava) {
        this.status_ava = status_ava;
    }
}
