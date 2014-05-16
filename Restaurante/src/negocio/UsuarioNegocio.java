package negocio;


import seguranca.LoginInvalidoException;
import dados.UsuarioDAO;
import basicas.Usuario;

public class UsuarioNegocio {
	
	UsuarioDAO usuariodao = new UsuarioDAO();
	
	public void inserir(Usuario usuario) throws Exception{
		if (usuario.getNome().isEmpty() || usuario.getNome() == null) {
			throw new Exception("informe o nome do usuario");
		}else if (usuario.getLogin().isEmpty() || usuario.getLogin() == null) {
			throw new Exception("informe o login do usuario");
		}else if (usuario.getSenha().isEmpty() || usuario.getSenha() == null) {
			throw new Exception("informe a senha do usuario");
		}
		
		usuariodao.inserir(usuario);
	}
	
	public void alterar(Usuario usuario) throws Exception{
		if (usuario.getNome().isEmpty() || usuario.getNome() == null) {
			throw new Exception("informe o nome do usuario");
		}else if (usuario.getLogin().isEmpty() || usuario.getLogin() == null) {
			throw new Exception("informe o login do usuario");
		}else if (usuario.getSenha().isEmpty() || usuario.getSenha() == null) {
			throw new Exception("informe a senha do usuario");
		}
		
		usuariodao.alterar(usuario);
	}
	
	
	
	public void remover(Usuario usuario){
		
		usuariodao.remover(usuario);
	}
	
	public Usuario efetuarLogin(String login, String senha)
			throws LoginInvalidoException {
		return usuariodao.efetuarLogin(login, senha);
	}

}
