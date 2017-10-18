package DAO;

import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.Query;

import model.Funcionario;


public class AcessoLogin {
	
	@Inject
	private EntityManager manager;
	
	public Funcionario findByName(String email, String senha) {
		Query query = manager.createQuery("Select c from Funcionario c where c.email = :pEmail and c.senha = :pSenha ");
		query.setParameter("pEmail", email);
		query.setParameter("pSenha", senha);
		query.setMaxResults(1);
		return (Funcionario)query.getSingleResult();
	}


}
