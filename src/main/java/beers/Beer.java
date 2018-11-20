package beers;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="beers")
public class Beer {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(name="BEERNAME")
	private String name;
	
	@ManyToOne
	@JoinColumn(name="brewerId")
	private Brewer brewer;
	
	@ManyToOne
	@JoinColumn(name="categoryId")
	private Category category;
	
	private float price;
	private int stock;
	private float alcohol;
	private int version;
	
	public Beer() {
	
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public int getStock() {
		return stock;
	}
	public void setStock(int stock) {
		this.stock = stock;
	}
	public float getAlcohol() {
		return alcohol;
	}
	public void setAlcohol(float alcohol) {
		this.alcohol = alcohol;
	}
	public int getVersion() {
		return version;
	}
	public void setVersion(int version) {
		this.version = version;
	}
	public Category getCategory() {
		return category;
	}
	public void setCategory(Category category) {
		this.category = category;
	}
	public Brewer getBrewer() {
		return brewer;
	}
	public void setBrewer(Brewer brewer) {
		this.brewer = brewer;
	}
	@Override
	public String toString() {
		return "Beer [id=" + id + ", name=" + name + ", price=" + price + ", stock=" + stock + ", alcohol=" + alcohol
				+ ", version=" + version + ", category=" + category + ", brewer=" + brewer + "]";
	}
	

}
