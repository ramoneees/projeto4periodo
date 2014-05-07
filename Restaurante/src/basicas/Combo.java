package basicas;
import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;


@Entity
public class Combo {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	
	@ManyToMany
	private Collection<ItemCardapio> itens;
	
	private float preco;
	
	@ManyToMany(mappedBy = "combos", fetch = FetchType.LAZY)
	private Collection<Pedido> pedidos;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	
	public Collection<ItemCardapio> getItens() {
		return itens;
	}
	public void setItens(Collection<ItemCardapio> itens) {
		this.itens = itens;
	}
	public float getPreco() {
		return preco;
	}
	public void setPreco(float preco) {
		this.preco = preco;
	}
}
