/**
 * Bumblebee.java
 * Merupakan turunan dari kelas Robot
 * @author 18221121 Rozan Ghosani
 */

public class Bumblebee extends Robot {

    private int totalTransformation;

    public Bumblebee(int numberOfParts, boolean isActive) {
		super(numberOfParts, isActive);
		totalTransformation = 1;
        // Konstruktor, set totalTransformation = 1
    }

    public int getTotalTransformation(){
        return totalTransformation;
    }

    public void addTransformation(){
        totalTransformation++;
    }

    @Override
    public long getPrice() {
		if (super.getIsActive()) {
			return super.getNumberOfParts() * 1000 * totalTransformation;
		} else {
			return super.getNumberOfParts() * 1000;
		}
        // Apabila aktif, harga bernilai numberOfParts * 1000 * totalTransformation
        // Apabila tidak aktif, harga bernilai numberOfParts * 1000
    }
}
