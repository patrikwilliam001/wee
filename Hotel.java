
import java.util.Scanner;
import java.util.Arrays;

class Nama {
	String anama;

	public Nama(String anama) {
		this.anama = anama;
	}
	public String getnama() {
		return anama;
	}
}

public class Hotel {
	public void hotel() {
		Scanner inp = new Scanner(System.in);
		System.out.println("\n------------hotel-----------\n");
		Nama nama[] = {
			new Nama("1. Hotel mu"),
			new Nama("2. Hotel ku")
		};

		for (Nama nm : nama) {
			System.out.println(nm.getnama());
		}
		try{

			System.out.print("Masukkan pilihan anda  : ");
			int anplh = inp.nextInt();

			switch(anplh){
				case 1:
					anhotelmu();
					break;
				case 2:
					anhotelku();
					break;
				default :
					System.err.println("masukkan tidak ditemukan");
					break;
			}
		}catch(Exception e) {
			System.err.println(e);
		}

	}
	public void anhotelmu() {
		Scanner inp = new Scanner(System.in);
		System.out.println("\n-------Hotel mu---------\n");
		try{
			System.out.print("Masukkan nama  : ");
			String namamu = inp.nextLine();
			System.out.print("Masukkan nama Hotel  : ");
			String otel = inp.nextLine();
			System.out.print("Masukkan hari di hotel  : ");
			int anjam = inp.nextInt();

			int bayar = 150000 * anjam;

			System.out.println("\n-------------Data yang anda masukkan--------\n");
			System.out.println("nama anda  : "+namamu);
			System.out.println("Hotel : "+otel);
			System.out.println("Jumlah yang akan anda bayar  : "+bayar);


		}catch(Exception e) {
			System.err.println(e);
		}
		
	}
		public void anhotelku() {
		Scanner inp = new Scanner(System.in);
		System.out.println("\n-------Hotel ku---------\n");
		try{
			System.out.print("Masukkan nama  : ");
			String namamu = inp.nextLine();
			System.out.print("Masukkan nama Hotel  : ");
			String otel = inp.nextLine();
			System.out.print("Masukkan hari di hotel  : ");
			int anjam = inp.nextInt();

			int bayar = 500000 * anjam;
			
			System.out.println("\n-------------Data yang anda masukkan--------\n");
			System.out.println("nama anda  : "+namamu);
			System.out.println("Hotel : "+otel);
			System.out.println("Jumlah yang akan anda bayar  : "+bayar);

			
		}catch(Exception e) {
			System.err.println(e);
		}
		
	}
}