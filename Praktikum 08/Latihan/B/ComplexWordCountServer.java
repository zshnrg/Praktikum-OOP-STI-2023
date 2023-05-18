import java.util.ArrayList;

public class ComplexWordCountServer {

    private int nWorkers;
    private Thread[] threads;

    // masukkan arraylist of string dipastikan berupa alfabet lowercase saja
    private ArrayList<String> array;

    // hasil pada method countSpecialString akan disimpan pada res
    int[] res = new int[26];

    public ComplexWordCountServer(int nWorkers, ArrayList<String> array) {
        // Inisialisasi attributes
        threads = new Thread[nWorkers];
        this.nWorkers = nWorkers;
        this.array = array;
    }

    public void countSpecialString() throws InterruptedException {
        // calculateSum akan membuat thread untuk setiap string
        // setiap thread kemudian akan memanggil metode characterCountHelper
        // lalu hasil dari Array Mapping yang dikembalikan oleh metode characterCountHelper akan digunakan
        // untuk ditambahkan ke attribut res
        for (int i = array.size(); i > 0; i -= nWorkers) {
            for (int j = 0; j < nWorkers; j++) {
                int loc = array.size() - i + j;
                threads[j] = new Thread(new Runnable() {
                    public void run() {
                        try {
                            int[] charFreq = characterCountHelper(array.get(loc));
                            for (int k = 0; k < 26; k++) {
                                res[k] += charFreq[k];
                            }
                        } catch (Exception e) {}
                    }
                });
                threads[j].start();
            }

            for (int j = 0; j < nWorkers; j++) {
                try {
                    threads[j].join();
                } catch (Exception e) {}
            }
        }
    }

    protected int[] characterCountHelper(String str) {
        // Menghitung berapa banyak occurence dari suatu karakter pada suatu string
        // lalu dipetakan pada suatu array of integer

        // HINT : untuk memetakan suatu karakter ke array of integer, anda bisa melakukan arr[c-'a']
        // sehingga apabila variable c merupakan karakter 'a', value dari c-'a' menjadi 0, begitupun
        // dengan karakter alfabet lainnya
        int[] freq = new int[26];
        for (int i = 0; i < str.length(); i++) freq[str.charAt(i) - 'a']++;
        return freq;
    }

    public String toString() {
        int one = 0, two = 0, three = 0;
        while (res['o' - 'a'] >= 1 && res['n' - 'a'] >= 1 && res['e' - 'a'] >= 1) {
            res['o' - 'a']--;
            res['n' - 'a']--;
            res['e' - 'a']--;
            one++;
        }
        while (res['t' - 'a'] >= 1 && res['w' - 'a'] >= 1 && res['o' - 'a'] >= 1) {
            res['t' - 'a']--;
            res['w' - 'a']--;
            res['o' - 'a']--;
            two++;
        }
        while (res['t' - 'a'] >= 1 && res['h' - 'a'] >= 1 && res['r' - 'a'] >= 1 && res['e' - 'a'] >= 2) {
            res['t' - 'a']--;
            res['h' - 'a']--;
            res['r' - 'a']--;
            res['e' - 'a'] -= 2;
            three++;
        }

        return "one : " + one + ", two : " + two + ", three : " + three; 
        // menampilkan berapa banyak kata spesial "one", "two" dan "three"
        // format keluaran dari fungsi ini adalah "one : {one_occurence}, two : {two_occurence}, three : {three_occurence}"
        // lalu diakhiri dengan newline
    }
}