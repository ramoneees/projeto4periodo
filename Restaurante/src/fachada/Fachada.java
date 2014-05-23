package fachada;

import java.util.List;

import seguranca.LoginInvalidoException;
import negocio.ClienteNegocio;
import negocio.ComboNegocio;
import negocio.ItemCardapioNegocio;
import negocio.ItemCardapioPedidoNegocio;
import negocio.MesaNegocio;
import negocio.PedidoNegocio;
import negocio.RestauranteNegocio;
import negocio.UsuarioNegocio;
import basicas.Cliente;
import basicas.Combo;
import basicas.ItemCardapio;
import basicas.ItemCardapioPedido;
import basicas.Mesa;
import basicas.Pedido;
import basicas.Restaurante;
import basicas.Usuario;

public class Fachada implements IFachada {

	ClienteNegocio clienteNegocio = new ClienteNegocio();
	MesaNegocio mesaNegocio = new MesaNegocio();
	ItemCardapioNegocio itemNegocio = new ItemCardapioNegocio();
	ComboNegocio comboNegocio = new ComboNegocio();
	UsuarioNegocio usuarioNegocio = new UsuarioNegocio();
	PedidoNegocio pedidoNegocio = new PedidoNegocio();
	ItemCardapioPedidoNegocio itemPedido = new ItemCardapioPedidoNegocio();
	
	RestauranteNegocio restNegocio = new RestauranteNegocio();
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
		clienteNegocio.remover(cliente);
		
	}

	@Override
	public Cliente consultarClientePorId(Integer id) throws Exception {
		
		return clienteNegocio.consultarPorId(id);
	}

	@Override
	public List<Cliente> consultarTodosCliente() throws Exception {
		return clienteNegocio.consultarTodos();
	}

	@Override
	public void inserir(Mesa mesa) throws Exception {
		
		mesaNegocio.inserir(mesa);
		
	}

	@Override
	public void alterar(Mesa mesa) throws Exception {
		mesaNegocio.alterar(mesa);
		
	}

	@Override
	public void remover(Mesa mesa) throws Exception {
		mesaNegocio.remover(mesa);
		
	}

	@Override
	public Mesa consultarPorMesaId(Integer id) throws Exception {
		
		return mesaNegocio.consultarMesaporId(id);
	}

	@Override
	public List<Mesa> consultarTodosMesa() throws Exception {
		
		return  mesaNegocio.consultarTodos();
	}

	@Override
	public void inserir(Restaurante restaurante) throws Exception {
		restNegocio.inserir(restaurante);
		
	}

	@Override
	public void alterar(Restaurante restaurante) throws Exception {
		restNegocio.alterar(restaurante);
		
	}

	@Override
	public void remover(Restaurante restaurante) throws Exception {
		
		restNegocio.remover(restaurante);
		
	}

	@Override
	public Restaurante consultarRestaurantePorId(Integer id) throws Exception {
		// TODO Auto-generated method stub
		return restNegocio.consultarPorId(id);
	}

	@Override
	public List<Restaurante> consultarTodosRestaurante() throws Exception {
		// TODO Auto-generated method stub
		return restNegocio.consultarTodos();
	}

	@Override
	public void inserir(ItemCardapio item) throws Exception {
		itemNegocio.inserir(item);
		
	}

	@Override
	public void alterar(ItemCardapio item) throws Exception {
		itemNegocio.alterar(item);
		
	}

	@Override
	public void remover(ItemCardapio item) throws Exception {
		itemNegocio.remover(item);
		
	}

	@Override
	public ItemCardapio consultarItemPorId(Integer id) throws Exception {
		// TODO Auto-generated method stub
		return itemNegocio.consultarPorId(id);
	}

	@Override
	public List<ItemCardapio> consultarTodosItem() throws Exception {
		// TODO Auto-generated method stub
		return itemNegocio.consultarTodos();
	}

	@Override
	public void inserir(Combo combo) throws Exception {
		comboNegocio.inserir(combo);
		
	}

	@Override
	public void alterar(Combo combo) throws Exception {
		comboNegocio.alterar(combo);
		
	}

	@Override
	public void remover(Combo combo) throws Exception {
		comboNegocio.remover(combo);
		
		
	}

	@Override
	public Combo consultarComboPorId(Integer id) throws Exception {
		// TODO Auto-generated method stub
		return comboNegocio.consultarPorId(id);
	}

	@Override
	public List<Combo> consultarTodosCombo() throws Exception {
		// TODO Auto-generated method stub
		return comboNegocio.consultarTodos();
	}

	@Override
	public void inserir(Pedido pedido) throws Exception {
		pedidoNegocio.inserir(pedido);
		
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

	@Override
	public void inserir(Usuario usuario) throws Exception {
		usuarioNegocio.inserir(usuario);
		
	}

	@Override
	public void alterar(Usuario usuario) throws Exception {
		usuarioNegocio.alterar(usuario);
		
	}

	@Override
	public Usuario efetuarLogin(String login, String senha)throws LoginInvalidoException {
		// TODO Auto-generated method stub
		return usuarioNegocio.efetuarLogin(login, senha);
	}

	@Override
	public void inserir(ItemCardapioPedido itemCardPed) throws Exception {
		itemPedido.inserir(itemCardPed);
		
	}

	
}
