package negocio;

import basicas.Pedido;
import dados.IPedidoDAO;
import dados.PedidoDAO;

public class PedidoNegocio {

	IPedidoDAO dao = new PedidoDAO();
	
	public void inserir(Pedido pedido) throws Exception{
		
		if(pedido.getCliente() == null){
			throw new Exception("Favor Inserir os Dados do Cliente");
			//dao.inserir(pedido);
		}
		
		
	}
	
}
