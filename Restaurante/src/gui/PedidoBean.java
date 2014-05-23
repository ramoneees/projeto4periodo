package gui;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.SessionScoped;

import basicas.ItemCardapio;
import basicas.ItemCardapioPedido;
import basicas.Mesa;
import basicas.Pedido;
import basicas.Usuario;
import fachada.Fachada;
import fachada.IFachada;

@ManagedBean
@SessionScoped
public class PedidoBean {

	private List<Pedido> pedidos;
	private Pedido pedido = new Pedido();
	private List<ItemCardapio> itens = new ArrayList<ItemCardapio>();
	private List<ItemCardapio> itensLista;
	private ItemCardapio item = new ItemCardapio();
	private IFachada fachada = new Fachada();
	private List<Mesa> listaMesa = new ArrayList<Mesa>();
	private Mesa mesa = new Mesa();
	private Integer mesaId;
	private int idItem;
	float valorTotal;
	@ManagedProperty("#{loginBean.usuarioLogado}")
	private Usuario usuarioLogado;
	private ItemCardapioPedido itemcardPedido = new ItemCardapioPedido();

	public ItemCardapioPedido getItemcardPedido() {
		return itemcardPedido;
	}

	public void setItemcardPedido(ItemCardapioPedido itemcardPedido) {
		this.itemcardPedido = itemcardPedido;
	}

	public List<Pedido> getPedidos() {
		return pedidos;
	}

	public void setPedidos(List<Pedido> pedidos) {
		this.pedidos = pedidos;
	}

	public ItemCardapio getItem() {
		return item;
	}

	public void setItem(ItemCardapio item) {
		this.item = item;
	}

	public List<Mesa> getListaMesa() {
		try {
			listaMesa = fachada.consultarTodosMesa();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return listaMesa;
	}

	public void setListaMesa(List<Mesa> listaMesa) {
		this.listaMesa = listaMesa;
	}

	public Mesa getMesa() {
		return mesa;
	}

	public void setMesa(Mesa mesa) {
		this.mesa = mesa;
	}

	public Integer getMesaId() {
		return mesaId;
	}

	public void setMesaId(Integer mesaId) {
		this.mesaId = mesaId;
	}

	public List<ItemCardapio> getItensLista() {
		try {

			itensLista = fachada.consultarTodosItem();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return itensLista;
	}

	public void setItensLista(List<ItemCardapio> itensLista) {
		this.itensLista = itensLista;
	}

	public Usuario getUsuarioLogado() {
		return usuarioLogado;
	}

	public void setUsuarioLogado(Usuario usuarioLogado) {
		this.usuarioLogado = usuarioLogado;
	}

	public Pedido getPedido() {
		return pedido;
	}

	public void setPedido(Pedido pedido) {
		this.pedido = pedido;
	}

	public List<ItemCardapio> getItens() {
		return itens;
	}

	public void setItens(List<ItemCardapio> itens) {
		this.itens = itens;
	}

	public int getIdItem() {
		return idItem;
	}

	public void setIdItem(int idItem) {
		this.idItem = idItem;
	}

	public float getValorTotal() {
		return valorTotal;
	}

	public void setValorTotal(float valorTotal) {
		this.valorTotal = valorTotal;
	}
	
	public void iniciarPedido(){
		
		try {
			mesa = fachada.consultarPorMesaId(mesaId);
			pedido.setUsuario(usuarioLogado);
			pedido.setMesa(mesa);
			fachada.inserir(pedido);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//itens.add(item);
		
		
		
	}

	public String adicionarItens() {
		try {
			item = fachada.consultarItemPorId(idItem);
			
			itemcardPedido.setItem(item);
			itemcardPedido.setPedido(pedido);
			
	
			fachada.inserir(itemcardPedido);
			
			item = new ItemCardapio();
			itemcardPedido = new ItemCardapioPedido();

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return null;

	}
	
	
	public String escolherMesa(){
		
		try {
			pedido.setMesa(fachada.consultarPorMesaId(mesaId));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return "efetuar_pedido.xhtml";
		
	}

	public void efetuarPedido() {

		try {

			for (int i = 0; i < itens.size(); i++) {
				valorTotal = valorTotal + itens.get(i).getPreco();
			}
			pedido.setUsuario(usuarioLogado);

			pedido.setValorTotal(valorTotal);
			fachada.inserir(pedido);

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
