package dados;

import java.util.List;

import javax.persistence.Query;
import javax.persistence.TypedQuery;

import basicas.ItemCardapio;
import basicas.ItemCardapioPedido;
import basicas.Relatorio;


public class ItemCardapioPedidoDAO extends DAO.DAOGenerico<ItemCardapioPedido> implements IItemCardapioPedidoDao{

	@Override
	public List<ItemCardapioPedido> consultaritemPedido(int idPedido) throws Exception {
		
		try {
			TypedQuery<ItemCardapioPedido> query = getEntityManager().createNamedQuery("consultarItensPedido",ItemCardapioPedido.class);
			query.setParameter("id", idPedido);
			return query.getResultList();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public List<Relatorio> pesquisarItensMaisVendidos()
			throws Exception {
		
		try {
			TypedQuery<Relatorio> query = getEntityManager().createNamedQuery("pesquisarItensMaisVendidos", Relatorio.class);
			return query.getResultList();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

}
