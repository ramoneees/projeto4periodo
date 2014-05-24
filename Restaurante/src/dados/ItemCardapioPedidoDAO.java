package dados;

import java.util.List;

import javax.persistence.TypedQuery;

import basicas.ItemCardapio;
import basicas.ItemCardapioPedido;


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

}
