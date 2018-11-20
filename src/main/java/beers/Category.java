package beers;


import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="categories")
public class Category {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	private  String category;
	
	@OneToMany(mappedBy="category", cascade = CascadeType.REMOVE)
	private List <Beer> bieren = new ArrayList<>();
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public List<Beer> getBieren() {
		return bieren;
	}
	public void setBieren(List<Beer> bieren) {
		this.bieren = bieren;
	}
	@Override
	public String toString() {
		return "Category [id=" + id + ", category=" + category + ", bieren=" + bieren + ", getId()=" + getId()
				+ ", getCategory()=" + getCategory() + ", getBieren()=" + getBieren() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
	
	
}
