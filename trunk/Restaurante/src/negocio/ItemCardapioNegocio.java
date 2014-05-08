package negocio;

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

}
