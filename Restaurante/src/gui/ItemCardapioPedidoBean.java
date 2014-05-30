package gui;

import java.util.List;

import javax.faces.bean.ManagedBean;

import fachada.Fachada;
import fachada.IFachada;
import basicas.Relatorio;

@ManagedBean
public class ItemCardapioPedidoBean {

	private List<Relatorio> listaRelatorio;
	public List<Relatorio> getListaRelatorio() {
		try {
			listaRelatorio = fachada.pesquisarItensMaisVendidos();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return listaRelatorio;
	}
	public void setListaRelatorio(List<Relatorio> listaRelatorio) {
		this.listaRelatorio = listaRelatorio;
	}
	IFachada fachada = new Fachada();
	
	
}
