package OneToOnePackage;


import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class OneToOne {

	public static void main(String[] args) {
		
		EntityManagerFactory emf = 
				Persistence.createEntityManagerFactory("TABD");
		
		EntityManager em = emf.createEntityManager();
		
		EntityTransaction tx = em.getTransaction();
		tx.begin();
		
		CPF cpf = new CPF(1234567890);
		em.persist(cpf);
		
		Pessoa pessoa = new Pessoa("Caio", cpf);
		em.persist(pessoa);
				
		tx.commit();
		em.close();
		




	}

}
