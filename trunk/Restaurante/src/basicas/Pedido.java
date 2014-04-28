package basicas;
import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

@Entity
public class Pedido {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	
	@ManyToMany
	private Collection<Item> itens;
	
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

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Collection<Item> getItens() {
		return itens;
	}

	public void setItens(Collection<Item> itens) {
		this.itens = itens;
	}

	public Collection<Combo> getCombos() {
		return combos;
	}

	public void setCombos(Collection<Combo> combos) {
		this.combos = combos;
	}
	
}
