package dto.funcionarios;

import model.Avaliacao;
import model.Linguagem;

import java.util.List;

public class DTOFuncionarioUpdate {

    private final String nome;
    private final String email;
    private final String senha;

<<<<<<< HEAD
    public DTOFuncionarioUpdate( String nome, String email, String senha) {
=======
    public DTOFuncionarioUpdate(String nome, String email, String senha, List<Linguagem> especialidade, Boolean avaliador, Boolean administrador, List<Avaliacao> avaliacao, Boolean ativo) {
>>>>>>> b90266edeffc000919ae1a6a04bac8351e594bbb
        this.nome = nome;
        this.email = email;
        this.senha = senha;
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

<<<<<<< HEAD
=======
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

    }
>>>>>>> b90266edeffc000919ae1a6a04bac8351e594bbb
}
