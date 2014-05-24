package dados;

import basicas.Pedido;
import basicas.StatusPedido;
import DAO.IDAOGenerico;

public interface IPedidoDAO extends IDAOGenerico<Pedido> {

	public Pedido consultarPedidoAbertoporMesa(int mesaId, StatusPedido status) throws Exception;
	
	
}
