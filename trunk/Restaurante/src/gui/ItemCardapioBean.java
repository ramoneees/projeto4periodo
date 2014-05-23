package gui;

import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;

import basicas.ItemCardapio;
import basicas.TipoItem;
import basicas.Usuario;
import fachada.Fachada;

@ManagedBean
public class ItemCardapioBean {

	private Fachada fachada = new Fachada();
	private ItemCardapio item = new ItemCardapio();
	private List<ItemCardapio> lista;
	private TipoItem tipo;
	@ManagedProperty("#{loginBean.usuarioLogado}")
	private Usuario usuarioLogado;

	
	
	public Usuario getUsuarioLogado() {
		return usuarioLogado;
	}
	public void setUsuarioLogado(Usuario usuarioLogado) {
		this.usuarioLogado = usuarioLogado;
	}
	public TipoItem[]  getTipo() {
		return tipo.values();
	}
	public void setTipo(TipoItem tipo) {
		this.tipo = tipo;
	}
	public ItemCardapio getItem() {
		return item;
		
	}
	public void setItem(ItemCardapio item) {
		this.item = item;
	}
	public List<ItemCardapio> getLista() {
		try {
			lista = fachada.consultarTodosItem();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return lista;
	}
	public void setLista(List<ItemCardapio> lista) {
		this.lista = lista;
	}
	
	public String salvar(){
		
		try {
			if(item.getId() == 0){
				item.setUsuario(usuarioLogado);
				fachada.inserir(item);
			}else{
				
				fachada.alterar(item);
				item = new ItemCardapio();
			}
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		return "manter_item_cardapio.xhtml?faces-redirect=true";
		}
	
	public String remover(ItemCardapio itemc){
		
		try {
			fachada.remover(itemc);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return "manter_item_cardapio.xhtml?faces-redirect=true";
		
		
	}
	
	public String exibir(ItemCardapio i){
		
		setItem(i);
		return null;
	}
		
		
	}
	
	
	
	

