package negocio;

import java.util.List;

import basicas.ItemCardapio;
import dados.IItemCardapioDAO;
import dados.ItemCardapioDAO;

public class ItemCardapioNegocio {

	IItemCardapioDAO itemdao = new ItemCardapioDAO();

	public void inserir(ItemCardapio item) {

		itemdao.inserir(item);
	}

	public void alterar(ItemCardapio item) {

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
