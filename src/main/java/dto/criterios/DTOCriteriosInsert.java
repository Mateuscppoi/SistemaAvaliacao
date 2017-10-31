package dto.criterios;

import model.Linguagem;

import java.util.List;

public class DTOCriteriosInsert {

    private final String descricao;
    private final Boolean obrigatorio;
    private final Integer linguagem;

    public DTOCriteriosInsert(String descricao, Boolean obrigatorio, Integer linguagem) {
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

    public Integer getLinguagem() {
        return linguagem;
    }
}
