package basicas;

import java.util.List;



public class Restaurante {
	
	private int id;
	private String nomeRestaurante;
	private Endereco endereco;
	private boolean possuiPlayground;
	private int qtdClientes;
	private List<Mesa> mesas;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNomeRestaurante() {
		return nomeRestaurante;
	}
	public void setNomeRestaurante(String nomeRestaurante) {
		this.nomeRestaurante = nomeRestaurante;
	}
	public Endereco getEndereco() {
		return endereco;
	}
	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
	public boolean isPossuiPlayground() {
		return possuiPlayground;
	}
	public void setPossuiPlayground(boolean possuiPlayground) {
		this.possuiPlayground = possuiPlayground;
	}
	public int getQtdClientes() {
		return qtdClientes;
	}
	public void setQtdClientes(int qtdClientes) {
		this.qtdClientes = qtdClientes;
	}
	public List<Mesa> getMesas() {
		return mesas;
	}
	public void setMesas(List<Mesa> mesas) {
		this.mesas = mesas;
	}
	

}
