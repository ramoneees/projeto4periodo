package gui;

import java.util.List;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.context.FacesContext;

import dados.TipoPesquisaString;

import basicas.Cliente;
import basicas.Usuario;
import fachada.Fachada;
import fachada.IFachada;

@ManagedBean
public class ClienteBean {

	private IFachada fachada = new Fachada();
	private Cliente cliente = new Cliente();
	private List<Cliente> lista;
	private String nome;
	private TipoPesquisaString tipoPesquisa;

	@ManagedProperty("#{loginBean.usuarioLogado}")
	private Usuario usuarioLogado;

	public Usuario getUsuarioLogado() {
		return usuarioLogado;
	}

	public void setUsuarioLogado(Usuario usuarioLogado) {
		this.usuarioLogado = usuarioLogado;
	}

	public ClienteBean() {
		this.lista = null;
	}

	public TipoPesquisaString getTipoPesquisa() {
		return tipoPesquisa;
	}

	public void setTipoPesquisa(TipoPesquisaString tipoPesquisa) {
		this.tipoPesquisa = tipoPesquisa;
	}

	public List<Cliente> getLista() {
		try {

			lista = fachada.consultarTodosCliente();

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

	public String salvar() {

		System.out.println(cliente.getId());
		try {
			if (cliente.getId() == 0) {

				cliente.setUsuario(usuarioLogado);

				fachada.inserir(cliente);
			} else {

				fachada.alterar(cliente);
				cliente = new Cliente();

			}

		} catch (Exception e) {
			FacesContext.getCurrentInstance().addMessage(
					null,
					new FacesMessage(FacesMessage.SEVERITY_ERROR, null, e
							.getMessage()));
		}

		return "manter_cliente.xhtml?faces-redirect=true";
	}

	public String exibir(Cliente c) {
		System.out.println(c.getNome());
		this.cliente = c;
		return null;

	}

	public String remover(Cliente c) {

		try {
			fachada.remover(c);
		} catch (Exception e) {
			FacesContext.getCurrentInstance().addMessage(
					null,
					new FacesMessage(FacesMessage.SEVERITY_ERROR, null, e
							.getMessage()));
		}
		return "manter_cliente.xhtml?faces-redirect=true";
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

}
