package dados;

import DAO.IDAOGenerico;
import basicas.Usuario;

public interface IUsuarioDAO extends IDAOGenerico<Usuario>{
	
	public boolean efetuarLogin(Usuario usuario);

}
