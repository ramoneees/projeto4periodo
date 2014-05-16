package dados;

import seguranca.LoginInvalidoException;
import DAO.IDAOGenerico;
import basicas.Usuario;

public interface IUsuarioDAO extends IDAOGenerico<Usuario>{
	
	public Usuario efetuarLogin(String login, String senha) throws LoginInvalidoException;

}
