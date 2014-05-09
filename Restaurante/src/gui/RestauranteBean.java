package gui;

import java.util.List;

import javax.faces.bean.ManagedBean;

import basicas.Restaurante;
import fachada.Fachada;
import fachada.IFachada;

@ManagedBean
public class RestauranteBean {
	
	private IFachada fachada = new Fachada();
	private Restaurante restaurante = new Restaurante();
	private List<Restaurante> lista;
	
	
	public List<Restaurante> getLista() {
		try {
			this.lista = fachada.consultarTodosRestaurante();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return lista;
	}

	public void setLista(List<Restaurante> lista) {
		this.lista = lista;
	}

	private String mensagem;
	
	public String getMensagem() {
		return mensagem;
	}

	public void setMensagem(String mensagem) {
		this.mensagem = mensagem;
	}

	public Restaurante getRestaurante() {
		return restaurante;
	}

	public void setRestaurante(Restaurante restaurante) {
		this.restaurante = restaurante;
	}

	public String inserir(){
		try {
			fachada.inserir(restaurante);
		} catch (Exception e) {
			mensagem = e.getMessage();
		}
		return null;
		
	}
	
	public String exibir(Restaurante r){
		this.restaurante = r;
		return null;
		
	}
	

}
