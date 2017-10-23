package dao;

import dto.funcionarios.DTOFuncionarioDelete;
import dto.funcionarios.DTOFuncionarioInsert;
import dto.funcionarios.DTOFuncionarioUpdate;
import model.Funcionario;
import model.Linguagem;

import javax.inject.Inject;
import javax.inject.Named;
import javax.persistence.EntityManager;
import javax.persistence.Query;
import java.util.List;

@Named
public class FuncionarioDAO {
    @Inject
    private EntityManager manager;

    private Integer idFuncionario;

    public List<Funcionario> showFuncionarios () {
        return manager.createQuery("select f from Funcionario f where avaliador = true ").getResultList();
    }

   /* public Integer IdFuncionario(String nome) {
        Query query = manager.createQuery("select f.id from funcionario f where f.nome = :pNome");
        query.setParameter("pNome", "%"+nome+"%");
        idFuncionario = query.getFirstResult();

        return idFuncionario;
    }*/

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

    public String DeleteFuncionario(DTOFuncionarioDelete request, String nome){
        try {
            Query query = manager.createQuery("select f.id from funcionario f where f.nome = :pNome");
            query.setParameter("pNome", "%"+nome+"%");
            idFuncionario = query.getFirstResult();
            manager.getTransaction().begin();
            Query query1 =  manager.createQuery("update funcionario f set f.ativo = false where f.id = :pId");
            query.setParameter("pId", idFuncionario);
            manager.getTransaction().commit();
        } catch (Exception e) {
            System.err.println();
            return "Erro";
        }

        return "Completado";
    }

    public String UpdateFuncionario (DTOFuncionarioUpdate request) {

        return "Completado";
    }

}
