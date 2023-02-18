/**
 * Serigala.java
 * Merupakan turunan dari kelas Animal
 * @author 18221121 Rozan Ghosani
 */

public class Serigala extends Animal {

    private long basePower;
    private boolean kawanan;

    public Serigala(long basePower, boolean kawanan) {
        super(4);
        this.basePower = basePower;
        this.kawanan = kawanan;
    }

    public boolean hasKawanan(){
        return kawanan;
    }

    @Override
    public long getAnimalPower() {
        if (kawanan && this.getNumberOfChildren() > 0) {
            return basePower * 3 * this.getNumberOfChildren();
        } else {
            return basePower;
        }
    }
}