package ManyToManyPackage;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;


public class ManyToMany {

	public static void main(String[] args) {
		
		EntityManagerFactory emf = 
				Persistence.createEntityManagerFactory("TABD");
		
		EntityManager em = emf.createEntityManager();
		EntityTransaction tx = em.getTransaction();
		
		tx.begin();
		
		Disciplina disciplina1 = new Disciplina("TABD", "tabd");
		Disciplina disciplina2 = new Disciplina("P3", "P3");
		Disciplina disciplina3 = new Disciplina("TCC", "tcc");
		Disciplina disciplina4 = new Disciplina("TGS", "tgs");
		
		Professor professor1 = new Professor("Abella", "M");
		Professor professor2 = new Professor("Bruno", "M");
		Professor professor3 = new Professor("Adriano", "M");
		Professor professor4 = new Professor("Vera", "F");
		
		professor1.adicionaDisciplina(disciplina1);
		professor1.adicionaDisciplina(disciplina2);
		
		professor2.adicionaDisciplina(disciplina3);
		professor2.adicionaDisciplina(disciplina4);
		
		disciplina1.adicionaProfessor(professor1);
		disciplina1.adicionaProfessor(professor4);
		
		disciplina3.adicionaProfessor(professor3);
		disciplina4.adicionaProfessor(professor3);
		
		em.persist(disciplina1);
		em.persist(disciplina2);
		em.persist(disciplina3);
		em.persist(disciplina4);
		
		em.persist(professor1);
		em.persist(professor1);
		em.persist(professor1);
		em.persist(professor1);
		
		tx.commit();
		em.close();
		emf.close();
		
	}

}
