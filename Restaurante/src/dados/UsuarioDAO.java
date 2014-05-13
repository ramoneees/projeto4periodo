package dados;


import javax.persistence.Query;

import basicas.Usuario;

public class UsuarioDAO extends DAO.DAOGenerico<Usuario> implements IUsuarioDAO {

	@Override
	public boolean efetuarLogin(Usuario u){
		Query q1 = this.entityManager.createQuery("SELECT u from Usuario u WHERE  u.login = :login  and  u.senha = :senha ");
		q1.setParameter("login", u.getLogin());
		q1.setParameter("senha", u.getSenha());
		
		if (q1.getResultList().isEmpty()) {
			return false;
		}else{
		
		return true;
		}
	}
	

}
