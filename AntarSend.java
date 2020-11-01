
import java.util.Scanner;
import java.util.Arrays;

public class AntarSend {

	public void antarsend() {
		Scanner inp = new Scanner(System.in);
		//objek antarjek
		AntarJEK jek = new AntarJEK();
		//objek antarcar
		AntarCar car= new AntarCar();

		//arrays
		String[] menu = {"1. AntarJEK", "2. AntarCar"};

		System.out.println("\n-----------Antar Send----------\n");

		try{
			System.out.print("Masukkan nama Barang  : ");
			String barang = inp.nextLine();

			for (String i : menu) {
				System.out.println(i);
			}
			System.out.print("Masukkan pilihan anda  : ");
			int pilihan = inp.nextInt();

			switch(pilihan) {
				case 1:
					jek.antarjek();
					break;
				case 2:
					car.antarcar();
					break;
				default:
					System.err.println("Masukkan anda salah!!!");
					break;
			}

			System.out.println("\n-------------Data yang anda  masukkan-----------\n");

			System.out.println("Nama Barang  : "+barang);
			
		}catch(Exception e) {
			System.err.println("Masukkan anda salah!!!");
		}

		



	}
}