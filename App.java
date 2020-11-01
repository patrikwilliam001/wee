
import java.util.Scanner;
import java.util.Arrays;

class Menu {
	String nmenu;

	public Menu(String nmenu){
		this.nmenu = nmenu;
	}
	public String getMenu() {
		return nmenu;
	}
}

public class App {
	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);
		//idetifikasi class pesanan
		Food psn = new Food();
		//idetifikasi class from antarjek
		AntarJEK jek = new AntarJEK();
		//idetifikasi class from antarcar
		AntarCar car = new AntarCar();
		//objek antarsend
		AntarSend send = new AntarSend();
		//objek cleanaja
		CleanAja cle = new CleanAja();
		//objek tiket aja
		TiketAja ta = new TiketAja();

		Hotel ht = new Hotel();
		Patrik pt = new Patrik();


		//arrays dari menu
		Menu menu[] = {
			new Menu("1. Food "),
			new Menu("2. AntarJek"),
			new Menu("3. AntarCar"),
			new Menu("4. AntarSend"),
			new Menu("5. AngkutAja"),
			new Menu("6. tiketaja"),
			new Menu("7. HotelAja"),
			new Menu("8. Patrik")

		};
		while(true) {
			System.out.println("\n----------------MyApp-------------------\n");

				for (Menu mn : menu) {
					System.out.println(mn.getMenu());
				}
			try{
				System.out.print("Enter your choise[1..5]  : ");
				int choise = key.nextInt();
				switch(choise) {
					case 1:
						psn.makanan();
						break;
					case 2:
						jek.antarjek();
						break;
					case 3:
						car.antarcar();
						break;
					case 4:
						send.antarsend();
						break;
					case 5:
						cle.cleanaja();
						break;
					case 6:
						ta.anTiketAja();
						break;
					case 7:
						ht.hotel();
						break;
					case 8:
						pt.atti();
					default:
						System.err.println("Masukkan dengan Benar");
						break;
				}

			}catch(Exception e) {
					System.err.println("Masukkan dengan benar!!!");
			}
			System.out.println("\n\n\n");
			break;
		}

	}
} 