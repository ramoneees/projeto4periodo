package basicas;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQuery;

@Entity

@NamedQuery(name="consultarItensPedido", query = "Select i from ItemCardapioPedido i where i.pedido.id = :id")
public class ItemCardapioPedido extends Base {

	@ManyToOne
	private Pedido pedido;
	@ManyToOne
	private ItemCardapio item;
	
	private int qtd;
	
	public Pedido getPedido() {
		return pedido;
	}
	public void setPedido(Pedido pedido) {
		this.pedido = pedido;
	}
	public ItemCardapio getItem() {
		return item;
	}
	public void setItem(ItemCardapio item) {
		this.item = item;
	}
	public int getQtd() {
		return qtd;
	}
	public void setQtd(int qtd) {
		this.qtd = qtd;
	}
	

}
