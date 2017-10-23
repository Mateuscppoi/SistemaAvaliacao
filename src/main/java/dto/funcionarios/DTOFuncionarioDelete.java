package dto.funcionarios;

public class DTOFuncionarioDelete {

    private final Boolean ativo;
    private final String nome;

    public DTOFuncionarioDelete(Boolean ativo, String nome) {
        this.ativo = ativo;
        this.nome = nome;
    }

    public Boolean getAtivo() {
        return ativo;
    }

    public String getNome() {
        return nome;
    }
}
