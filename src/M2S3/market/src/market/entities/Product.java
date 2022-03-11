package market.entities;

public class Product {
	private long id;
	private String name;
	private String description;
	private double price;
	
	public Product(String name, String description, double price) {
		this.name = name;
		this.description = description;
		this.price = price;
	};
	
	
	
	public void setId(long id) {
		this.id = id;
	}



	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}



	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getDescription() {
		return description;
	}


	public void setDescription(String description) {
		this.description = description;
	}


	public long getId() {
		return id;
	}

	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", description=" + description + ", price=" + price + "]";
	}



	public Product() {}
	
	
}
