package dto.criterios;

public class DTOCriteriosDelete {

    private final String descricao;
    private final Integer id;

    public DTOCriteriosDelete(String descricao, Integer id) {
        this.descricao = descricao;
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public Integer getId() { return id; }
}
