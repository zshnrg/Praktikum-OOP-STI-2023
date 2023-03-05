public class DonlupTyre implements Tyre {
    private int pressure;
    private int width;

    public DonlupTyre(int pressure, int width) {
        this.pressure = pressure;
        this.width = width;
        // Konstruktor
    }

    @Override
    public String getTyreName() {
        return "Donlup";
        // Kembalikan "Donlup"
    }

    @Override
    public int getTyrePressure() {
        return pressure;
        // Kembalikan nilai pressure
    }

    @Override
    public int getTyreWidth() {
        return width;
        // Kembalikan nilai width
    }
}
