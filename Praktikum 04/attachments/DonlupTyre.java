public class DonlupTyre implements Tyre {
    private int pressure;
    private int width;
    private Boolean isSlick;

    public DonlupTyre(int pressure, int width, Boolean isSlick) {
        this.pressure = pressure;
        this.width = width;
        this.isSlick = isSlick;
        // Konstruktor
    }

    @Override
    public int getTyrePressure() {
		return pressure;
        // Mengembalikan pressure
    }

    @Override
    public int getTyreWidth() {
		return width;
        // Mengembalikan width
    }

    @Override
    public Boolean isSlickTyre() {
		return isSlick;
        // Mengembalikan isSlick
    }
}
