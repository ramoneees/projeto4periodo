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

	public ClienteBean() {
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

	public String salvar() throws Exception {

		System.out.println(cliente.getId());
		if (cliente.getId() == 0) {
			fachada.inserir(cliente);
		} else {

			fachada.alterar(cliente);
			cliente = new Cliente();
		}

		return "manter_cliente.xhtml?faces-redirect=true";
	}

	
	public String exibir(Cliente c) {
		System.out.println(c.getNome());
		setCliente(c);
		return null;

	}

	public String remover(Cliente c) {

		try {
			fachada.remover(c);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return "manter_cliente.xhtml?faces-redirect=true";
	}

}
