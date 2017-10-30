package dto.funcionarios;

import model.Linguagem;

public class DTOFuncionarioInsert {
    private final String nome;
    private final String email;
    private final String senha;
    //private final Linguagem especialidade;
    private final Boolean avaliador;
    private final Boolean administrador;
    private final Boolean ativo;
    private final String linguagem;

    public DTOFuncionarioInsert(String nome, String email, String senha, String linguagem, Boolean avaliador, Boolean administrador, Boolean ativo) {
        this.nome = nome;
        this.email = email;
        this.senha = senha;
        this.linguagem = linguagem;
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

    public String getLinguagem() {
        return linguagem;
    }

/*public Linguagem getEspecialidade() {
        return especialidade;
    }*/

    public Boolean getAdministrador() {
        return administrador;
    }

    public Boolean getAtivo() {
        return ativo;
    }
}
