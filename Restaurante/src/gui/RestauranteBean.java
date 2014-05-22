package gui;

import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;

import basicas.Restaurante;
import basicas.Usuario;
import fachada.Fachada;
import fachada.IFachada;

@ManagedBean
public class RestauranteBean {

	private IFachada fachada = new Fachada();
	private Restaurante restaurante = new Restaurante();
	private List<Restaurante> lista;
	
	@ManagedProperty("#{loginBean.usuarioLogado}")
	private Usuario usuarioLogado;


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

	public String salvar() {
		try {
			if (restaurante.getId() == 0) {
				restaurante.setUsuario(usuarioLogado);
				fachada.inserir(restaurante);
			} else {
				fachada.alterar(restaurante);
				restaurante = new Restaurante();
			}

		} catch (Exception e) {
			mensagem = e.getMessage();
		}
		return "manter_restaurantes.xhtml?faces-redirect=true";

	}

	public String exibir(Restaurante r) {
		System.out.println(r.getId());
		this.restaurante = r;
		return "manter_restaurantes.xhtml?faces-redirect=true";

	}
	public String remover(Restaurante r ){
		try {
			fachada.remover(r);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return  "manter_restaurantes.xhtml?faces-redirect=true";
	} 

}
