package ManyToOnePackage;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class ManyToOne {

	public static void main(String[] args) {
		
		EntityManagerFactory emf = 
				Persistence.createEntityManagerFactory("TABD");
		
		EntityManager em = emf.createEntityManager();
		EntityTransaction tx = em.getTransaction();
		
		tx.begin();
		
		Categoria categoria = new Categoria("Alimentos");
		
		Produto produto1 = new Produto("Arroz", 3.50, 5);
		Produto produto2 = new Produto("Carne", 8.00, 10);
		Produto produto3 = new Produto("Feijao", 12.00, 3);
		Produto produto4 = new Produto("Macarrão", 10.00, 9);

		produto1.setCategoria(categoria);
		produto2.setCategoria(categoria);
		produto3.setCategoria(categoria);
		produto4.setCategoria(categoria);
			
		categoria.adicionaProduto(produto1);
		categoria.adicionaProduto(produto2);
		categoria.adicionaProduto(produto3);
		categoria.adicionaProduto(produto4);
		
		em.persist(categoria);
		
		tx.commit();
		em.close();
		
	}

}
