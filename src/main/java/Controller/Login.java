package Controller;

import javax.enterprise.context.RequestScoped;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.context.ExternalContext;
import javax.faces.context.FacesContext;
import javax.inject.Inject;
import javax.inject.Named;
import javax.servlet.http.HttpSession;

import DAO.AcessoLogin;
import model.Funcionario;

@ManagedBean
@RequestScoped
@Named
public class Login {
	
	@Inject
	private AcessoLogin acesso;
	

    private String email;
    private String senha;

    public String getEmail() {
        return email;
    }

    public String getSenha() {
        return senha;
    }

    public void setEmail(String email) {
        this.email = email;
    }


	public void setSenha(String senha) {
        this.senha = senha;
    }


    public String autentica() {
    	Funcionario funcionario = acesso.findByName(email, senha);
    	
    	FacesContext fc = FacesContext.getCurrentInstance();
    	
    	if (funcionario.getAvaliador()) {

			ExternalContext ec = fc.getExternalContext();
			HttpSession session = (HttpSession) ec.getSession(false);
			session.setAttribute("email", this.email);

			return "/homeAval";
    	}
    	
		if (funcionario.getAdministrador()) {

			ExternalContext ec = fc.getExternalContext();
			HttpSession session = (HttpSession) ec.getSession(false);
			session.setAttribute("email", this.email);

			return "/homeRH";
		} else {
			FacesMessage fm = new FacesMessage("Usuário e/ou senha inválidos");
			fm.setSeverity(FacesMessage.SEVERITY_ERROR);
			fc.addMessage(null, fm);
			return "/login";
		}
    }
}
