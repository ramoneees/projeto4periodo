package negocio;

import java.util.List;

import dados.ClienteDao;
import dados.IClienteDAO;
import basicas.Cliente;


public class ClienteNegocio {
	
	IClienteDAO clienteDao = new ClienteDao();
	
	public void inserir(Cliente cliente) throws Exception{
		if (cliente.getNome().isEmpty() || cliente.getNome() == null) {
			throw new Exception("informe o nome do cliente");
		}else if (cliente.getEmail().isEmpty() || cliente.getEmail() == null) {
			throw new Exception("informe o email do cliente");
		}else if (cliente.getEndereco().getLogradouro().isEmpty() || cliente.getEndereco().getLogradouro() == null) {
			throw new Exception("informe o logradouro do cliente");
		}else if (cliente.getEndereco().getNumero() <= 0) {
			throw new Exception("informe o número do logradouro do cliente válido!");
		}else if (cliente.getEndereco().getBairro().isEmpty() || cliente.getEndereco().getBairro() == null) {
			throw new Exception("informe o bairro do logradouro do cliente");
		}else if (cliente.getEndereco().getCidade().isEmpty() || cliente.getEndereco().getCidade() == null) {
			throw new Exception("informe a cidade do logradouro do cliente");
		}else if (cliente.getFone().isEmpty() || cliente.getFone() == null) {
			throw new Exception("informe o fone do cliente");
		}
		
		clienteDao.inserir(cliente);
	}
	
	
	public void alterar(Cliente cliente) throws Exception{
		if (cliente.getNome().isEmpty() || cliente.getNome() == null) {
			throw new Exception("informe o nome do cliente");
		}else if (cliente.getEmail().isEmpty() || cliente.getEmail() == null) {
			throw new Exception("informe o email do cliente");
		}else if (cliente.getEndereco().getLogradouro().isEmpty() || cliente.getEndereco().getLogradouro() == null) {
			throw new Exception("informe o logradouro do cliente");
		}else if (cliente.getEndereco().getNumero() <= 0) {
			throw new Exception("informe o número do logradouro do cliente");
		}else if (cliente.getEndereco().getBairro().isEmpty() || cliente.getEndereco().getBairro() == null) {
			throw new Exception("informe o bairro do logradouro do cliente");
		}else if (cliente.getEndereco().getCidade().isEmpty() || cliente.getEndereco().getCidade() == null) {
			throw new Exception("informe a cidade do logradouro do cliente");
		}else if (cliente.getFone().isEmpty() || cliente.getFone() == null) {
			throw new Exception("informe o fone do cliente");
		}
		
		clienteDao.alterar(cliente);
	}
	
	public void remover(Cliente cliente){
		
		clienteDao.remover(cliente);
	}
	
	public List<Cliente> consultarTodos(){
		return clienteDao.consultarTodos();
		
	}
	
	public Cliente consultarPorId(int id) throws Exception{
		
		return clienteDao.consultarPorId(id);
		
	}
	
}
