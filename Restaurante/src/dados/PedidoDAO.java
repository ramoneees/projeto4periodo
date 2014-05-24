package dados;

import javax.persistence.TypedQuery;

import basicas.Pedido;
import basicas.StatusPedido;
import DAO.DAOGenerico;

public class PedidoDAO extends DAOGenerico<Pedido> implements IPedidoDAO {

	public Pedido consultarPedidoAbertoporMesa(int mesaId, StatusPedido status)
			throws Exception {

		try {

			TypedQuery<Pedido> query = getEntityManager().createNamedQuery(
					"consultarPedidoAbertoporMesa", Pedido.class);
			query.setParameter("id", mesaId);
			query.setParameter("status", status);
			return query.getSingleResult();

		} catch (Exception e) {
			// TODO: handle exception
		}
		return null;
	}
	

}
