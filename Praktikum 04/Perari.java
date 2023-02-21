/**
 * Perari.java
 * [Jelaskan kegunaan class ini]
 * @author 18221121 Rozan Ghosani
 */
public class Perari extends Car {//Jangan lupa tambahkan kata kunci untuk melakukan polymorphism antar kelas
    private int averageSpeed;
    private Boolean isInsuranced;

    public Perari(int numberOfWheels,int engineCapacity, int averageSpeed, Boolean isInsuranced) {
		super(numberOfWheels, engineCapacity);
		this.averageSpeed = averageSpeed;
		this.isInsuranced = isInsuranced;
        //Konstruktor
        //averageSpeed merupakan nilai kecepatan rata-rata dari perari dalam satuan km/h
        //isInsuranced merupakan status apakah perari didaftarkan asuransi atau tidak
    }

    public int getAverageSpeed(){
		return averageSpeed;
        //Mengembalikan nilai dari kecepatan rata-rata perari
    }

    public Boolean getInsuranceStatus(){
		return isInsuranced;
        //Mengembalikan status asuransi dari perari
    }    
    public String sound(){
		return "Brmmm";
        //Mengembalikan string berisi "Brmmm"
    }

    public String honk(){
		return "Siuuu";
        //Mengemabilakn string berisi "Siuuu"
    }

    public String printDescription(){
		if (isInsuranced) {
			return "Mobil ini memiliki " + getNumberOfWheels() + " roda dengan kapasitas mesin " + getEngineCapacity() + " cc, memiliki kecepatan rata-rata " + getAverageSpeed() + " km/h, dan sedang dalam perlindungan asuransi";
		} else {
			return "Mobil ini memiliki " + getNumberOfWheels() + " roda dengan kapasitas mesin " + getEngineCapacity() + " cc, memiliki kecepatan rata-rata " + getAverageSpeed() + " km/h, dan sedang tidak dalam perlindungan asuransi";
		}
        //Mengembalikan string yang berformat dan berkondisi
        //Apabila isInsurance true, maka mengembalikan: "Mobil ini memiliki a roda dengan kapasitas mesin b cc, memiliki kecepatan rata-rata c km/h, dan sedang dalam perlindungan asuransi", dimana a adalah numberOfWheels, b adalah engineCapacity dan c adalah averageSpeed
        //Apabila isInsurance false, maka mengembalikan: "Mobil ini memiliki a roda dengan kapasitas mesin b cc, memiliki kecepatan rata-rata c km/h, dan sedang tidak dalam perlindungan asuransi", dimana a adalah numberOfWheels, b adalah engineCapacity dan c adalah averageSpeed
    }
}


