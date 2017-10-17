package DAO;

import model.Avaliacao;
import model.Funcionario;
import model.Linguagem;

import javax.faces.bean.ManagedBean;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.List;

@ManagedBean
public class InsereFuncionario {

    private String nome;
    private String email;
    private String senha;
    private List<Linguagem> especialidade;
    private Boolean avaliador;
    private Boolean administrador;
    private List<Avaliacao> avaliacao;

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

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public List<Linguagem> getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(List<Linguagem> especialidade) {
        this.especialidade = especialidade;
    }

    public Boolean getAvaliador() {
        return avaliador;
    }

    public void setAvaliador(Boolean avaliador) {
        this.avaliador = avaliador;
    }

    public Boolean getAdministrador() {
        return administrador;
    }

    public void setAdministrador(Boolean administrador) {
        this.administrador = administrador;
    }

    public List<Avaliacao> getAvaliacao() {
        return avaliacao;
    }

    public void setAvaliacao(List<Avaliacao> avaliacao) {
        this.avaliacao = avaliacao;
    }



    public String retornaFuncionario() {
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("db1start");
        EntityManager manager = factory.createEntityManager();


        Funcionario funcionario = new Funcionario();
        funcionario.setAdministrador(administrador);
        funcionario.setAvaliador(avaliador);
        funcionario.setNome(nome);
        funcionario.setEmail(email);
        funcionario.setSenha(senha);
        funcionario.setEspecialidade(manager.find(Linguagem.class, especialidade));
        manager.getTransaction().begin();
        manager.persist(funcionario);
        manager.getTransaction().commit();

        return "Completado";
    }
}
