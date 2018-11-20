package beers;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class AddBeer {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("course");
	      EntityManager em = emf.createEntityManager();
	      EntityTransaction tx = em.getTransaction();
	      tx.begin();
	      
	      Beer bier = new Beer();
	      bier.setName("Manenblusser");
	      bier.setPrice(3);
	      bier.setStock(10);
	      bier.setVersion(0);
	      
	      Category categorie = em.find(Category.class, 11);
	      Brewer brouwer = em.find(Brewer.class, 4);
	      
	      bier.setCategory(categorie);
	      bier.setBrewer(brouwer);
	      
	      tx.commit();
	      em.close();
	      emf.close();
	      
	      System.out.println("Beer added");
	 
	}

}
