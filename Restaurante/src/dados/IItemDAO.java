package dados;

import java.util.List;


import basicas.Item;
import DAO.IDAOGenerico;

public interface IItemDAO extends IDAOGenerico<Item> {

	public List<Item> pesquisarFuncionalidadesPorNome(String nome, TipoPesquisaString tipoPesquisa);
}
