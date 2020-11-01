
import java.util.Scanner;

public class AntarCar{

	public void antarcar() {
		Scanner inp = new Scanner(System.in);
		System.out.println("\n---------Antar Car----------\n");



		try{
			System.out.print("Masukkan alamat tujuh : ");
			String alamat = inp.nextLine();

			System.out.print("Masukkan jarak anda ke tujuan  : ");
			int jarak = inp.nextInt();

			int total = jarak * 6000;
			double tol= (double) jarak;

			System.out.println("\n----------Data yang anda masukkan---------\n");
			System.out.println("Alamat tujuan  : "+alamat);

			System.out.println("Jarak  : "+jarak);

			System.out.println("Jumlah Bayar  : "+total);

		}catch(Exception e) {
			System.err.println("maaf perintah anda masukkan salah!!!");
		}
		

	}
}