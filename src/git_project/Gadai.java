package git_project;

public class Gadai {
	private String nama, productCategory, description, status;
	private	int id, price, hutang;
	
	public Gadai() {
		// TODO Auto-generated constructor stub
	}

	public Gadai(String nama, String productCategory, String description, String status, int id, int price,
			int hutang) {
		super();
		this.nama = nama;
		this.productCategory = productCategory;
		this.description = description;
		this.status = status;
		this.id = id;
		this.price = price;
		this.hutang = hutang;
	}

	public String getNama() {
		return nama;
	}
	public void setNama(String nama) {
		this.nama = nama;
	}
	
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

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
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

	public int getHutang() {
		return hutang;
	}

	public void setHutang(int hutang) {
		this.hutang = hutang;
	}

/*	public String getInfoAll() {
		return nama;
	}*/

}