package basicas;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;


public class teste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Obtendo o gerenciador de entidades
		EntityManagerFactory emf = Persistence.
		createEntityManagerFactory("unitPSC");
		EntityManager em = emf.createEntityManager();
		// Abrindo transações
		EntityTransaction et = em.getTransaction();
		et.begin();
		// Instanciar objeto para inserir
	
		et.commit();
		// Fechando o gerenciador.
		em.close(); 
		emf.close();
	}

}
