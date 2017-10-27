package dto.funcionarios;

import model.Avaliacao;
import model.Linguagem;

import java.util.List;

public class DTOFuncionarioInsert {
    private final String nome;
    private final String email;
    private final String senha;
   // private final List<Linguagem> especialidade;
    private final Boolean avaliador;
    private final Boolean administrador;
    private final Boolean ativo;

    public DTOFuncionarioInsert(String nome, String email, String senha, Boolean avaliador, Boolean administrador, Boolean ativo) {
        this.nome = nome;
        this.email = email;
        this.senha = senha;
        this.avaliador = avaliador;
        this.administrador = administrador;
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

   // public List<Linguagem> getEspecialidade() {
   //     return especialidade;
  //  }

    public Boolean getAvaliador() {
        return avaliador;
    }

    public Boolean getAdministrador() {
        return administrador;
    }

    public Boolean getAtivo() {
        return ativo;
    }
}
