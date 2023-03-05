/**
 * Motor.java
 * Merupakan parent class
 * @author 18221121 Rozan Ghosani
 */
public class Motor {
    private int numberOfWheels;
    private Engine engine;
    private Tyre tyre;
  
    public Motor(int numberOfWheels, Engine engine, Tyre tyre) {
        this.numberOfWheels = numberOfWheels;
        this.engine = engine;
        this.tyre = tyre;
        // Konstruktor
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
        // Mengeset mesin motor
    }

    public void setTyre(Tyre tyre) {
        this.tyre = tyre;
        // Mengeset ban motor
    }

    public Engine getEngine() {
        return engine;
        // Mengembalikan mesin
    }

    public Tyre getTyre() {
        return tyre;
        // Mengembalikan ban
    }
    
    public String sound(){
        return engine.sound();
        //Mengembalikan string berisi suara mesin
    }

    public void printDescription() {
        System.out.println("Motor ini memiliki " + numberOfWheels + " roda dengan kapasitas mesin " + engine.getEngineCapacity() + " cc");
        //Mengembalikan string berformat "Motor ini memiliki a roda dengan kapasitas mesin b cc", dimana a adalah numberOfWheels dan b adalah engineCapacity
    }
}