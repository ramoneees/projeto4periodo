package negocio;

import java.util.List;

import basicas.ItemCardapioPedido;
import basicas.Relatorio;
import dados.IItemCardapioPedidoDao;
import dados.ItemCardapioPedidoDAO;

public class ItemCardapioPedidoNegocio {

	IItemCardapioPedidoDao dao = new ItemCardapioPedidoDAO();

	public void inserir(ItemCardapioPedido itemCardPedido) throws Exception {
		if (itemCardPedido.getItem() == null) {
			throw new Exception("O item nao pode ser nulo!");
		} else if (itemCardPedido.getPedido() == null) {
			throw new Exception("O pedido nao pode ser nulo!");
		}

		if (itemCardPedido.getQtd() == 0) {

			throw new Exception("informe a quantidade do item");
		}

		dao.inserir(itemCardPedido);
	}

	public List<ItemCardapioPedido> consultaritemPedido(int idPedido)
			throws Exception {

		return dao.consultaritemPedido(idPedido);

	}
	
	public List<Relatorio> pesquisarItensMaisVendidos()
			throws Exception {

		return dao.pesquisarItensMaisVendidos();

	}
}
