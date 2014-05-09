package negocio;

import java.util.List;

import dados.IRestauranteDAO;
import dados.RestauranteDAO;
import basicas.Restaurante;


public class RestauranteNegocio {
	
	IRestauranteDAO restDao = new RestauranteDAO();
	
	public void inserir(Restaurante restaurante) throws Exception{
		if (restaurante.getNome().isEmpty() || restaurante.getNome() == null) {
			throw new Exception("informe o nome do restaurante");
		}else if (restaurante.getEndereco().getLogradouro().isEmpty() || restaurante.getEndereco().getLogradouro() == null) {
			throw new Exception("informe o logradouro do restaurante");
		}else if (restaurante.getEndereco().getNumero() <= 0) {
			throw new Exception("informe o número do logradouro do restaurante válido!");
		}else if (restaurante.getEndereco().getBairro().isEmpty() || restaurante.getEndereco().getBairro() == null) {
			throw new Exception("informe o bairro do logradouro do restaurante");
		}else if (restaurante.getEndereco().getCidade().isEmpty() || restaurante.getEndereco().getCidade() == null) {
			throw new Exception("informe a cidade do logradouro do restaurante");
		}else if (restaurante.getFone().isEmpty() || restaurante.getFone() == null) {
			throw new Exception("informe o fone do restaurante");
		}
		
		restDao.inserir(restaurante);
	}
	
	

	public void alterar(Restaurante restaurante) throws Exception{
		if (restaurante.getNome().isEmpty() || restaurante.getNome() == null) {
			throw new Exception("informe o nome do restaurante");
		}else if (restaurante.getEndereco().getLogradouro().isEmpty() || restaurante.getEndereco().getLogradouro() == null) {
			throw new Exception("informe o logradouro do restaurante");
		}else if (restaurante.getEndereco().getNumero() <= 0) {
			throw new Exception("informe o número do logradouro do restaurante válido!");
		}else if (restaurante.getEndereco().getBairro().isEmpty() || restaurante.getEndereco().getBairro() == null) {
			throw new Exception("informe o bairro do logradouro do restaurante");
		}else if (restaurante.getEndereco().getCidade().isEmpty() || restaurante.getEndereco().getCidade() == null) {
			throw new Exception("informe a cidade do logradouro do restaurante");
		}else if (restaurante.getFone().isEmpty() || restaurante.getFone() == null) {
			throw new Exception("informe o fone do restaurante");
		}
		
		restDao.alterar(restaurante);
	}
	
	public void remover(Restaurante restaurante){
		
		restDao.remover(restaurante);
		
		
	}
	
	public List<Restaurante> consultarTodos(){
		
		return restDao.consultarTodos();
	}

	public Restaurante consultarPorId(int id){
		
		return restDao.consultarPorId(id);
		
	}

}
