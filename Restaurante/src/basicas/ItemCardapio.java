package basicas;
import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;


@Entity
public class ItemCardapio {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	
	private String titulo;
	private String composicao;
	private String tamanho;
	private float preco;
	private TipoItem tipo;
	
	public TipoItem getTipo() {
		return tipo;
	}

	public void setTipo(TipoItem tipo) {
		this.tipo = tipo;
	}

	@Enumerated(EnumType.STRING)
	private TipoItem tipoItem;
	
	@ManyToMany(mappedBy = "itens", fetch = FetchType.LAZY)
	private Collection<Restaurante> restaurantes;
	
	@ManyToMany(mappedBy = "itens", fetch = FetchType.LAZY)
	private Collection<Combo> combos;
	
	@ManyToMany(mappedBy = "itens", fetch = FetchType.LAZY)
	private Collection<Pedido> pedidos;
	
	public Collection<Pedido> getPedidos() {
		return pedidos;
	}

	public void setPedidos(Collection<Pedido> pedidos) {
		this.pedidos = pedidos;
	}

	public Collection<Combo> getCombos() {
		return combos;
	}

	public void setCombos(Collection<Combo> combos) {
		this.combos = combos;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getComposicao() {
		return composicao;
	}

	public void setComposicao(String composicao) {
		this.composicao = composicao;
	}

	public String getTamanho() {
		return tamanho;
	}

	public void setTamanho(String tamanho) {
		this.tamanho = tamanho;
	}

	public float getPreco() {
		return preco;
	}

	public void setPreco(float preco) {
		this.preco = preco;
	}

	public TipoItem getTipoItem() {
		return tipoItem;
	}

	public void setTipoItem(TipoItem tipoItem) {
		this.tipoItem = tipoItem;
	}

	public Collection<Restaurante> getRestaurantes() {
		return restaurantes;
	}

	public void setRestaurantes(Collection<Restaurante> restaurantes) {
		this.restaurantes = restaurantes;
	}

	
}
