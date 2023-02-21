public class V6Engine implements Engine {
    private int engineCapacity;
    private Boolean isTurbo;

    public V6Engine(int engineCapacity, Boolean isTurbo) {
        this.engineCapacity = engineCapacity;
        this.isTurbo = isTurbo;
    }

    @Override
    public int getEngineCapacity() {
		if (isTurbo) {
			return engineCapacity + 200;
		} else {
			return engineCapacity;
		}
        // Apabila isTurbo true, engineCapacity + 200
        // else kembalikan engineCapacity
    }

    @Override
    public String sound() {
		return "vroomvroom";
        // Kembalikan vroomvroom
    }
}
