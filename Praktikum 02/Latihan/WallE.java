/**
 * WallE.java
 * Merupakan turunan dari kelas Robot
 * @author 18221121 Rozan Ghosani
 */

public class WallE extends Robot {

    private long mileage;

    public WallE(long mileage, boolean isActive) {
		super(10, isActive);
        this.mileage = mileage;
    }

    public long getMileage(){
        return mileage;
    }

    public void addMileage(long increment){
        mileage += increment;
    }

    @Override
    public long getPrice() {
		if (super.getIsActive()) {
			return mileage * 1000;
		} else {
			return mileage * 1000 + 500;
		}
        // Apabila sedang aktif, maka harga total adalah mileage * 1000, 
        // Apabila tidak aktif maka ada tambahan biaya 500
    }
}
