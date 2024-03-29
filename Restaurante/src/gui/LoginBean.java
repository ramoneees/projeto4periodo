package gui;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;


import javax.faces.bean.SessionScoped;


import javax.faces.context.FacesContext;

import seguranca.LoginInvalidoException;
import basicas.Usuario;
import fachada.Fachada;
import fachada.IFachada;


@ManagedBean
@SessionScoped
public class LoginBean {

	private IFachada fachada = new Fachada();

	private Usuario usuarioLogado = new  Usuario();

	private String login;
	private String senha;
	private String mensagem;
	
	public String getMensagem() {
		return mensagem;
	}
	public void setMensagem(String mensagem) {
		this.mensagem = mensagem;
	}
	
	public Usuario getUsuarioLogado() {
		return usuarioLogado;
	}
	public void setUsuarioLogado(Usuario usuarioLogado) {
		this.usuarioLogado = usuarioLogado;
	}
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public String getsenha() {
		return senha;
	}
	public void setsenha(String senha) {
		this.senha = senha;
	}
	public String efetuarLogin() {
		try {
			System.out.println("teste");
			usuarioLogado = fachada.efetuarLogin(login, senha);
			return "home.xhtml?faces-redirect=true";
		} catch (LoginInvalidoException e) {
		
			 //mensagem = e.getMessage();
		/*	 FacesContext.getCurrentInstance().addMessage(null,
					new FacesMessage("Login/Senha Incorretos"));*/

			 FacesContext.getCurrentInstance().addMessage(null,
					new FacesMessage(FacesMessage.SEVERITY_ERROR,null,e.getMessage()));
			 
			 System.out.println(mensagem);
		}
		return null;
		
}
	public String efetuarLogoff() {
		usuarioLogado = null;
		return "index.xhtml?faces-redirect=true";
	}
	
	
	
}
