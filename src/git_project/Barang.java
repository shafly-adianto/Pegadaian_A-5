package assignment;

public class Barang {
	public Barang() {
		// TODO Auto-generated constructor stub
	}
	
	private String productCategory, description, status;
	private	int price;
	
	public String getProductCategory() {
		return productCategory;
	}
	public void setProductCategory(String productCategory) {
		this.productCategory = productCategory;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	
	public String getAllInfo() {
		return productCategory+" "+description+" "+status+" "+price;
	}
	
}
