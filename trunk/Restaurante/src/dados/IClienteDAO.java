package dados;

import java.util.List;

import basicas.Cliente;

import DAO.IDAOGenerico;


public interface IClienteDAO extends IDAOGenerico<Cliente>{

	public List<Cliente> pesquisarFuncionalidadesPorNome(String nome, TipoPesquisaString tipoPesquisa);
}
