
import java.util.Scanner;
import java.util.Arrays;

class Pesawat {
	String nama;
	
	public Pesawat(String nama) {
		this.nama = nama;
	}
	public String getPesawat() {
		return nama;
	}
}

public class TiketAja {

	public void anTiketAja() {
		Scanner inp = new Scanner(System.in);
		System.out.println("\n---------------Tiket Aja---------------\n");
		try{
			System.out.print("Masukkan nama anda  : ");
			String nama = inp.nextLine();

			System.out.println("1. penerbangan domestik");
			System.out.println("2. penerbangan internasional");

			System.out.print("Masukkan pilihan[1.2]  : ");
			int pilihan = inp.nextInt();

			if (pilihan == 1) {
				domestik();
			}else if (pilihan == 2) {
				internasional();
			}

		}catch(Exception e) {
			System.err.println(e);
		}


	}
	public void domestik() {
		Scanner inp = new Scanner(System.in);
		System.out.print("Masukkan tujuan penerbangan domestik  : ");
		String apenerbangan = inp.nextLine();

		System.out.println("\n-------Daftar Pesawat---------\n");
		penerbangan();

		System.out.print("Masukkan pilihan  : ");
		int dm = inp.nextInt();

		if (dm == 1) {
			lion();
		}else if(dm == 2) {
			garuda();
		}else if (dm == 3) {
			sriwijaya();

		}else if(dm == 4) {
			citilink();
		}else{
			System.out.println("salah");
		}
	}
	public void internasional() {
		Scanner inp = new Scanner(System.in);
		System.out.print("Masukkan tujuan penerbangan internasional  : ");
		String apenerbangan = inp.nextLine();

		penerbangan();

		System.out.print("Masukkan Pilihan pesawat  : ");
		int ln = inp.nextInt();
		if (ln == 1) {
			lion();
		}else if(ln == 2) {
			garuda();
		}else if (ln == 3) {
			sriwijaya();

		}else if(ln == 4) {
			citilink();
		}else{
			System.out.println("salah");
		}


	}
	public void penerbangan() {
		Pesawat apesawat[] = {
			new Pesawat("1. Lion"),
			new Pesawat("2. Garuda Indonesia"),
			new Pesawat("3. Sriwijaya Air"),
			new Pesawat("4. Citilink")
		};
		for (Pesawat ps : apesawat) {
			System.out.println(ps.getPesawat());
		}
	}
	public void lion() {
		Scanner inp = new Scanner(System.in);

		System.out.println("\n--------Lion---------\n");
		try{
			System.out.print("Masukkan alamat tujuan  : ");
			String at = inp.nextLine();

			System.out.println("Harga tiket : 200000");

		}catch(Exception e) {
			System.out.println(e);
		}
	}
	public void garuda() {
		Scanner inp = new Scanner(System.in);

		System.out.println("\n--------Gauda Indonesia---------\n");
		try{
			System.out.print("Masukkan alamat tujuan  : ");
			String at = inp.nextLine();

			System.out.println("Harga tiket : 300000");

		}catch(Exception e) {
			System.out.println(e);
		}
	}
	public void sriwijaya() {
		Scanner inp = new Scanner(System.in);

		System.out.println("\n--------sriwijaya---------\n");
		try{
			System.out.print("Masukkan alamat tujuan  : ");
			String at = inp.nextLine();

			System.out.println("Harga tiket : 250000");

		}catch(Exception e) {
			System.out.println(e);
		}
	}
	public void citilink() {
		Scanner inp = new Scanner(System.in);

		System.out.println("\n--------citilink---------\n");
		try{
			System.out.print("Masukkan alamat tujuan  : ");
			String at = inp.nextLine();

			System.out.println("Harga tiket : 259000");

		}catch(Exception e) {
			System.out.println(e);
		}
	}
}