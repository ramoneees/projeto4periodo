package gui;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;

import basicas.ItemCardapio;
import basicas.ItemCardapioPedido;
import basicas.Mesa;
import basicas.Pedido;
import basicas.StatusPedido;
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
	private List<ItemCardapioPedido> itensPedidos = new ArrayList<ItemCardapioPedido>();
	private Mesa mesa = new Mesa();
	private Integer mesaId;
	private int idItem;

	@ManagedProperty("#{loginBean.usuarioLogado}")
	private Usuario usuarioLogado;
	private ItemCardapioPedido itemcardPedido = new ItemCardapioPedido();
	private StatusPedido status;

	public ItemCardapioPedido getItemcardPedido() {
		return itemcardPedido;
	}

	public void setItemcardPedido(ItemCardapioPedido itemcardPedido) {
		this.itemcardPedido = itemcardPedido;
	}

	public List<ItemCardapioPedido> getItensPedidos() {
		return itensPedidos;
	}

	public void setItensPedidos(List<ItemCardapioPedido> itensPedidos) {
		this.itensPedidos = itensPedidos;
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
			FacesContext.getCurrentInstance().addMessage(null,
					new FacesMessage(e.getMessage()));

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

	
	public String adicionarItens() {
		try {
			// mesa = fachada.consultarPorMesaId(mesaId);
			item = fachada.consultarItemPorId(idItem);

			itemcardPedido.setItem(item);
			itemcardPedido.setPedido(pedido);
			fachada.inserir(itemcardPedido);
			itensPedidos.add(itemcardPedido);
			
//			valorTotal = pedido.getValorTotal();
//
//			valorTotal = valorTotal + (item.getPreco() * itemcardPedido.getQtd()); 
//					
//				/*	(itensPedidos.get(i).getItem().getPreco() * itensPedidos
//							.get(i).getQtd());
//		*/
//			
			
			item = new ItemCardapio();
			itemcardPedido = new ItemCardapioPedido();

		} catch (Exception e) {

			FacesContext.getCurrentInstance().addMessage(null,
					new FacesMessage(e.getMessage()));

			e.printStackTrace();
		}

		return "efetuar_pedido.xhtml";

	}

	public String escolherMesa() {

		try {

			// pedido = fachada.pesquisarPedidoAbertoPorMesa(mesaId);
			// pedido.setMesa(fachada.consultarPorMesaId(mesaId));
			pedido = fachada
					.consultarPedidoAbertoporMesa(mesaId, status.ABERTO);

			if (pedido == null) {

				mesa = fachada.consultarPorMesaId(mesaId);

				pedido = new Pedido();
				pedido.setUsuario(usuarioLogado);
				pedido.setStatus(status.ABERTO);
				pedido.setMesa(mesa);
				fachada.inserir(pedido);
				return "efetuar_pedido.xhtml";
			} else {

				itensPedidos = fachada.consultaritemPedido(pedido.getId());
				return "efetuar_pedido.xhtml";
			}

		} catch (Exception e) {
			FacesContext.getCurrentInstance().addMessage(
					null,
					new FacesMessage(FacesMessage.SEVERITY_ERROR, null, e.getMessage()));
			e.printStackTrace();
		}
		return null;

	}

	public StatusPedido getStatus() {
		return status;
	}

	public void setStatus(StatusPedido status) {
		this.status = status;
	}

	public String encerrarPedido() {

		float valorTotal = 0;
		try {
			
			for (int i = 0; i < itensPedidos.size(); i++) {
				valorTotal += itensPedidos.get(i).getQtd() * itensPedidos.get(i).getItem().getPreco();
			}

			pedido.setUsuario(usuarioLogado);
			pedido.setStatus(status.FECHADO);
			pedido.setValorTotal(valorTotal);
			fachada.encerrarPedido(pedido);
			
			
			// itensPedidos = new ArrayList<ItemCardapioPedido>();
			return "encerrar_pedido.xhtml";
		} catch (Exception e) {
			FacesContext.getCurrentInstance().addMessage(
					null,
					new FacesMessage(FacesMessage.SEVERITY_ERROR, null, e
							.getMessage()));
			e.printStackTrace();
		}
		return null;
	}

	public String finalizar() {

		itensPedidos = new ArrayList<ItemCardapioPedido>();
		return "home.xhtml";

	}
}
