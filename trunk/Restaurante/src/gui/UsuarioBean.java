package gui;

import javax.faces.bean.ManagedBean;

import basicas.Usuario;
import fachada.Fachada;
import fachada.IFachada;

@ManagedBean
public class UsuarioBean {

	private IFachada fachada = new Fachada();
	private Usuario usuario = new Usuario();
	private String mensagem;
	
	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public String getMensagem() {
		return mensagem;
	}

	public void setMensagem(String mensagem) {
		this.mensagem = mensagem;
	}


	
	
	public String salvar() {

		try {
			if (usuario.getId() == 0) {
				fachada.inserir(usuario);
			} else {
				fachada.alterar(usuario);
				usuario = new Usuario();
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

		return "manter_usuario.xhtml?faces-redirect=true";
	}

	public String exibir(Usuario usuario) {
		this.usuario = usuario;
		return null;

	}
	
	
	
	
}
