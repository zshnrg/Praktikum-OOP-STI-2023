/**
 * Sirik.java
 * Merupakan turunan dari kelas Robot
 * @author 18221121 Rozan Ghosani
 */

public class Sirik extends Robot {

    private long price;
    private int totalModel;

    public Sirik(long price) {
		super(5, false);
        this.price = price;
        totalModel = 1;
    }

    public int getTotalModel(){
        return totalModel;
    }

    public void addModel(){
        totalModel++;
    }

    @Override
    public long getPrice() {
		if (totalModel > 2) {
			return price + (500 * super.getNumberOfParts() - (100 * totalModel));
		} else {
			return price + (500 * super.getNumberOfParts() * totalModel);
		}
        // Apabila total model lebih dari 2, 
        // maka formula = price + (500 * numberOfParts - (100 * totalModel))
        // Apabila total model kurang dari/sama dengan 2,
        // maka formula = price + (500 * numberOfParts * totalModel)
    }
}
