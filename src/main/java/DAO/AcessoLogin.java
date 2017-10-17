package DAO;

import java.util.List;

import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.Query;

import model.Funcionario;


public class AcessoLogin {
	
	@Inject
	private EntityManager manager;
	
	public List<Funcionario> findByName(String email, String senha) {
		Query query = manager.createQuery("Select c.email from Funcionario where c.email = :pEmail and c.senha = :pSenha");
		query.setParameter("pEmail", email);
		query.setParameter("pSenha", senha);
		return query.getResultList();
	}


}
