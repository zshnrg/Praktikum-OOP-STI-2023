/**
 * Robot.java
 * Robot dimodelkan sebagai kelas Robot dengan berbagai jenis hewan merupakan turunan dari kelas Robot. 
 * @author 18221121 Rozan Ghosani
 */

public abstract class Robot {

    private int numberOfParts;
    private boolean isActive;

    public Robot(int numberOfParts, boolean isActive) {
        this.numberOfParts = numberOfParts;
        this.isActive = isActive;
    }

    public int getNumberOfParts() {
        return numberOfParts;
    }

    public boolean getIsActive() {
        return isActive;
    }

    public void setActivation(boolean isActive) {
        this.isActive = isActive;
    }

    public String toString() {
        return "Number of Parts: " + numberOfParts + ", IsActive: " + isActive;
    }

    public abstract long getPrice();
}
