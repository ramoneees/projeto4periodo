package basicas;

import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;



@Entity
public class Mesa extends Base{

	private int qtd;
	
	@ManyToOne
	private Restaurante restaurante;
	
	@OneToMany(mappedBy="mesa")
	private Collection<Pedido> pedidos;
	

	public Collection<Pedido> getPedidos() {
		return pedidos;
	}

	public void setPedidos(Collection<Pedido> pedidos) {
		this.pedidos = pedidos;
	}

	public Mesa(){
		
		this.restaurante = new Restaurante();
	}
	
	public int getQtd() {
		return qtd;
	}
	public void setQtd(int qtd) {
		this.qtd = qtd;
	}
	public Restaurante getRestaurante() {
		return restaurante;
	}
	public void setRestaurante(Restaurante restaurante) {
		this.restaurante = restaurante;
	}
	
}
