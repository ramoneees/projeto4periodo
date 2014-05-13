package basicas;

import javax.persistence.Column;
import javax.persistence.Entity;


@Entity
public class Usuario extends Base{
	private String nome;
	
	private String senha;
	
	@Column(unique = true)
	private String login;
	
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	
}
