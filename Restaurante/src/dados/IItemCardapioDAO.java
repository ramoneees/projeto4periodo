package dados;

import java.util.List;

import DAO.IDAOGenerico;
import basicas.ItemCardapio;

public interface IItemCardapioDAO extends IDAOGenerico<ItemCardapio>{

	public List<ItemCardapio> pesquisarItemsPorTitulo(String nome, TipoPesquisaString tipoPesquisa);
	
	
}
