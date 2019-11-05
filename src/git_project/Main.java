package git_project;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	static Main main = new Main();
	static Scanner input = new Scanner(System.in);
	Gadai gd = new Gadai();
	ArrayList<Gadai> data_gadai = new ArrayList<>();

	public String centerString (int width, String s) {
	    return String.format("%-" + width  + "s", 
	    		String.format("%" + (s.length() + (width - s.length()) / 2) + "s", s));
	}
	
	public void inputGadai() {
		input.nextLine();
		String nama, productCategory, description;
		int price, id;
		boolean valid = false;
	
		do {
			System.out.print("Nama :");
			nama = input.nextLine();
			
			if (nama.length() >= 3 && nama.length() <= 15) {
				gd.setNama(nama);
				valid = true;
			}
		} while (!valid);
		
		do {
			valid = false;
			System.out.print("Product Category :");
			productCategory = input.nextLine();
			
			if (productCategory.equalsIgnoreCase("laptop") || productCategory.equalsIgnoreCase("motor") || productCategory.equalsIgnoreCase("emas")) {
				gd.setProductCategory(productCategory);
				valid = true;
			}
		} while (!valid);
		
		do {
			valid = false;
			System.out.print("Description :");
			description = input.nextLine();
			
			if (description.indexOf(" ") >= 1) {
				gd.setDescription(description);
				valid = true;
			}
		} while (!valid);
		
		do {
			valid = false;
			System.out.print("Price :");
			price = input.nextInt();
			
			if (price%10000 == 0) {
				gd.setPrice(price);
				valid = true;
			}
		} while (!valid);
		id = data_gadai.size() +1;
		data_gadai.add(new Gadai(nama, productCategory, description, "Gadai", id, price, price));
	}
	
	public void showTebus() {
		int id, biaya;
		int checkId =0 , checkBiaya =0;
		boolean valid;
		
		String header = "|"+centerString(8, "Id")+"|"+centerString(12, "Produk")+"|"+centerString(12, "Price")+"|"+centerString(12, "Status")+"|"+centerString(12, "Utang")+"|";
		String caption = "|"+centerString(header.length()-2, "LIST GADAI")+"|";
		String line = "";
		String stripe = "";
		
		for (int i = 0; i < caption.length(); i++) {
			line+="=";
			if (i>1) {
				stripe+="-";
			}
		}	
		
		if (data_gadai.isEmpty()==true) {
			System.out.println("Data gadai kosong, silahkan input gadai terlebih dulu.");
		}
		else {
			System.out.println("\n"+line);
			System.out.println(caption+"\n|"+stripe+"|\n"+header+"\n|"+stripe+"|");
			for (Gadai gadai : data_gadai) {
				System.out.println(gadai.getId()+" "+gadai.getProductCategory()+" "+ gadai.getPrice()+" "+gadai.getStatus()+" "+gadai.getHutang());
			}
			System.out.println(line+"\n");
			
			do {
				valid = false;
				System.out.println("Masukkan id barang yang ingin di tebus :");
				id = input.nextInt();
				System.out.println("\nMasukkan biaya yang ingin di tebus :");
				biaya = input.nextInt();
				
				for (Gadai gadai : data_gadai) {
					if (gadai.getId()==id) {
						checkId+=1;
					}
					if (biaya <= gadai.getHutang()) {
						checkBiaya+=1;
					}
				}
				
				if (checkId > 0 && checkBiaya > 0) {
					for (Gadai gadai : data_gadai) {
						if (gadai.getId() == id) {
							if (biaya <= gadai.getHutang()) {
								gadai.setHutang(gadai.getHutang() - biaya);
								if (gadai.getHutang()==0) {
									gadai.setStatus("Lunas");
								}
								valid = true;
							}
						}
					}
				}
				else if (checkId == 0 && checkBiaya > 0) {
					System.out.println("\nId tidak ditemukkan");
					valid = false;
				}
				else if (checkId > 0 && checkBiaya == 0) {
					System.out.println("\nBiaya yang dimasukkan melebihi hutang");
					valid = false;
				}
				else {
					System.out.println("\nId tidak ditemukkan");
					valid = false;
				}
				
			} while (!valid);
			
			System.out.println("\n"+line);
			System.out.println(caption+"\n|"+stripe+"|\n"+header+"\n|"+stripe+"|");
			System.out.println(line+"\n");
			for (Gadai gadai : data_gadai) {
				System.out.println(gadai.getId()+" "+gadai.getProductCategory()+" "+ gadai.getPrice()+" "+gadai.getStatus()+" "+gadai.getHutang());
			}
			System.out.println(line+"\n");
		}
	}

	public void showInventori() {
		int hitungBarang = 0;
		
		String header = "|"+centerString(8, "Id")+"|"+centerString(15, "Nama")+"|"+centerString(12, "Product")+"|"+centerString(18, "Description")+"|"+centerString(12, "Price")+"|";
		String caption = "|"+centerString(header.length()-2, "LIST GADAI")+"|";
		String line = "";
		String stripe = "";
		
		for (int i = 0; i < caption.length(); i++) {
			line+="=";
			if (i>1) {
				stripe+="-";
			}
		}
		
		System.out.println("\n"+line);
		System.out.println(caption+"\n|"+stripe+"|\n"+header+"\n|"+stripe+"|");
		System.out.println(line+"\n");
		for (Gadai gadai : data_gadai) {
			if (gadai.getStatus().equalsIgnoreCase("gadai")) {
				hitungBarang+=1;
				System.out.println(gadai.getNama()+" "+gadai.getProductCategory()+" "+gadai.getDescription()+" "+gadai.getPrice());
			}
		}
		System.out.println(line+"\n");
		
		if (hitungBarang==0) {
			System.out.println("Tidak ada barang gadai di inventori");
		}
	}
	
	public static void main(String[] args) {
		input = new Scanner(System.in);
		boolean valid;
		
		while(true) {
			do {
				valid = true;
				try {
					System.out.println("Pegadaian System: ");
					System.out.println("1. Gadai");
					System.out.println("2. Tebus");
					System.out.println("3. Tampilkan Inventory");
					System.out.println("4. Exit");
					System.out.print("\n\nMasukan nomor program: ");
					int nomor = input.nextInt();
					main.inputan(nomor);
				}
				catch(Exception e){
					valid = false;
					System.out.print("Sesuaikan Format Inputtan!!!");
					input = new Scanner(System.in);
				}
			}while(!valid);
		}
	}
	
	public void inputan(int nomor) {
		switch(nomor) {
		case 1:
			main.inputGadai();
			break;
		case 2:
			main.showTebus();
			break;
		case 3:
			main.showInventori();
			break;
		case 4:
			System.out.print("Exit");
			System.exit(0);
			break;
		default:
			System.out.print("Nomor program tidak ada");
			break;
		}
		
	}
}