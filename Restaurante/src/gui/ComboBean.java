package gui;

import java.util.List;

import javax.faces.bean.ManagedBean;

import basicas.Combo;
import fachada.Fachada;
import fachada.IFachada;

@ManagedBean
public class ComboBean {

	private IFachada fachada = new Fachada();
	private Combo combo = new Combo();
	private List<Combo> lista;

	public Combo getCombo() {
		return combo;
	}

	public void setCombo(Combo combo) {
		this.combo = combo;
	}

	public List<Combo> getLista() {
		try {
			lista = fachada.consultarTodosCombo();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return lista;
	}

	public void setLista(List<Combo> lista) {
		this.lista = lista;
	}

	public String salvar() {

		try {

			if (combo.getId() == 0) {
				fachada.inserir(combo);
			} else {
				fachada.alterar(combo);

			}

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;

	}

	public String exibir(Combo c) {

		setCombo(c);

		return null;
	}

	public String remover(Combo c){
		
		try {
			fachada.remover(c);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
}
