package negocio;

import basicas.Pedido;
import dados.IPedidoDAO;
import dados.PedidoDAO;

public class PedidoNegocio {

	IPedidoDAO dao = new PedidoDAO();
	
	public void inserir(Pedido pedido) throws Exception{
		
		dao.inserir(pedido);
	}
	
}