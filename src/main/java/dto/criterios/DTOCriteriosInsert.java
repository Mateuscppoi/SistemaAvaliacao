package dto.criterios;

import model.Linguagem;

public class DTOCriteriosInsert {

    private final String descricao;
    private final Boolean obrigatorio;
    private final List<Linguagem> linguagem;

    public DTOCriteriosInsert(String descricao, Boolean obrigatorio, List<Linguagem> linguagem) {
        this.descricao = descricao;
        this.obrigatorio = obrigatorio;
        this.linguagem = linguagem;
    }

    public String getDescricao() {
        return descricao;
    }

    public Boolean getObrigatorio() {
        return obrigatorio;
    }

    public List<Linguagem> getLinguagem() {
        return linguagem;
    }
}
