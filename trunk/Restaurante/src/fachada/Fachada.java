package fachada;

import negocio.ClienteNegocio;
import basicas.Cliente;

public class Fachada implements IFcahada {

	ClienteNegocio clienteNegocio = new ClienteNegocio();
	@Override
	public void inserir(Cliente cliente) throws Exception {
		clienteNegocio.inserir(cliente);
		
	}
	
	@Override
	public void alterar(Cliente cliente) throws Exception {
		clienteNegocio.alterar(cliente);
		
	}
	

	
}
