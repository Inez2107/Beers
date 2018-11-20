package beers;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="brewers")
public class Brewer {
	
	private int turnover;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(name="BREWERNAME")
	private String name; 
	
	@Column(name="ADDRESS")
	private String adress;
	private String zipCode;
	private String city;
	
	@OneToMany(mappedBy="brewer", cascade = CascadeType.REMOVE)
	private List <Beer> bieren = new ArrayList<>();
	
	public List<Beer> getBieren() {
		return bieren;
	}
	public void setBieren(List<Beer> bieren) {
		this.bieren = bieren;
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
	public String getAdress() {
		return adress;
	}
	public void setAdress(String adress) {
		this.adress = adress;
	}
	public String getZipCode() {
		return zipCode;
	}
	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public int getTurnover() {
		return turnover;
	}
	public void setTurnover(int turnover) {
		this.turnover = turnover;
	}
	@Override
	public String toString() {
		return "Brewer [id=" + id + ", name=" + name + ", adress=" + adress + ", zipCode=" + zipCode + ", city=" + city
				+ ", turnover=" + turnover + ", bieren=" + bieren + ", getBieren()=" + getBieren() + ", getId()="
				+ getId() + ", getName()=" + getName() + ", getAdress()=" + getAdress() + ", getZipCode()="
				+ getZipCode() + ", getCity()=" + getCity() + ", getTurnover()=" + getTurnover() + ", getClass()="
				+ getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
	
}
	
	
