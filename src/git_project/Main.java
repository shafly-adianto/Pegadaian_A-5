package git_project;
import java.util.Scanner;

public class Main {
	private static Scanner input;
	
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
					inputan(nomor);
				}
				catch(Exception e){
					valid = false;
					System.out.print("Format harus angka");
					input = new Scanner(System.in);
				}
			}while(!valid);
		}
	}
	
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
		}
		
	}
}
