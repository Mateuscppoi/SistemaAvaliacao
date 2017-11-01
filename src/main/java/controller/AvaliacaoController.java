package controller;

import dao.AvaliacaoDAO;
import dto.avaliacao.DTOAvaliacaoDelete;
import dto.avaliacao.DTOAvaliacaoInsert;
import model.Avaliacao;
import javax.annotation.PostConstruct;
import javax.enterprise.context.ApplicationScoped;
import javax.faces.bean.ManagedBean;
import javax.inject.Inject;
import javax.inject.Named;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

@ManagedBean
@ApplicationScoped
@Named
public class AvaliacaoController {

    @Inject
    private AvaliacaoDAO dao;

    private Long id;
    private String nome;
    private Boolean corrigida;
    private String linkProva;
    private String pontosFortes;
    private String pontosMelhorar;
    private String parecer;
    private String dataEntregaProvaAvaliador;
    private Calendar dataConclusaoAvaliacao;
    private List<Avaliacao> avaliacoes;
    private String status_ava;
    private Integer prova_id;

    public String getStatus_ava() {
        return status_ava;
    }

    public void setStatus_ava(String status_ava) {
        this.status_ava = status_ava;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public AvaliacaoController() {
        avaliacoes = new ArrayList<Avaliacao>();
    }

    public AvaliacaoDAO getDao() {
        return dao;
    }

    public void setDao(AvaliacaoDAO dao) {
        this.dao = dao;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Boolean getCorrigida() {
        return corrigida;
    }

    public List<Avaliacao> getAvaliacoes() {
        return avaliacoes;
    }

    public void setAvaliacoes(List<Avaliacao> avaliacoes) {
        this.avaliacoes = avaliacoes;
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


    public void setDataEntregaProvaAvaliador(String dataEntregaProvaAvaliador) {
        this.dataEntregaProvaAvaliador = dataEntregaProvaAvaliador;
    }

    public Calendar getDataConclusaoAvaliacao() {
        return dataConclusaoAvaliacao;
    }

    public void setDataConclusaoAvaliacao(Calendar dataConclusaoAvaliacao) {
        this.dataConclusaoAvaliacao = dataConclusaoAvaliacao;
    }

    public String getDataEntregaProvaAvaliador() {
        return dataEntregaProvaAvaliador;
    }

    public Integer getProva_id() {
        return prova_id;
    }

    public void setProva_id(Integer prova_id) {
        this.prova_id = prova_id;
    }

    @PostConstruct
    public void showAvaliacao() {
        avaliacoes = new ArrayList<Avaliacao>();
        avaliacoes.addAll(dao.showAvaliacoes());
    }

    public String deleteAvaliacao() {
        DTOAvaliacaoDelete avaliacao = new DTOAvaliacaoDelete(id);
        return dao.deleteAvaliacao(avaliacao);
    }

    public String novaAvaliacao() {
        DTOAvaliacaoInsert avaliacao = new DTOAvaliacaoInsert(nome, linkProva, pontosFortes, pontosMelhorar, parecer, dataEntregaProvaAvaliador, dataConclusaoAvaliacao, status_ava, prova_id);
        return dao.novaAvaliacao(avaliacao);
    }

    public void showAvaliacaoCorrigida() {
        avaliacoes = new ArrayList<Avaliacao>();
        avaliacoes.addAll(dao.showAvaliacoesCorrigidas());
    }
}
