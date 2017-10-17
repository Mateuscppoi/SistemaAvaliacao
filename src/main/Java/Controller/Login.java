package Controller;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.context.ExternalContext;
import javax.faces.context.FacesContext;
import javax.servlet.http.HttpSession;

@ManagedBean
public class Login {
	private static final String USUARIO_CORRETO = "admin";
	private static final String SENHA_CORRETA = "admin";

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
    
    //MÉTODO
    //CHAMAR OUTRA CLASSE, VALIDANDO LOGIN;
    
    public String autentica() {
    	FacesContext fc = FacesContext.getCurrentInstance();

		if (USUARIO_CORRETO.equals(this.email) && SENHA_CORRETA.equals(this.senha)) {

			ExternalContext ec = fc.getExternalContext();
			HttpSession session = (HttpSession) ec.getSession(false);
			session.setAttribute("email", this.email);

			return "/homeRH";
		} else {
			FacesMessage fm = new FacesMessage("usuário e/ou senha inválidos");
			fm.setSeverity(FacesMessage.SEVERITY_ERROR);
			fc.addMessage(null, fm);
			return "/login";
		}
    }
}
