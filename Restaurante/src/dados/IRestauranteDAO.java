package dados;

import java.util.List;

import basicas.Cliente;
import basicas.Restaurante;
import DAO.IDAOGenerico;

public interface IRestauranteDAO extends IDAOGenerico<Restaurante> {

	public List<Cliente> pesquisarFuncionalidadesPorNome(String nome, TipoPesquisaString tipoPesquisa);
}
