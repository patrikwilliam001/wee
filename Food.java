
import java.util.Scanner;
import java.util.Arrays;

public class Food {
	public void makanan() {
		Scanner input = new Scanner(System.in);
		String[] nama = {"1. Pattong", "2. Babi hutan", "3. Pizza", "4. Bakso Bav", "5. Coto lamongan", "6. Bebek goreng" , "7. Ikan"};

		for(String i : nama) {
			System.out.println(i);
		}
		try {
			System.out.print("Masukkan pilihanan[1..7]   : ");
			int pilihanan = input.nextInt();
			switch(pilihanan) {
				case 1:
					pattong();
					break;
				case 2: 
					baiht();
					break;
				case 3:
					pizza();
					break;
				case 4:
					bakba();
					break;
				case 5:
					cotolm();
					break;
				case 6:
					bebekgr();
					break;
				case 7:
					ikan();
					break;
				default:
					System.err.println("pilihan yang anda masukkan salah!!!!");
					break;
			}
		}catch(Exception e) {
			System.err.println("Menu tidak tersedia!!!");
		}
	}
	public void pattong() {
		Scanner key = new Scanner(System.in);

		try{
			System.out.println("\n-------------Pattong------------\n");
			System.out.print("Jumlah porsi Pesanan  : ");
			int porsi = key.nextInt();

			int total = 10000 * porsi;
			System.out.println("Total Pembayaran  : "+total);

		}catch(Exception e) {
			System.err.println("Masukkan data dengan benar");
		}

	}
	public void baiht() {
		Scanner key = new Scanner(System.in);
		try{
		System.out.println("\n--------------Babi hutan--------------\n");

		System.out.print("Masukkan jumlah porsi  : ");
		int porsi = key.nextInt();

		int total = 20000 * porsi;
		System.out.println("Total Pembayaran  : "+total);

		}catch(Exception e) {
			System.err.println("Masukkan pilihan anda dengan benar!!!");
		}
	}
	public void pizza() {
		Scanner key = new Scanner(System.in);
		System.out.println("\n-------------pizza------------\n");
		try{
			System.out.print("Masukkan jumlah porsi  : ");
			int porsi = key.nextInt();

			int total = 50000 * porsi;
			System.out.println("Total Pembayaran   : "+total);

		}catch(Exception e) {
			System.err.println("Masukkan pilihan dengan benar!!!");
		}

	}
	public void bakba() {
		Scanner key = new Scanner(System.in);
		System.out.println("\n-------------Bakso Bav------------\n");
		try{
			System.out.print("Masukkan jumlah porsi  : ");
			int porsi = key.nextInt();

			int total = 21000 * porsi;
			System.out.println("Total Pembayaran   : "+total);

		}catch(Exception e) {
			System.err.println("Masukkan pilihan dengan benar!!!");
		}

	}
	public void cotolm() {
		Scanner key = new Scanner(System.in);
		System.out.println("\n-------------Coto lamongan------------\n");
		try{
			System.out.print("Masukkan jumlah porsi  : ");
			int porsi = key.nextInt();

			int total = 12000 * porsi;
			System.out.println("Total Pembayaran   : "+total);

		}catch(Exception e) {
			System.err.println("Masukkan pilihan dengan benar!!!");
		}

	}
	public void bebekgr() {
		Scanner key = new Scanner(System.in);
		System.out.println("\n-------------Bebek Goreng------------\n");
		try{
			System.out.print("Masukkan jumlah porsi  : ");
			int porsi = key.nextInt();

			int total = 15000 * porsi;
			System.out.println("Total Pembayaran   : "+total);

		}catch(Exception e) {
			System.err.println("Masukkan pilihan dengan benar!!!");
		}

	}
	public void ikan() {
		Scanner key = new Scanner(System.in);
		System.out.println("\n-------------Ikan------------\n");
		try{
			System.out.print("Masukkan jumlah porsi  : ");
			int porsi = key.nextInt();

			int total = 120000 * porsi;
			System.out.println("Total Pembayaran   : "+total);

		}catch(Exception e) {
			System.err.println("Masukkan pilihan dengan benar!!!");
		}

	}
}