package basicas;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;



@Entity
public class Mesa extends Base{

	private int qtd;
	
	@ManyToOne
	private Restaurante restaurante;
	
	public Mesa(){
		
		this.restaurante = new Restaurante();
	}
	
	public int getQtd() {
		return qtd;
	}
	public void setQtd(int qtd) {
		this.qtd = qtd;
	}
	public Restaurante getRestaurante() {
		return restaurante;
	}
	public void setRestaurante(Restaurante restaurante) {
		this.restaurante = restaurante;
	}
	
}
