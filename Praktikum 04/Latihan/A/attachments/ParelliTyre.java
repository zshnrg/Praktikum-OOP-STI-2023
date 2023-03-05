public class ParelliTyre implements Tyre {
    private int pressure;
    private int width;

    public ParelliTyre(int pressure, int width) {
        this.pressure = pressure;
        this.width = width;
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
        return true;
    }
}
