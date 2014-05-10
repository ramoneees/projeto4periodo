package gui;

import java.util.List;

import javax.faces.bean.ManagedBean;

import basicas.Mesa;
import basicas.Restaurante;
import fachada.Fachada;
import fachada.IFachada;

;

@ManagedBean
public class MesaBean {

	private IFachada fachada = new Fachada();
	private Mesa mesa = new Mesa();
	private List<Mesa> lista;
	private String mensagem;
	private List<Restaurante> listaRest;
	private Restaurante restaurante = new Restaurante();

	public Restaurante getRestaurante() {
		return restaurante;
	}

	public void setRestaurante(Restaurante restaurante) {
		this.restaurante = restaurante;
	}

	public List<Restaurante> getListaRest() {
		try {
			 listaRest = fachada.consultarTodosRestaurante();
			 
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return listaRest;
		
	}

	public void setListaRest(List<Restaurante> listaRest) {
		this.listaRest = listaRest;
	}

	public String getMensagem() {
		return mensagem;
	}

	public void setMensagem(String mensagem) {
		this.mensagem = mensagem;
	}

	public Mesa getMesa() {
		return mesa;
	}

	public void setMesa(Mesa mesa) {
		this.mesa = mesa;
	}

	public List<Mesa> getLista() {

		try {
			lista = fachada.consultarTodosMesa();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			mensagem = e.getMessage();
		}

		return lista;
	}

	public void setLista(List<Mesa> lista) {
		this.lista = lista;
	}

	public String salvar() {

		try {
			System.out.println(mesa.getId());
			mesa.setRestaurante(restaurante);
			System.out.println(mesa.getId());
			if (mesa.getId() == 0) {
			
				
				fachada.inserir(mesa);
			} else {

				fachada.alterar(mesa);
			}

		} catch (Exception e) {
			// TODO Auto-generated catch block
			mensagem = e.getMessage();
			e.printStackTrace();
		}
		return null;
	}

}
