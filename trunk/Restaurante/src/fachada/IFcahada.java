package fachada;

import basicas.Cliente;



public interface IFcahada {

	public void inserir(Cliente cliente) throws Exception;
	
	public void alterar(Cliente cliente) throws Exception;
	
}
