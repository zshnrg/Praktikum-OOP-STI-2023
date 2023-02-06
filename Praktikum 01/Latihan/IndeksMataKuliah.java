/**
 * IndeksMataKuliah.java
 * Kelas IndeksMataKuliah merupakan sebuah kelas yang memodelkan seorang mahasiswa ITB.
 * 
 * @author 18221121 Rozan Ghosani
 */

public class IndeksMataKuliah {
    // Deklarasi atribut
    private MataKuliah mataKuliah;
    private String nama;
    private String indeks;
    private Double nilai;
    private static int countMhs = 0;

    /**
     * Konstruktor
     * 
     * @param mk
     * @param nama
     * @param nilai
     *                   indeks ditentukan berdasarkan nilai yang diperoleh dengan
     *                   ketentuan sebagai berikut
     *                   A -> nilai = 4
     *                   B -> 3.0 <= nilai < 4.0
     *                   C -> 2.0 <= nilai < 3.0
     *                   D -> 1.0 <= nilai < 2.0
     *                   E -> 0.0 <= nilai < 1.0
     *                   Apabila nilai tidak valid, maka indeks dianggap E dan nilai
     *                   dianggap 0
     */
    public IndeksMataKuliah(MataKuliah mk, String nm, Double nilai) {
		mataKuliah = mk;
		nama = nm;
		if (nilai > 0 && nilai < 1) {
			this.indeks = "E";
			this.nilai = nilai;
		}
		else if (nilai > 0 &&  nilai < 2) {
			this.indeks = "D";
			this.nilai = nilai;
		}
		else if (nilai > 0 &&  nilai < 3) {
			this.indeks = "C";
			this.nilai = nilai;
		}
		else if (nilai > 0 &&  nilai < 4) {
			this.indeks = "B";
			this.nilai = nilai;
		}else if (nilai > 0 &&  nilai == 4) {
			this.indeks = "A";
			this.nilai = nilai;
		}
		else {
			indeks = "E";
			this.nilai = 0.0;
		}
    }

    /**
     * Getter mataKuliah
     * 
     * @return mataKuliah
     */
    public MataKuliah getMataKuliah() {
		return mataKuliah;
    }

    /**
     * Getter nama
     * 
     * @return nama
     */
    public String getNama() {
		return nama;
    }

    /**
     * Getter indeks
     * 
     * @return indeks
     */
    public String getIndeks() {
		return indeks;
    };

    /**
     * Getter nilai
     * 
     * @return nilai
     */
    public Double getNilai() {
		return nilai;
    }

    /**
     * Mengubah nilai mahasiswa
     * 
     * @param nilai nilai baru dari mahasiswa
     */
    public void ubahNilai(Double nilai) {
		this.updateIndeks(nilai);
    }

    /**
     * Update indeks
     * 
     */
    public void updateIndeks(Double nilai) {
		if (nilai > 0 && nilai < 1) {
			this.indeks = "E";
			this.nilai = nilai;
		}
		else if (nilai > 0 &&  nilai < 2) {
			this.indeks = "D";
			this.nilai = nilai;
		}
		else if (nilai > 0 &&  nilai < 3) {
			this.indeks = "C";
			this.nilai = nilai;
		}
		else if (nilai > 0 &&  nilai < 4) {
			this.indeks = "B";
			this.nilai = nilai;
		}else if (nilai > 0 &&  nilai == 4) {
			this.indeks = "A";
			this.nilai = nilai;
		}
		else {
			indeks = "E";
			this.nilai = 0.0;
		}
    }

    /**
     * Normalisasi nilai
     * 
     * @param countLulus jumlah mahasiswa yang lulus
     * Normalisasi nilai dilakukan dengan menambahkan nilai saat ini dengan 
     * persentase jumlah mahasiswa yang lulus
     * 
     * Apabila hasil normalisasi lebih dari 4.0, maka akan dianggap 4
     */
    public void normalisasiNilai(int countLulus) {
		this.nilai += this.nilai * countLulus / this.mataKuliah.getKapasitas();
		if (this.nilai > 4) this.nilai = 4.0;
    }

    /**
     * Menghitung kontribusi ke IP
     * Kontribusi ke IP dihitung dari jumlah sks dikali nilai dibagi total sks
     * 
     * @param sks total sks mahasiswa
     */
    public Double kontribusiIP(int sks) {
		return this.mataKuliah.getSks() * this.nilai / sks;
    }
}
