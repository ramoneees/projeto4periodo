package basicas;


public class Relatorio {

	private String titulo;
	private long qtd;
	public String getTitulo() {
		return titulo;
	}
	public Relatorio(String titulo, long qtd) {
		super();
		this.titulo = titulo;
		this.qtd = qtd;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public long getQtd() {
		return qtd;
	}
	public void setQtd(long qtd) {
		this.qtd = qtd;
	}
	
	
}
