package dados;

import java.util.List;

import basicas.Combo;
import DAO.IDAOGenerico;

public interface IComboDAO extends IDAOGenerico<Combo> {

	public List<Combo> pesquisarFuncionalidadesPorNome(String nome, TipoPesquisaString tipoPesquisa);
}
