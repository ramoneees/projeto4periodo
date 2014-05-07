package fachada;

import java.util.List;

import negocio.ClienteNegocio;
import basicas.Cliente;
import basicas.Combo;
import basicas.ItemCardapio;
import basicas.Mesa;
import basicas.Pedido;
import basicas.Restaurante;

public class Fachada implements IFcahada {

	ClienteNegocio clienteNegocio = new ClienteNegocio();
	@Override
	public void inserir(Cliente cliente) throws Exception {
		clienteNegocio.inserir(cliente);
		
	}
	
	@Override
	public void alterar(Cliente cliente) throws Exception {
		clienteNegocio.alterar(cliente);
		
	}

	@Override
	public void remover(Cliente cliente) throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Cliente consultarClientePorId(Integer id) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Cliente> consultarTodosCliente() throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void inserir(Mesa mesa) throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void alterar(Mesa mesa) throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void remover(Mesa mesa) throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Mesa consultarPorId(Integer id) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Mesa> consultarTodosMesa() throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void inserir(Restaurante restaurante) throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void alterar(Restaurante restaurante) throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void remover(Restaurante restaurante) throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Restaurante consultarRestaurantePorId(Integer id) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Restaurante> consultarTodosRestaurante() throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void inserir(ItemCardapio item) throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void alterar(ItemCardapio item) throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void remover(ItemCardapio item) throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public ItemCardapio consultarItemPorId(Integer id) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<ItemCardapio> consultarTodosItem() throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void inserir(Combo combo) throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void alterar(Combo combo) throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void remover(Combo combo) throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public ItemCardapio consultarComboPorId(Integer id) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<ItemCardapio> consultarTodosCombo() throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void inserir(Pedido pedido) throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void alterar(Pedido pedido) throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void remover(Pedido pedido) throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Pedido consultarPedidoPorId(Integer id) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Pedido> consultarTodosPedido() throws Exception {
		// TODO Auto-generated method stub
		return null;
	}
	

	
}
