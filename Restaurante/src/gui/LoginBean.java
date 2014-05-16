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
			return "menu.xhtml?faces-redirect=true";
		} catch (LoginInvalidoException e) {
		
			FacesContext.getCurrentInstance().addMessage(null,
					new FacesMessage("Login/Senha Incorretos"));
		}
		return "menu.xhtml?faces-redirect=true";
		
}
	
	public String getMensagem() {
		return mensagem;
	}
	public void setMensagem(String mensagem) {
		this.mensagem = mensagem;
	}
	public void teste(){
		
		this.mensagem  = "testando";
		
	}
	
}
