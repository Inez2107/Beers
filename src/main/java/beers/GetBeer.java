package beers;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

//import beers.Category;
//import beers.Brewer;

public class GetBeer {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("course");
		 EntityManager em = emf.createEntityManager();
	      EntityTransaction tx = em.getTransaction();
	      tx.begin();
	      
	      Beer beer = em.find(Beer.class,4);
	      System.out.println(beer.getName());
	      System.out.println(beer.getPrice());
	      System.out.println(beer.getAlcohol());
	      System.out.println(beer.getStock());
	      System.out.println(beer.getVersion());
	      
	      tx.commit();
	      em.close();

	}

}
