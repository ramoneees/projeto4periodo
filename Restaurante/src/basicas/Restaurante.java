package basicas;
import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;

@Entity
public class Restaurante extends Base{
	
	private String nome;
	private String fone;
	private String tamanho;
	private int qtdMaxima;
	private boolean playground;
	private Endereco endereco;
	
		public Restaurante(){
			this.endereco = new Endereco();
		}
	
	@OneToMany(mappedBy="restaurante")
	private Collection<Mesa> mesas;
	@ManyToMany
	private Collection<ItemCardapio> itens;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getFone() {
		return fone;
	}
	public Collection<ItemCardapio> getItens() {
		return itens;
	}
	public void setItens(Collection<ItemCardapio> itens) {
		this.itens = itens;
	}
	public void setFone(String fone) {
		this.fone = fone;
	}
	public String getTamanho() {
		return tamanho;
	}
	public void setTamanho(String tamanho) {
		this.tamanho = tamanho;
	}
	public int getQtdMaxima() {
		return qtdMaxima;
	}
	public void setQtdMaxima(int qtdMaxima) {
		this.qtdMaxima = qtdMaxima;
	}
	public boolean isPlayground() {
		return playground;
	}
	public void setPlayground(boolean playground) {
		this.playground = playground;
	}
	public Endereco getEndereco() {
		return endereco;
	}
	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	
}
