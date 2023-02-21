/**
 * Bus.java
 * Merupakan subclass dari Car
 * @author 18221121 Rozan Ghosani
 */
public class Bus extends Car {//Jangan lupa tambahkan kata kunci untuk melakukan polymorphism antar kelas
    private int passengerCapacity;
    private Boolean isUsedForLongTrip;

    public Bus(int numberOfWheels,int engineCapacity, int passengerCapacity, Boolean isUsedForLongTrip) {
		super(numberOfWheels, engineCapacity);
		this.passengerCapacity = passengerCapacity;
		this.isUsedForLongTrip = isUsedForLongTrip;
		
        //Konstruktor
        //passengerCapacity merupakan kapasitas penumpang
        //isUsedForLongTrip merupakan status apakah bis dapat digunakan untuk perjalanan jauh
    }

    public int getPassengerCapacity(){
		return passengerCapacity;
        //Mengembalikan nilai dari kapasitas penumpang
    }

    public Boolean getLongTripStatus(){
		return isUsedForLongTrip;
        //Mengembalikan status dari bis apakah dapat digunakan untuk perjalanan jauh
    }    
    public String sound(){
		return "Cesss";
        //Mengembalikan string berisi "Cesss"
    }

    public String honk(){
		return "Notnot";
        //Mengembalikan string berisi "Notnot"
    }

    public String printDescription(){
		if (isUsedForLongTrip) {
			return "Mobil ini memiliki " + getNumberOfWheels() + " roda dengan kapasitas mesin " + getEngineCapacity() + " cc, memiliki kapasitas penumpang " + getPassengerCapacity() + " orang, dan digunakan untuk perjalanan jauh";
		} else {
			return "Mobil ini memiliki " + getNumberOfWheels() + " roda dengan kapasitas mesin " + getEngineCapacity() + " cc, memiliki kapasitas penumpang " + getPassengerCapacity() + " orang, dan tidak digunakan untuk perjalanan jauh";
		}
        //Mengembalikan string yang berformat dan berkondisi
        //Apabila isUsedForLongTrip true, maka mengembalikan: "Mobil ini memiliki a roda dengan kapasitas mesin b cc, memiliki kapasitas penumpang c orang, dan digunakan untuk perjalanan jauh", dimana a adalah numberOfWheels, b adalah engineCapacity dan c adalah passengerCapacity
        //Apabila isUsedForLongTrip false, maka mengembalikan: "Mobil ini memiliki a roda dengan kapasitas mesin b cc, memiliki kapasitas penumpang c orang, dan tidak digunakan untuk perjalanan jauh", dimana a adalah numberOfWheels, b adalah engineCapacity dan c adalah passengerCapacity
    }
}
