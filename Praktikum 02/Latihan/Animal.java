/**
 * Animal.java
 * Hewan dimodelkan sebagai kelas Animal dengan berbagai jenis hewan merupakan turunan dari kelas Animal.
 * @author 18221121 Rozan Ghosani
 */

 public abstract class Animal {

    private int numberOfLegs;
    private long children;

    public Animal(int numberOfLegs) {
        this.numberOfLegs = numberOfLegs;
        children = 0;
    }

    public int getNumberOfLegs() {
        return numberOfLegs;
    }

    public long getNumberOfChildren() {
        return children;
    }

    public void increaseChild(long inc) {
        children += inc;
    }

    public String toString() {
        return "Number of Legs: " + numberOfLegs + ", Child: " + children;
    }

    public abstract long getAnimalPower();
}