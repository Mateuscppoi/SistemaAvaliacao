package dto.funcionarios;

public class DTOFuncionarioDelete {

    private final Boolean ativo;
    private final Long id;

    public DTOFuncionarioDelete(Boolean ativo, Long id) {
        this.ativo = ativo;
        this.id = id;
    }

    public Boolean getAtivo() {
        return ativo;
    }

    public Long getId() {
        return id;
    }
}
