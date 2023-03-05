public class TwoStrokeEngine implements Engine {
    private int engineCapacity;

    public TwoStrokeEngine(int engineCapacity) {
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
        return "taktaktak";
        // Kembalikan "taktaktak"
    }
}
