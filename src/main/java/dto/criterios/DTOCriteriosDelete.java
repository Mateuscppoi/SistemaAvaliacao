package dto.criterios;

public class DTOCriteriosDelete {

    private final String descricao;
    private final Long id;

    public DTOCriteriosDelete(String descricao, Long id) {
        this.descricao = descricao;
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public Long getId() {
        return id;
    }
}
