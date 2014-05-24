package negocio;

import basicas.Pedido;
import basicas.StatusPedido;
import dados.IPedidoDAO;
import dados.PedidoDAO;

public class PedidoNegocio {

	IPedidoDAO dao = new PedidoDAO();
	
	public void inserir(Pedido pedido) throws Exception{
		
		dao.inserir(pedido);
	}
	
	public Pedido consultarPedidoAbertoPorMesa(int mesaId, StatusPedido status){
		
		return dao.consultarPedidoAbertoporMesa(mesaId, status);
	}
	
}
