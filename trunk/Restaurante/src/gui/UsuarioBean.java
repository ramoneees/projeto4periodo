package gui;

import basicas.Usuario;
import fachada.Fachada;
import fachada.IFachada;

public class UsuarioBean {

	IFachada fachada = new Fachada();
	Usuario usuario = new Usuario();
	private String mensagem;
	
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
	
	
	public String efetuarLogin(Usuario usuario){
		
		try {
			if (fachada.efetuarLogin(usuario)) {
				return "manter_usuario.xhtml?faces-redirect=true";
			}
			
		} catch (Exception e) {
			 mensagem = e.getMessage();
			
		}
		return mensagem;
		
	}
}
