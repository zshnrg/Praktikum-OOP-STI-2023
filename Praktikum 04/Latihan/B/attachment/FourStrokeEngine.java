public class FourStrokeEngine implements Engine {
    private int engineCapacity;

    public FourStrokeEngine(int engineCapacity) {
        this.engineCapacity = engineCapacity;
        // Konstruktor
    }

    @Override
    public int getEngineCapacity() {
        return engineCapacity;
        // Kembalikan kapasitas mesin
    }

    @Override
    public String sound() {
        return "brumbrum";
        // Kembalikan "brumbrum"
    }
}
