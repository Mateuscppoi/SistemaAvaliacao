package DAO;

import model.Candidato;

import javax.faces.bean.ManagedBean;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

@ManagedBean
public class InsereCandidato {

    private String nome;
    private String email;
    private String telefone;
    private String rede_social;
    private Boolean contratado;
    private Boolean visivel;


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getRede_social() {
        return rede_social;
    }

    public void setRede_social(String rede_social) {
        this.rede_social = rede_social;
    }

    public Boolean getContratado() {
        return contratado;
    }

    public void setContratado(Boolean contratado) {
        this.contratado = contratado;
    }

    public Boolean getVisivel() {
        return visivel;
    }

    public void setVisivel(Boolean visivel) {
        this.visivel = visivel;
    }

    public String retornaCandidato() {

        EntityManagerFactory factory = Persistence.createEntityManagerFactory("db1start");
        EntityManager manager = factory.createEntityManager();

        Candidato candidato = new Candidato();
        candidato.setNome(nome);
        candidato.setEmail(email);
        candidato.setTelefone(telefone);
        candidato.setRede_social(rede_social);
        candidato.setContratado(false);
        return "Completado";
    }
}
