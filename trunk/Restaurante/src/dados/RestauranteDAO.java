package dados;

import java.util.List;

import basicas.Cliente;
import basicas.Restaurante;
import DAO.DAOGenerico;

public class RestauranteDAO extends DAOGenerico<Restaurante> implements IRestauranteDAO {

	@Override
	public List<Cliente> pesquisarFuncionalidadesPorNome(String nome,
			TipoPesquisaString tipoPesquisa) {
		// TODO Auto-generated method stub
		return null;
	}

}
