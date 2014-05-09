package negocio;

import java.util.List;

import basicas.Combo;
import dados.ComboDAO;
import dados.IComboDAO;

public class ComboNegocio {

	IComboDAO dao = new ComboDAO();
	
	public void inserir(Combo combo) throws Exception{
		
		if (combo.getItens().isEmpty() || combo.getItens() == null) {
			throw new Exception("favor Inserir Itens no combo");
		}
		if (combo.getPreco() <= 0) {
			throw new Exception("Informe o preço do combo");
		}
		if (combo.getItens().size() < 2 ) {
			throw new Exception("Insira mais de um item no combo");
		}
		dao.inserir(combo);
	}
	
	public void alterar(Combo combo) throws Exception{

		if (combo.getItens().isEmpty() || combo.getItens() == null) {
			throw new Exception("favor Inserir Itens no combo");
		}
		if (combo.getPreco() <= 0) {
			throw new Exception("Informe o preço do combo");
		}
		if (combo.getItens().size() < 2 ) {
			throw new Exception("Insira mais de um item no combo");
		}

		
		dao.alterar(combo);
	}
	
	public void remover(Combo combo){
		
		dao.remover(combo);
	}
	
	public List<Combo> consultarTodos(){
		
		return dao.consultarTodos();
	}
	public Combo consultarPorId(int id){
		
		return dao.consultarPorId(id);
	}
	
}
