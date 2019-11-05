package mphasis.assignment;

public class Product {
	private int id;
	private String product_name;
	private int quantity;
	private float price;
	public Product()
	{
		
	}
	public Product(int id, String product_name, int quantity, float price) {
		super();
		this.id = id;
		this.product_name = product_name;
		this.quantity = quantity;
		this.price = price;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getProduct_name() {
		return product_name;
	}
	public void setProduct_name(String product_name) {
		this.product_name = product_name;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Product [id=" + id + ", product_name=" + product_name + ", quantity=" + quantity + ", price=" + price
				+ "]";
	}
	
}
