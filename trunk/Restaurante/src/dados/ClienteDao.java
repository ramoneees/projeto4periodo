package dados;

import java.util.List;

import javax.persistence.TypedQuery;

import basicas.Cliente;


public class ClienteDao extends DAO.DAOGenerico<Cliente> implements IClienteDAO {

	@Override
	public List<Cliente> pesquisarClientePorNome(String nome, TipoPesquisaString tipoPesquisa) {
		TypedQuery<Cliente> tq = this.entityManager.createNamedQuery("Cliente.findByNome", Cliente.class);
		if (tipoPesquisa == TipoPesquisaString.COMECA_COM){
			tq.setParameter("n", nome + "%");	
		} else if (tipoPesquisa == TipoPesquisaString.CONTEM){
			tq.setParameter("n", "%" + nome + "%");	
		}
		return tq.getResultList();
	}

}
