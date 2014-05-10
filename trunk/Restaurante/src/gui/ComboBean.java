package gui;

import java.util.List;

import javax.faces.bean.ManagedBean;

import basicas.Combo;
import basicas.ItemCardapio;
import fachada.Fachada;
import fachada.IFachada;

@ManagedBean
public class ComboBean {

	private IFachada fachada = new Fachada();
	private Combo combo = new Combo();
	private ItemCardapio item1 = new ItemCardapio();
	private ItemCardapio item2 = new ItemCardapio();
	private ItemCardapio item3 = new ItemCardapio();
	private List<ItemCardapio> listaItens;

	public List<ItemCardapio> getListaItens() {
		try {
			listaItens = fachada.consultarTodosItem();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return listaItens;
	}

	public void setListaItens(List<ItemCardapio> itens) {
		this.listaItens = itens;
	}

	public ItemCardapio getItem1() {
		return item1;
	}

	public void setItem1(ItemCardapio item1) {
		this.item1 = item1;
	}

	public ItemCardapio getItem2() {
		return item2;
	}

	public void setItem2(ItemCardapio item2) {
		this.item2 = item2;
	}

	public ItemCardapio getItem3() {
		return item3;
	}

	public void setItem3(ItemCardapio item3) {
		this.item3 = item3;
	}

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
			System.out.println(combo.getPreco());
			if (combo.getId() == 0) {

				fachada.inserir(combo);
			} else {
				fachada.alterar(combo);

			}

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return "manter_combo.xhtml?faces-redirect=true";

	}

	public String exibir(Combo c) {
		System.out.println(c.getId());
		setCombo(c);

		return null;
	}

	public String remover(Combo c) {

		try {
			fachada.remover(c);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "manter_combo.xhtml?faces-redirect=true";
	}
}
