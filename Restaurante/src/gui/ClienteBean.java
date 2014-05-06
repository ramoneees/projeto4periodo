package gui;

import javax.faces.bean.ManagedBean;

import basicas.Cliente;
import fachada.Fachada;
import fachada.IFcahada;

@ManagedBean
public class ClienteBean {

	private IFcahada fachada = new Fachada();
	private Cliente cliente = new Cliente();
	
	public String inserirCliente() throws Exception{
		fachada.inserir(cliente);
		return null;
	}
	
	public String alterarCliente() throws Exception{
		fachada.alterar(cliente);
		return null;
	}
}
