package gui;


import java.util.List;

import javax.faces.bean.ManagedBean;

import basicas.Cliente;
import fachada.Fachada;
import fachada.IFachada;

@ManagedBean
public class ClienteBean {

	private IFachada fachada = new Fachada();
	private Cliente cliente = new Cliente();
	private List<Cliente> lista;
	
	public ClienteBean(){
		this.lista = null;
	}
	
	public List<Cliente> getLista() {
		try {
			if (lista == null) {
				lista = fachada.consultarTodosCliente();
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return lista;
	}

	public void setLista(List<Cliente> lista) {
		this.lista = lista;
	}

	
	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public String salvar() throws Exception{
		
		System.out.println(cliente.getId());
		if (cliente.getId() == 0) {
			fachada.inserir(cliente);	
		} else{
			
			fachada.alterar(cliente);
		}
		
		return null;
	}
	
	public String alterarCliente() throws Exception{
		fachada.alterar(cliente);
		return null;
	}
	
	public String exibir(Cliente c){
		System.out.println(c.getNome());
		this.cliente = c;
		return null;
		
	}
	
	
}
