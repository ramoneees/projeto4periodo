package gui;

import java.util.List;

import javax.faces.bean.ManagedBean;

import basicas.ItemCardapio;

import fachada.Fachada;

@ManagedBean
public class ItemCardapioBean {

	private Fachada fachada = new Fachada();
	private ItemCardapio item = new ItemCardapio();
	private List<ItemCardapio> lista;
	

	
	public ItemCardapio getItem() {
		return item;
	}
	public void setItem(ItemCardapio item) {
		this.item = item;
	}
	public List<ItemCardapio> getLista() {
		return lista;
	}
	public void setLista(List<ItemCardapio> lista) {
		this.lista = lista;
	}
	
	public void salvar(){
		
		try {
			if(item.getId() == 0){
				fachada.inserir(item);
			}else{
				
				fachada.alterar(item);
				item = new ItemCardapio();
			}
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	
	public void remover(ItemCardapio itemc){
		
		try {
			fachada.remover(itemc);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public void exibir(ItemCardapio i){
		
		setItem(i);
		
	}
		
		
	}
	
	
	
	

