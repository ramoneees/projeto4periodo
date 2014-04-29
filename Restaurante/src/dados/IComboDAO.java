package dados;

import java.util.List;

import basicas.Combo;
import DAO.IDAOGenerico;

public interface IComboDAO extends IDAOGenerico<Combo> {

	public List<Combo> pesquisarComboPorNome(String nome, TipoPesquisaString tipoPesquisa);
}
