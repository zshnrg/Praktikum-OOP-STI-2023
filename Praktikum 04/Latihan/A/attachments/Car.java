/**
 * Car.java
 * Merupakan parent class
 * @author 18221121 Rozan Ghosani
 */
public class Car {
    private int numberOfWheels;
    private Engine engine;
    private Tyre tyre;

    public Car(int numberOfWheels, Engine engine, Tyre tyre) {
        this.numberOfWheels = numberOfWheels;
        this.engine = engine;
        this.tyre = tyre;
    }
  
    public int getNumberOfWheels() {
		return numberOfWheels;
        // Kembalikan number of wheels
    }

    public void setEngine(Engine engine) {
		this.engine = engine;
        // Mengeset mesin mobil
    }

    public void setTyre(Tyre tyre) {
        this.tyre = tyre;
        // Mengeset ban mobil
    }

    public Engine getEngine() {
        return engine;
        // Kembalikan engine
    }

    public Tyre getTyre() {
		return tyre;
        // Kembalikan tyre
    }
    
    public String sound(){
		return engine.sound();
        // Kembalikan sound dari engine
    }

    public Boolean isRacingCar() {
		return tyre.isSlickTyre();
        // Apabila isSlickTyre true maka true
        // else false
    }

    public String printDescription(){
		if (isRacingCar()) {
			return "Mobil balap ini memiliki " + numberOfWheels + " roda dengan kapasitas mesin " + engine.getEngineCapacity() + " cc";
		} else {
			return "Mobil ini memiliki " + numberOfWheels + " roda dengan kapasitas mesin " + engine.getEngineCapacity() + " cc";
		}
        // Apabila isRacingCar true kembalikan "Mobil balap ini memiliki a roda dengan kapasitas mesin x cc" dengan a numberOfWheels dan x engineCapacity
        // else kembalikan "Mobil ini memiliki a roda dengan kapasitas mesin x cc"
    }
}

