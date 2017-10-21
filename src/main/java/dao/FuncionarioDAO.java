package dao;

import dto.funcionarios.DTOFuncionarioDelete;
import dto.funcionarios.DTOFuncionarioInsert;
import dto.funcionarios.DTOFuncionarioUpdate;
import model.Funcionario;
import model.Linguagem;

import javax.inject.Inject;
import javax.inject.Named;
import javax.persistence.EntityManager;
import java.util.List;

@Named
public class FuncionarioDAO {
    @Inject
    private EntityManager manager;

    public List<Funcionario> showFuncionarios () {
        return manager.createQuery("select f from Funcionario f where avaliador = true ").getResultList();
    }

    public String novoFuncionario(DTOFuncionarioInsert request){
        Funcionario funcionario = new Funcionario();
        funcionario.setAdministrador(request.getAdministrador());
        funcionario.setAvaliador(request.getAvaliador());
        funcionario.setNome(request.getNome());
        funcionario.setEmail(request.getEmail());
        funcionario.setSenha(request.getSenha());
        funcionario.setEspecialidade(manager.find(Linguagem.class, request.getEspecialidade()));
        funcionario.setAtivo(true);

        manager.getTransaction().begin();
        manager.persist(funcionario);
        manager.getTransaction().commit();

        return "Completado";
    }

    public String DeleteFuncionario(DTOFuncionarioDelete request, String id){
        Funcionario funcionario = new Funcionario();
        funcionario.setId(funcionario.getId());
        funcionario.setAtivo(false);
        manager.getTransaction().begin();
        manager.persist(funcionario);
        manager.getTransaction().commit();

        return "Completado";
    }

    public String UpdateFuncionario (DTOFuncionarioUpdate request) {

        return "Completado";
    }

}
