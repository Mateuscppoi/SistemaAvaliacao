package controller;

import dao.AvaliacaoDAO;
import dto.avaliacao.DTOAvaliacaoDelete;
import dto.avaliacao.DTOAvaliacaoUpdate;
import model.Avaliacao;
import javax.annotation.PostConstruct;
import javax.enterprise.context.ApplicationScoped;
import javax.faces.bean.ManagedBean;
import javax.inject.Inject;
import javax.inject.Named;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@ManagedBean
@ApplicationScoped
@Named
public class AvaliacaoController {

    @Inject
    private AvaliacaoDAO dao;

    private Long id;
    private Boolean corrigida;
    private String linkProva;
    private String pontosFortes;
    private String pontosMelhorar;
    private String parecer;
    private Date dataEntregaProvaAvaliador;
    private Date dataConclusaoAvaliacao;
    private List<Avaliacao> avaliacoes;

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
    @PostConstruct
    public void showAvaliacao(){ avaliacoes.addAll(dao.showAvaliacoes());}
    
    public String deleteAvaliacao() {
        DTOAvaliacaoDelete avaliacao = new DTOAvaliacaoDelete(id);
        return "Deletado";
    }
    public String updateAvaliacao(){
        DTOAvaliacaoUpdate avaliacao = new DTOAvaliacaoUpdate(id,linkProva,pontosFortes,pontosMelhorar,parecer,dataEntregaProvaAvaliador);
    return "Editado";
    }
}
