package basicas;
import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.OneToMany;



@Entity
public class Cliente extends Base{
	
	private String nome;
	private String email;
	private String fone;
	private Endereco endereco;
	
	public Cliente(){
		this.endereco =  new Endereco();
		
	}
	@OneToMany(mappedBy = "cliente")
	private Collection<Pedido> pedidos;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getFone() {
		return fone;
	}

	public void setFone(String fone) {
		this.fone = fone;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	public Collection<Pedido> getPedido() {
		return pedidos;
	}

	public void setPedido(Collection<Pedido> pedido) {
		this.pedidos = pedido;
	}
	
	
}
