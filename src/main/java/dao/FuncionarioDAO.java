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

    public Integer possui;

    public List<Funcionario> showFuncionarios () {
        return manager.createQuery("select f from Funcionario f where avaliador = true ").getResultList();
    }

    public Funcionario getById(Long id) {
        Query query = manager.createQuery("select f from Funcionario f where id = :pId");
        query.setParameter("pId",id);

        return (Funcionario) query.getSingleResult();
    }

    public Funcionario getByName(String nome) {
        Query query = manager.createQuery("select f from Funcionario f where nome like :pNome");
        query.setParameter("pNome","%"+nome+"%");

        return (Funcionario) query.getSingleResult();
    }

    public Integer showPendentes() {
        return manager.createQuery("select a.status_ava from Avaliacao a where status_ava = 'PENDENTE' ").getMaxResults();
    }

    @Transactional
    public String novoFuncionario(DTOFuncionarioInsert request){
        possui = 0;
      // /  query.setParameter("pNome","%"+request.getNome()+"%");
     //   possui = query.getMaxResults();
        if (possui != 0) {
            Funcionario funcionario = new Funcionario();
            if (request.getAdministrador() == true) {
                funcionario.setAdministrador(true);
                funcionario.setAvaliador(false);
            } else {
                funcionario.setAdministrador(false);
                funcionario.setAvaliador(true);
            }
            funcionario.setNome(request.getNome());
            funcionario.setEmail(request.getEmail());
            funcionario.setSenha(request.getSenha());
            funcionario.setEspecialidade(manager.find(Linguagem.class, 3L));
            funcionario.setAtivo(true);
            manager.persist(funcionario);

            return "Completado";
        }

        return "Ja existe";
    }

    @Transactional
    public String DeleteFuncionario(DTOFuncionarioDelete request){
        Funcionario funcionario = getByName(request.getNome());
        funcionario.setAtivo(Boolean.FALSE);
        try {
            manager.merge(funcionario);
        } catch (Exception e) {
            System.err.println(e.getMessage());
            return "Erro";
        }
        return "Completado";
    }

    @Transactional
    public String updateFuncionario (DTOFuncionarioUpdate request) {

        Funcionario funcionario = getByName(request.getNome());
        funcionario.setEmail(request.getEmail());
        funcionario.setSenha(request.getSenha());
        try {
            manager.merge(funcionario);
        } catch (Exception e) {
            System.err.println(e.getMessage());
            return "Erro";
        }

        return "Completado";
    }


}
