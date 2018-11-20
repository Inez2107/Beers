package beers;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class RemoveBrewer {

	public static void main(String[] args) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("course");
	      EntityManager em = emf.createEntityManager();
	      EntityTransaction tx = em.getTransaction();
	      tx.begin();
	      
	      Brewer brewer = em.getReference(Brewer.class,11);
	      em.remove(brewer);
	     
	      tx.commit();
		
	      System.out.println("brouwer verwijderd");
	      
	      em.close();
	}
	
}
