package TESTE.avaliacao;

import java.util.Date;

public class Avaliacao {
    private Integer id;
    private String linkProva;
    private String pontosFortes;
    private String pontosMelhorar;
    private byte imagemMelhorarProva;
    private String parecer;
    private Date dataEntregaProvaCandidato;
    private Date dataEntregaProvaAvaliador;
    private Date dataConclusaoAvaliacao;
    private Candidato candidato;
    private Funcionario avaliador;
    private CriteriosProva criteriosProva;

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

    public byte getImagemMelhorarProva() {
        return imagemMelhorarProva;
    }

    public void setImagemMelhorarProva(byte imagemMelhorarProva) {
        this.imagemMelhorarProva = imagemMelhorarProva;
    }

    public String getParecer() {
        return parecer;
    }

    public void setParecer(String parecer) {
        this.parecer = parecer;
    }

    public Date getDataEntregaProvaCandidato() {
        return dataEntregaProvaCandidato;
    }

    public void setDataEntregaProvaCandidato(Date dataEntregaProvaCandidato) {
        this.dataEntregaProvaCandidato = dataEntregaProvaCandidato;
    }

    public Date getDataEntregaProvaAvaliador() {
        return dataEntregaProvaAvaliador;
    }

    public void setDataEntregaProvaAvaliador(Date dataEntregaProvaAvaliador) {
        this.dataEntregaProvaAvaliador = dataEntregaProvaAvaliador;
    }

    public Date getDataConclusaoAvaliacao() {
        return dataConclusaoAvaliacao;
    }

    public void setDataConclusaoAvaliacao(Date dataConclusaoAvaliacao) {
        this.dataConclusaoAvaliacao = dataConclusaoAvaliacao;
    }

    public Candidato getCandidato() {
        return candidato;
    }

    public void setCandidato(Candidato candidato) {
        this.candidato = candidato;
    }

    public Funcionario getAvaliador() {
        return avaliador;
    }

    public void setAvaliador(Funcionario avaliador) {
        this.avaliador = avaliador;
    }

    public Integer getId() {

        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}
