package dto.funcionarios;

public class DTOFuncionarioUpdate {

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
    }
}
