/**
 * Jangan lupa tambahkan kata kunci untuk menghandle exception
 */ 

 public class Account extends Exception {
    String name;
    String bankName;
    int saldo;
    /**
     * Tambahkan atribut kelas disini
     */ 


    public Account(String name, String bankName, int saldo) throws Exception {
        setName(name);
        this.bankName = bankName;
        this.saldo = saldo;

        if (saldo < 0) {
            throw new Exception("Tidak dapat membuat akun dengan saldo dibawah 0");
        }
        /**
         * Konstruktor
         * Jangan lupa inisialisasi atribut kelas
         */ 
    }

    public String getBankName() {
        return bankName;
        /**
         * Implementasi
         * Return bankName
         */ 
    }

    public String getName() {
        return name;
        /**
         * Implementasi
         * Return name
         */ 
    }
    
    public void setName(String name) throws Exception {
        this.name = name;
        if (name.length() < 3) {
            throw new Exception("Nama akun harus memiliki panjang minimal 3 karakter");
        }
        /**
         * Implementasi
         * Ubah name
         * 
         * Sebuah name memiliki ketentuan yaitu memiliki panjang minimal 3 karakter. 
         * Apabila tidak memenuhi ketentuan ini, 
         * akan dilempar sebuah exception dengan pesan "Nama akun harus memiliki panjang minimal 3 karakter".
         */ 
    }

    public int getSaldo() {
        return saldo;
        /**
         * Implementasi
         * Return saldo
         */ 
    }

    public void decreaseSaldo(int jumlah) throws Exception {
        if (saldo < jumlah) {
            throw new Exception("Saldo tidak mencukupi");
        } else if (jumlah < 0) {
            throw new Exception("Jumlah pengurangan tidak boleh minus");
        } else {
            saldo -= jumlah;
        }
        /**
         * Implementasi
         * Kurangi jumlah saldo
         * 
         * Apabila jumlah saldo tidak mencukupi untuk melakukan operasi, 
         * dilemparkan exception dengan pesan "Saldo tidak mencukupi". 
         * 
         * Apabila parameter jumlah kurang dari 0, 
         * lempar exception dengan pesan "Jumlah pengurangan tidak boleh minus".
         */ 
    }

    public void increaseSaldo(int jumlah) throws Exception {
        if (jumlah < 0) {
            throw new Exception("Jumlah penambahan tidak boleh minus");
        } else {
            saldo += jumlah;
        }
        /**
         * Implementasi
         * Tambahi saldo
         * 
         * Apabila parameter jumlah kurang dari 0, 
         * lempar exception dengan pesan "Jumlah penambahan tidak boleh minus".
         */ 
    }
}