package basicas;

public class itemCardapio {

	private int id;
	private String descricao;
	private Double preco;
	private Double peso;
	private TipoCardapio tipo ;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public Double getPreco() {
		return preco;
	}
	public void setPreco(Double preco) {
		this.preco = preco;
	}
	public Double getPeso() {
		return peso;
	}
	public void setPeso(Double peso) {
		this.peso = peso;
	}
	public TipoCardapio getTipo() {
		return tipo;
	}
	public void setTipo(TipoCardapio tipo) {
		this.tipo = tipo;
	}
	
}
