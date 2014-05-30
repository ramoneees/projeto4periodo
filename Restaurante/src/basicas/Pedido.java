package basicas;
import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;


@Entity
@NamedQuery(name="consultarPedidoAbertoporMesa", query="Select p from  Pedido p where p.mesa.id = :id and p.status = :status")
public class Pedido extends Base{

	@Enumerated(EnumType.STRING)
	private StatusPedido status;
	
	@ManyToMany
	private Collection<Combo> combos;
	
	@ManyToOne
	private Mesa mesa;
	

	public Mesa getMesa() {
		return mesa;
	}

	public void setMesa(Mesa mesa) {
		this.mesa = mesa;
	}

	private float valorTotal;
	
	
	public float getValorTotal() {
		return valorTotal;
	}

	public void setValorTotal(float valorTotal) {
		this.valorTotal = valorTotal;
	}

	@ManyToOne
	private Cliente cliente;

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}


	public Collection<Combo> getCombos() {
		return combos;
	}

	public void setCombos(Collection<Combo> combos) {
		this.combos = combos;
	}
	
	public StatusPedido getStatus() {
		return status;
	}

	public void setStatus(StatusPedido status) {
		this.status = status;
	}
	
}
