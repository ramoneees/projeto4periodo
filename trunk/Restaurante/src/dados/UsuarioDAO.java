package dados;



import javax.persistence.TypedQuery;

import seguranca.LoginInvalidoException;
import basicas.Usuario;

public class UsuarioDAO extends DAO.DAOGenerico<Usuario> implements IUsuarioDAO {

	@Override
	public Usuario efetuarLogin(String login, String senha) throws LoginInvalidoException{
		try {
			TypedQuery<Usuario> query = getEntityManager().createNamedQuery("efetuarLogin", Usuario.class);
			query.setParameter("log", login);
			query.setParameter("sen", senha);
			return query.getSingleResult();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
			System.out.println("Login/senha não existe");
			throw new LoginInvalidoException("Login/senha não existe");
		}
	
	
	

	}
	
}
