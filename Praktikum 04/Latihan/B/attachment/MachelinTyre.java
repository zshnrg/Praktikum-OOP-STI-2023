public class MachelinTyre implements Tyre {
    private int pressure;

    public MachelinTyre(int pressure) {
        this.pressure = pressure;
        // Konstruktor
    }

    @Override
    public String getTyreName() {
        return "Machelin";
        // Kembalikan Machelin
    }

    @Override
    public int getTyrePressure() {
        return pressure;
        // Kembalikan nilai pressure
    }

    @Override
    public int getTyreWidth() {
        return 200;
        // Kembalikan 200
    }
}
