package basicas;
import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;


@Entity
public class Pedido extends Base{

	@ManyToMany
	private Collection<ItemCardapio> itens;
	
	@ManyToMany
	private Collection<Combo> combos;
	
	@ManyToOne
	private Cliente cliente;

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public Collection<ItemCardapio> getItens() {
		return itens;
	}

	public void setItens(Collection<ItemCardapio> itens) {
		this.itens = itens;
	}

	public Collection<Combo> getCombos() {
		return combos;
	}

	public void setCombos(Collection<Combo> combos) {
		this.combos = combos;
	}
	
}
