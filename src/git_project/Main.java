package git_project;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
<<<<<<< Updated upstream
	private static Scanner input;
=======
	static Main main = new Main();
	static Scanner input = new Scanner(System.in);
	Gadai gd = new Gadai();
	ArrayList<Gadai> data_gadai = new ArrayList<Gadai>();
	private boolean valid = false;
>>>>>>> Stashed changes
	
	public static void main(String[] args) {
		input = new Scanner(System.in);
		boolean valid;
		
		System.out.println("Pegadaian System: ");
		System.out.println("1. Gadai");
		System.out.println("2. Tebus");
		System.out.println("3. Tampilkan Inventory");
		System.out.println("4. Exit");
		
		while(true) {
			do {
				valid = true;
				try {
					System.out.print("\n\nMasukan nomor program: ");
					int nomor = input.nextInt();
<<<<<<< Updated upstream
					inputan(nomor);
=======
					main.inputan(nomor);
>>>>>>> Stashed changes
				}
				catch(Exception e){
					valid = false;
					System.out.print("Format harus angka");
					input = new Scanner(System.in);
				}
			}while(!valid);
<<<<<<< Updated upstream
=======
		}
	}
	
	public void inputan(int nomor) {
		switch(nomor) {
		case 1:
			main.inputGadai();
			System.out.println(gd.getPrice());
			break;
		case 2:
			main.show_gadai();
			while(true) {
				do {
					valid = true;
					try {
						int id = input.nextInt();
						int available = main.cek_id(id);
						if(available == 0) System.out.print("ID tidak ada");
						else {
							do {
								valid = false;
								System.out.print("Masukan biaya yang ingin ditebus:");
								int tebus = input.nextInt();
								
								if (tebus%10000 == 0) {
									main.change_stats(id, tebus);
									valid = true;
								}
							} while (!valid); 
						}
					}
					catch(Exception e){
						valid = false;
						System.out.print("Format harus angka");
						input = new Scanner(System.in);
					}
				}while(!valid);
			}
		case 3:
			System.out.print("Tampilkan Inventory");
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
	public void inputGadai() {
		String nama, productCategory, description;
		int price;
	
		do {
			input.nextLine();
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
		
		int id = data_gadai.size() + 1;
		data_gadai.add(new Gadai(nama, productCategory, description, "Gadai", id, price));
	}
	
	public void show_gadai() {
		System.out.println("------------------------------------------------------------------------------------------------------------");
		System.out.println(String.format("%s %-5s %5s %-10s %5s %-10s %5s %-20s %5s %-10s %5s %-10s %5s","|","ID","|","Nama","|","Product","|","Description","|","Status","|","Price","|"));
		System.out.println("------------------------------------------------------------------------------------------------------------");
		for(Gadai data:data_gadai) {
			data.getInfo();
			System.out.print("\n");
>>>>>>> Stashed changes
		}
		System.out.println("------------------------------------------------------------------------------------------------------------");
	}
	
<<<<<<< Updated upstream
	public static void inputan(int nomor) {
		switch(nomor) {
		case 1:
			System.out.print("Gadai");
			break;
		case 2:
			System.out.print("Tebus");
			break;
		case 3:
			System.out.print("Tampilkan Inventory");
			break;
		case 4:
			System.out.print("Exit");
			System.exit(0);
			break;
		default:
			System.out.print("Nomor program tidak ada");
			break;
=======
	public int cek_id(int id) {
		int counter = 0;
		for(Gadai data:data_gadai) {
			if(data.getId()==id) counter++;
>>>>>>> Stashed changes
		}
		
		return counter;
	}
	
	public void change_stats(int id, int price) {
		
	}
}
