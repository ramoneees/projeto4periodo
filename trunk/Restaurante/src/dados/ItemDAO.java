package dados;

import java.util.List;

import javax.persistence.TypedQuery;

import basicas.Item;

public class ItemDAO extends DAO.DAOGenerico<Item> implements IItemDAO{

	@Override
	public List<Item> pesquisarItemsPorTitulo(String nome,TipoPesquisaString tipoPesquisa) {
		TypedQuery<Item> tq = this.entityManager.createNamedQuery("Item.findByNome", Item.class);
		if (tipoPesquisa == TipoPesquisaString.COMECA_COM){
			tq.setParameter("valor", nome + "%");	
		} else if (tipoPesquisa == TipoPesquisaString.CONTEM){
			tq.setParameter("valor", "%" + nome + "%");	
		}
		return tq.getResultList();
	}

}
