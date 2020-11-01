
import java.util.Scanner;
import java.util.Arrays;

public class AntarJEK {
	public void antarjek() {
		Scanner key = new Scanner(System.in);
		System.out.println("\n---------AntarJek----------\n");

		try{
			System.out.print("Masukkan alamat tujuan : ");
			String alamat = key.nextLine();

			System.out.print("Masukkan Jarak   : ");
			double jarak = key.nextDouble();

			double bayar = jarak * 4000;
			System.out.println("\n------------Data yang Anda Masukkan------\n");

			System.out.println("Alamat tujuan  : "+alamat);
			System.out.println("Jarak Tujuan dengan lokasi anda saat ini  : "+jarak);
			System.out.println("Total yang akan dibayar  : "+bayar);

		}catch(Exception e) {
			System.err.println("Masukkan anda salah!!!!!");
		}
	}
}