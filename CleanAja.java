
import java.util.Scanner;

public class CleanAja {
	public void cleanaja() {
		Scanner inp = new Scanner(System.in);
		String[] menuclean = {"1. Bersihkan Rumah", "2. Bersihkan Rumah Ibadah","3. Bersihkan tempat umum"};

		System.out.println("\n-----------Clean Aja------------\n");

		for (String c : menuclean) {
			System.out.println(c);
		}

		System.out.print("Masukkan pilihan anda  : ");
		int pilihan = inp.nextInt();
		switch(pilihan) {
			case 1:
				rmpribadi();
				break;
			case 2:
				rmpibadah();
				break;
			case 3:
				rmumum();
				break;
			default:
			 	System.err.println("Masukkan dengan benar");

		}

	}

	public void rmpribadi() {
		Scanner inp = new Scanner(System.in);
		System.out.println("\n-----------Bersihkan Rumah------------\n");

		try{
			System.out.print("Masukkan alamat anda  : ");
			String alamat = inp.nextLine();

			System.out.print("Masukkan berapa jam   : ");
			double jam = inp.nextDouble();

			double total = 8000 * jam;

			System.out.println("\n--------------Data yang anda Masukkan----------\n");
			System.out.println("alamat anda  : "+alamat);
			System.out.println("Waktu yang digunakanan  : "+jam);
			System.out.println("Total Bayar  : "+total);

		}catch(Exception e) {
			System.err.println("Masukkan data dengan benar!!!");
		}


	}
	public void rmpibadah() {
		Scanner inp = new Scanner(System.in);
		System.out.println("\n-----------Bersihkan Rumah Ibadah------------\n");

		try{
			System.out.print("Masukkan alamat anda  : ");
			String alamat = inp.nextLine();


			System.out.println("\n--------------Data yang anda Masukkan----------\n");
			System.out.println("alamat anda  : "+alamat);
			
			System.out.println("Biarlah Tuhan Yesus yang membalasnya");

		}catch(Exception e) {
			System.err.println("Masukkan data dengan benar!!!");
		}


	}
	public void rmumum() {
		Scanner inp = new Scanner(System.in);
		System.out.println("\n-----------Bersihkan Tempat umum------------\n");

		try{
			System.out.print("Masukkan alamat  : ");
			String alamat = inp.nextLine();


			System.out.println("\n--------------Data yang anda Masukkan----------\n");
			System.out.println("alamat anda  : "+alamat);
			
			System.out.println("Indonesia tercinta kami");

		}catch(Exception e) {
			System.err.println("Masukkan data dengan benar!!!");
		}


	}
}