package fachada;

import java.util.List;

import seguranca.LoginInvalidoException;
import basicas.Cliente;
import basicas.Combo;
import basicas.ItemCardapio;
import basicas.Mesa;
import basicas.Pedido;
import basicas.Restaurante;
import basicas.Usuario;



public interface IFachada {

	public void inserir(Cliente cliente) throws Exception;
	
	public void alterar(Cliente cliente) throws Exception;
	
	public void remover(Cliente cliente)throws Exception;
	
	public Cliente consultarClientePorId(Integer id)throws Exception;
	
	public List<Cliente> consultarTodosCliente()throws Exception;

	public void inserir(Mesa mesa) throws Exception;
	
	public void alterar(Mesa mesa) throws Exception;
	
	public void remover(Mesa mesa)throws Exception;
	
	public Mesa consultarPorId(Integer id)throws Exception;
	
	public List<Mesa> consultarTodosMesa()throws Exception;
	
	public void inserir(Restaurante restaurante) throws Exception;
	
	public void alterar(Restaurante restaurante) throws Exception;
	
	public void remover(Restaurante restaurante)throws Exception;
	
	public Restaurante consultarRestaurantePorId(Integer id)throws Exception;
	
	public List<Restaurante> consultarTodosRestaurante()throws Exception;
	
	public void inserir(ItemCardapio item) throws Exception;
	
	public void alterar(ItemCardapio item) throws Exception;
	
	public void remover(ItemCardapio item)throws Exception;
	
	public ItemCardapio consultarItemPorId(Integer id)throws Exception;
	
	public List<ItemCardapio> consultarTodosItem()throws Exception;
	
	public void inserir(Combo combo) throws Exception;
	
	public void alterar(Combo combo) throws Exception;
	
	public void remover(Combo combo)throws Exception;
	
	public Combo consultarComboPorId(Integer id)throws Exception;
	
	public List<Combo> consultarTodosCombo()throws Exception;
	
	public void inserir(Pedido pedido) throws Exception;
	
	public void alterar(Pedido pedido) throws Exception;
	
	public void remover(Pedido pedido)throws Exception;
	
	public Pedido consultarPedidoPorId(Integer id)throws Exception;
	
	public List<Pedido> consultarTodosPedido()throws Exception;
	
	public void inserir(Usuario usuario)throws Exception;
	
	public void alterar(Usuario usuario)throws Exception;
	
	public Usuario efetuarLogin(String login, String senha) throws LoginInvalidoException;
	
	
}
