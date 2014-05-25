package negocio;

import java.util.List;

import basicas.ItemCardapio;
import dados.IItemCardapioDAO;
import dados.ItemCardapioDAO;

public class ItemCardapioNegocio {

	IItemCardapioDAO itemdao = new ItemCardapioDAO();

	public void inserir(ItemCardapio item) throws Exception {

		if (item.getTitulo().trim() == "" ) {
			throw new Exception("Informe o título do item");
		}
		if (item.getComposicao().trim() == "" ) {
			throw new Exception("Informe a composição do item");
		}
		if (item.getTamanho().trim() == "" ) {
			throw new Exception("Informe o tamanho do item");
		}
		if (item.getPreco() == 0) {
			throw new Exception("Informe o preço do item");
		}
		itemdao.inserir(item);
	}

	public void alterar(ItemCardapio item) throws Exception {

		if (item.getTitulo().trim() == "" ) {
			throw new Exception("Informe o título do item");
		}
		if (item.getComposicao().trim() == "" ) {
			throw new Exception("Informe a composição do item");
		}
		if (item.getTamanho().trim() == "" ) {
			throw new Exception("Informe o tamanho do item");
		}
		if (item.getPreco() == 0) {
			throw new Exception("Informe o preço do item");
		}
		
		itemdao.alterar(item);
	}

	public void remover(ItemCardapio item) {

		itemdao.remover(item);
	}

	public List<ItemCardapio> consultarTodos(){
		
		return itemdao.consultarTodos();
	}
	
	public ItemCardapio consultarPorId(int id){
		
		return itemdao.consultarPorId(id);
	}
}
