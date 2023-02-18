/**
 * Gajah.java
 * Merupakan turunan dari kelas Animal
 * @author 18221121 Rozan Ghosani
 */

 public class Gajah extends Animal {

    private long basePower;
    private int jumlahGading;

    public Gajah(long basePower, int jumlahGading) {
        super(4);
        this.basePower = basePower;
        this.jumlahGading = jumlahGading;
        if (jumlahGading < 0) this.jumlahGading = 0;
        if (jumlahGading > 2) this.jumlahGading = 2;
    }

    public long getJumlahGading(){
        return jumlahGading;
    }

    @Override
    public long getAnimalPower() {
        return 3 * basePower * (1 + jumlahGading);
    }
}