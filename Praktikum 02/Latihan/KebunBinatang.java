/**
 * KebunBinatang.java
 * Program utama Animal.java
 * @author 18221121 Rozan Ghosani
 */

 import java.util.Scanner;

public class KebunBinatang {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int type = sc.nextInt();
        long children = sc.nextLong();
        switch (type) {
            case 1:
                int nTelur = sc.nextInt();

                Elang el = new Elang(5);
                el.increaseChild(children);
                for (int i = 0; i < nTelur; i++) el.bertelur(); 

                System.out.println(el.toString());
                System.out.println("Jumlah Telur: " + el.getJumlahTelur());
                System.out.println("Animal Power: " + el.getAnimalPower());
                break;
            case 2:
                int nGading = sc.nextInt();

                Gajah g = new Gajah(10, nGading);
                g.increaseChild(children);

                System.out.println(g.toString());
                System.out.println("Jumlah Gading: " + g.getJumlahGading());
                System.out.println("Animal Power: " + g.getAnimalPower());
                break;
            case 3:
                boolean kawanan = sc.nextBoolean();

                Serigala sg = new Serigala(10, kawanan);
                sg.increaseChild(children);

                System.out.println(sg.toString());
                if (kawanan) {
                    System.out.println("Serigala berada di dalam kawanan");
                } else {
                    System.out.println("Serigala tidak berada di dalam kawanan");
                }
                System.out.println("Animal Power: " + sg.getAnimalPower());
                break;
        }

        sc.close();
    }
}
