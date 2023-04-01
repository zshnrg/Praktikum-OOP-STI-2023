/**
 * Jangan lupa tambahkan kata kunci untuk menghandle exception
 */ 
public class Robot extends Exception {
    private int x;
    private int y;
    /**
     * Tambahkan atribut kelas disini
     */ 

    public Robot() {
        /**
         * Konstruktor
         * Jangan lupa inisialisasi atribut kelas
         */ 
    }

    public void walk(int x, int y) throws Exception {
        if (this.x + x > 10 || this.y + y > 10) {
            throw new Exception("Tidak bisa jalan");
        } else {
            this.x += x;
            this.y += y;
            System.out.println("Sedang berjalan menuju (" + this.x + ", " + this.y + ")");
        }
        /**
         * Implementasi
         * Apabila hasil penambahan x atau y melebihi 10, dilempar sebuah exception
         * dengan pesan "Tidak bisa jalan". Atribut tidak ditambahkan pada kasus ini.
         * 
         * Apabila input valid, tambahkan nilai atribut dan print pesan
         * "Sedang berjalan menuju (x, y)"
         */ 
    }

    public void talk(String language) throws Exception {
        if (!language.equals("Indonesia") && !language.equals("Inggris")) {
            throw new Exception("Tidak bisa berbicara dalam bahasa " + language);
        } else {
            System.out.println("Sedang berbicara dalam bahasa " + language);
        }
        /**
         * Implementasi
         * Apabila input bukan "Indonesia" atau "Inggris", lempar exception dengan pesan
         * "Tidak bisa berbicara dalam bahasa {language}"
         * 
         * Apabila input valid, print pesan "Sedang berbicara dalam bahasa {language}"
         */ 
    }

    public void receiveCommand(String command) throws Exception {
        if (!command.equals("walk") && !command.equals("talk")) {
            throw new Exception("Perintah " + command + " tidak dikenal");
        }
        /**
         * Implementasi
         * Apabila input bukan "walk" atau "talk", lempar exception "Perintah {command} tidak dikenal"
         */ 
    }
}