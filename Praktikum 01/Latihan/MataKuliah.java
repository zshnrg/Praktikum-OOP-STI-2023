public class MataKuliah {
	private String kode;
	private String nama;
	private int sks;
	private String dosen;
	private int kapasitas;
	private static int jumlahMataKuliah = 0;
	
	public MataKuliah(String k, String n, int s, String d, int c) {
		kode = k;
		nama = n;
		sks = s;
		dosen = d;
		kapasitas = c;
		jumlahMataKuliah++;
	}
	
	public String getKode() {
		return kode;
	}
	
	
	public String getNama() {
		return nama;
	}
	
	
	public int getSks() {
		return sks;
	}
	
	
	public String getDosen() {
		return dosen;
	}
	
	
	public int getKapasitas() {
		return kapasitas;
	}
	
	static int getJumlahMataKuliah() {
		return jumlahMataKuliah;
	}
	
	public void tambahKapasitas(int n) {
		this.kapasitas += n;
	}
}
