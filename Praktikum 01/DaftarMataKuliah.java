import java.util.Scanner;

public class DaftarMataKuliah {
	public static void main (String[] args) {
		Scanner scan = new Scanner(System.in);
		
		String kode = scan.nextLine();
		String namaMk = scan.nextLine();
		int sks = scan.nextInt();
		
		scan.nextLine();
		String namaDsn = scan.nextLine();
		
		int cap = scan.nextInt();
		int rev = scan.nextInt();
		
		MataKuliah mk = new MataKuliah(kode, namaMk, sks, namaDsn, cap);
		
		
		System.out.println("Kode Mata Kuliah: " + mk.getKode());
		System.out.println("Nama Mata Kuliah: " + mk.getNama());
		System.out.println("SKS Mata Kuliah: " + mk.getSks());
		System.out.println("Nama Dosen: " + mk.getDosen());
		System.out.println("Kapasitas Kuliah: " + mk.getKapasitas());
		mk.tambahKapasitas(rev);
		System.out.println("Total Revisi Kapasitas Kuliah: " + mk.getKapasitas());
		scan.close(); 
	}
}
