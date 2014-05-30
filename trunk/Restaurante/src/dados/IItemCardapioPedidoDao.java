package dados;

import java.util.List;

import DAO.IDAOGenerico;
import basicas.ItemCardapio;
import basicas.ItemCardapioPedido;
import basicas.Relatorio;

public interface IItemCardapioPedidoDao  extends IDAOGenerico<ItemCardapioPedido>{

	public List<ItemCardapioPedido> consultaritemPedido(int idPedido) throws Exception;
	
	public List<Relatorio> pesquisarItensMaisVendidos() throws Exception;
	
}
