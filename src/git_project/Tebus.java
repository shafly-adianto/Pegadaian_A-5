package git_project;

public class Tebus {

	int id, price, utang, biaya;
	String product, status;

	public Tebus() {
		super();
	}
	
	public String getDataTebus()
	{
		return id + "" + product + "" + price + "" + status + "" + utang;
	}

	public int getBiaya() {
		return biaya;
	}

	public void setBiaya(int biaya) {
		this.biaya = biaya;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getUtang() {
		return utang;
	}

	public void setUtang(int utang) {
		this.utang = utang;
	}

	public String getProduct() {
		return product;
	}

	public void setProduct(String product) {
		this.product = product;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	
}
