package basicas;
import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ManyToMany;



@Entity
public class Combo extends Base{
	
	@ManyToMany
	private Collection<ItemCardapio> itens;
	
	private float preco;
	
	@ManyToMany(mappedBy = "combos", fetch = FetchType.LAZY)
	private Collection<Pedido> pedidos;
	
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
