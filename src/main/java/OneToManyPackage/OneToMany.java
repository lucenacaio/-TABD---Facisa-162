package OneToManyPackage;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class OneToMany {
	
	public static void main(String[] args) {
		
		EntityManagerFactory emf = 
				Persistence.createEntityManagerFactory("TABD");
		
		EntityManager em = emf.createEntityManager();
		EntityTransaction tx = em.getTransaction();
		
		tx.begin();
		
		Filho filho1 = new Filho("João", 7);
		Filho filho2 = new Filho("José", 10);
		
		Mae mae = new Mae("Maria");
		mae.adicionaFilho(filho1);
		mae.adicionaFilho(filho2);
		
		em.persist(mae);
			
		tx.commit();
		em.close();
	}
}
