package dto.funcionarios;

import model.Avaliacao;
import model.Linguagem;

import java.util.List;

public class DTOFuncionarioUpdate {
<<<<<<< HEAD

    private final String link_prova;
    private final String prazo;
    private final String data_solic_ava;

    public DTOFuncionarioUpdate(String link_prova, String prazo, String data_solic_ava) {
        this.link_prova = link_prova;
        this.prazo = prazo;
        this.data_solic_ava = data_solic_ava;
    }

    public String getLink_prova() {
        return link_prova;
    }

    public String getPrazo() {
        return prazo;
    }

    public String getData_solic_ava() {
        return data_solic_ava;
=======
    private final String nome;
    private final String email;
    private final String senha;
    private final List<Linguagem> especialidade;
    private final Boolean avaliador;
    private final Boolean administrador;
    private final List<Avaliacao> avaliacao;
    private final Boolean ativo;

    public DTOFuncionarioUpdate(String nome, String email, String senha, List<Linguagem> especialidade, Boolean avaliador, Boolean administrador, List<Avaliacao> avaliacao, Boolean ativo) {
        this.nome = nome;
        this.email = email;
        this.senha = senha;
        this.especialidade = especialidade;
        this.avaliador = avaliador;
        this.administrador = administrador;
        this.avaliacao = avaliacao;
        this.ativo = ativo;
    }

    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }

    public String getSenha() {
        return senha;
    }

    public List<Linguagem> getEspecialidade() {
        return especialidade;
    }

    public Boolean getAvaliador() {
        return avaliador;
    }

    public Boolean getAdministrador() {
        return administrador;
    }

    public List<Avaliacao> getAvaliacao() {
        return avaliacao;
    }

    public Boolean getAtivo() {
        return ativo;
>>>>>>> 9d375e3c161fc378e397f4a276e6b64528d4ec76
    }
}
