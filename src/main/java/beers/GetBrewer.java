package beers;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class GetBrewer {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("course");
		EntityManager em = emf.createEntityManager();
	    EntityTransaction tx = em.getTransaction();
	    tx.begin();
	      
	      Brewer brewer = em.find(Brewer.class,4);
	      System.out.println(brewer.getId());
	      System.out.println(brewer.getName());
	      System.out.println(brewer.getAdress());
	      System.out.println(brewer.getZipCode());
	      System.out.println(brewer.getCity());
	      System.out.println(brewer.getTurnover());
	      
	      System.out.println(brewer.toString());
	      
	      
	      tx.commit();
	      em.close();

	}

}
