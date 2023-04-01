public class Bank {
    String name;
    /**
     * Tambahkan atribut kelas disini
     */ 

    public Bank(String name) {
        this.name = name;
        /**
         * Konstruktor
         * Jangan lupa inisialisasi atribut kelas
         */ 
    }

    public void transfer(Account accountFrom, Account accountTo, int jumlah) throws Exception {
        if (accountFrom.getBankName().equals(name)) {
            if (accountFrom.getBankName().equals(accountTo.getBankName())) {
                accountFrom.decreaseSaldo(jumlah);
                accountTo.increaseSaldo(jumlah);
            } else {
                accountFrom.decreaseSaldo(jumlah + 2500);
                accountTo.increaseSaldo(jumlah);
            }
        } else {
            throw new Exception("Bukan akun milik bank " + name);
        }
        /**
         * Implementasi
         * Transfer antar bank (akun dengan nama bank berbeda) akan dikenakan biaya admin sebesar 
         * 2500 yang dikurangi dari saldo pengirim. 
         * 
         * Biaya admin ini tidak ikut ditransfer ke akun tujuan. 
         * 
         * Apabila accountFrom memiliki nama bank yang tidak sama dengan bank yang melakukan transfer, 
         * lempar exception dengan pesan "Bukan akun milik bank {bankName}".
         */ 
    }

    public Account createAccount(String accountName, int saldo) throws Exception {
        Account account = new Account(accountName, name, saldo);
        return account;
        /**
         * Implementasi
         * Akun yang dibuat akan memiliki atribut bankName dengan nama bank yang membuat akun. 
         * Method ini akan melanjutkan pelemparan exception dari kelas Account.
         */ 
    }
}