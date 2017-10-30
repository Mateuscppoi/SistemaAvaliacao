package model;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "candidato", schema = "sistemadeavaliacao")
public class Candidato {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @PrimaryKeyJoinColumn
    private Long id_candidato;

    @Column
    private String nome;

    @Column
    private String email;

    @Column
    private String telefone;

    @Column
    private String rede_social;

    @Column
    private Boolean contratado;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "candidato")
    private List<Prova> prova;


    public Long getId_candidato() {
        return id_candidato;
    }

    public void setId_candidato(Long id_candidato) {
        this.id_candidato = id_candidato;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getRede_social() {
        return rede_social;
    }

    public void setRede_social(String redeSocial) {
        this.rede_social = redeSocial;
    }

    public Boolean getContratado() {
        return contratado;
    }

    public void setContratado(Boolean contratado) {
        this.contratado = contratado;
    }
}
