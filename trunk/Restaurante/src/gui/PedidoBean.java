package gui;

import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;

import basicas.ItemCardapio;
import basicas.Pedido;
import basicas.Usuario;
import fachada.Fachada;
import fachada.IFachada;

@ManagedBean
public class PedidoBean {

	private IFachada fachada = new Fachada();
	private Pedido pedido = new Pedido();
	private List<ItemCardapio> itens;
	private int idItem;
	float valorTotal;
	
	@ManagedProperty("#{LoginBean.usuarioLogado}")
	private Usuario usuarioLogado;
	
	
	
	public Pedido getPedido() {
		return pedido;
	}
	public void setPedido(Pedido pedido) {
		this.pedido = pedido;
	}
	
	public void adicionarItens(){
		try {
			itens.add(fachada.consultarItemPorId(idItem));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	
	public void efetuarPedido(){
		
		try {
		
			for (int i = 0; i < itens.size(); i++) {
			valorTotal = valorTotal + itens.get(i).getPreco();
			}
			pedido.setUsuario(usuarioLogado);
			pedido.setItens(itens);
			pedido.setValorTotal(valorTotal);
			fachada.inserir(pedido);
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
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
	
	
	
	
	
	
}
