package controller;

import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;

public class AvaliacaoAvaliador {

    private String pontosFortes;
    private String pontosAMelhorar;
    private String linkProvaCorrigida;
    private String parecer;

    public String getPontosFortes() {
        return pontosFortes;
    }

    public void setPontosFortes(String pontosFortes) {
        this.pontosFortes = pontosFortes;
    }

    public String getPontosAMelhorar() {
        return pontosAMelhorar;
    }

    public void setPontosAMelhorar(String pontosAMelhorar) {
        this.pontosAMelhorar = pontosAMelhorar;
    }

    public String getlinkProvaCorrigida() {
        return linkProvaCorrigida;
    }

    public void setlinkProvaCorrigida(String linkProvaCorrigida) {
        this.linkProvaCorrigida = linkProvaCorrigida;
    }

    public String getParecer() {
        return parecer;
    }

    public void setParecer(String parecer) {
        this.parecer = parecer;
    }

    public String camposObrigatorios() {
        FacesContext fc = FacesContext.getCurrentInstance();

        if ((pontosFortes != null) && (pontosAMelhorar != null) && (linkProvaCorrigida != null) && (parecer != null)) {
            FacesMessage fm = new FacesMessage("Prova Corrigida Com Sucesso");
            return "/Pendencias";
        } else {
            FacesMessage fm = new FacesMessage("Todos os campos são obrigatórios");
            fm.setSeverity(FacesMessage.SEVERITY_ERROR);
            return "/AvaliacaoDoAvaliador";
        }
    }
}