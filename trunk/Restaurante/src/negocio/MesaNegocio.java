package negocio;

import java.util.List;

import basicas.Mesa;
import dados.IMesaDAO;
import dados.MesaDAO;

public class MesaNegocio {

	
	IMesaDAO dao = new MesaDAO();
	
	
	public void inserir(Mesa mesa) throws Exception{
		
		if (mesa.getQtd() <= 0) {
		
			throw new Exception("Quantidade de pessoas na mesa não pode ser igual a 0");
		}
		dao.inserir(mesa);
		
	}
		
	public void alterar(Mesa mesa) throws Exception{
		
		if (mesa.getQtd() <= 0) {
		
			throw new Exception("Quantidade de pessoas na mesa não pode ser igual a 0");
		}
		dao.alterar(mesa);
		
	}
	
	public void remover (Mesa mesa){
		
		dao.remover(mesa);
	}
	
	public List<Mesa> consultarTodos(){
		
		return dao.consultarTodos();
	}
	
	public Mesa consultarporId(int id){
		
		return dao.consultarPorId(id);
	}
}
