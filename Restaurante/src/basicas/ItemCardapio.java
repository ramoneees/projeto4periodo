package basicas;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;



@Entity
public class ItemCardapio extends Base{

	private String titulo;
	private String composicao;
	private String tamanho;
	private float preco;
	
	@Enumerated(EnumType.STRING)
	private TipoItem tipoItem;
	

	


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


	
}
