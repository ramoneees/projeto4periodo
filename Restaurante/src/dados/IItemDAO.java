package dados;

import java.util.List;

import DAO.IDAOGenerico;
import basicas.Item;

public interface IItemDao extends IDAOGenerico<Item>{

	public List<Item> pesquisarItemsPorTitulo(String nome, TipoPesquisaString tipoPesquisa);
}
