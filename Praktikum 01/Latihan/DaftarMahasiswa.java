/**
 * DaftarMahasiswa.java
 * @author 18221121 Rozan Ghosani
 */
import java.util.Scanner;

public class DaftarMahasiswa {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String nama = sc.next();
        String nim = sc.next();
        int sks = sc.nextInt();
        int addSks = sc.nextInt();
        
        Mahasiswa mhs = new Mahasiswa(nama, nim, sks);
        System.out.println("Nama mahasiswa: " + mhs.getNama());
        System.out.println("NIM mahasiswa: " + mhs.getNim());
        System.out.println("SKS mahasiswa: " + mhs.getSks());
        System.out.println("Jumlah mahasiswa: " + mhs.getJumlahMahasiswa());
        mhs.tambahSks(addSks);
        System.out.println("Total Revisi SKS mahasiswa: " + mhs.getSks());
        
        sc.close();
    }
}