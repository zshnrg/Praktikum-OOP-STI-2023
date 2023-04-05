import java.util.ArrayList;

public class MultithreadArray2DSum {

    private int nWorkers;
    private ArrayList<Integer[]> array;
    private Thread[] threads;

    public MultithreadArray2DSum(int nWorkers, ArrayList<Integer[]> array) {
        // Inisialisasi attributes
        threads = new Thread[nWorkers];
        this.nWorkers = nWorkers;
        this.array = array;
    }

    public int calculateSum2() throws InterruptedException {
        // calculateSum2 akan membuat thread dan memetakan array 2 dimensi masukan secara rata ke semua threads yang dapat dibuat
        // setiap thread akan menghitung jumlah dari setiap baris array
        // gunakan fungsi findSum pada kelas MultithreadArraySum untuk menghitung setiap baris array
        final int[] sum = {0};

        for (int i = 0; i < array.size() / nWorkers; i++) {
            for (int j = 0; j < nWorkers; j++) {
                int loc = i * nWorkers + j;
                threads[j] = new Thread(new Runnable() {
                    public void run() {
                        try {
                            MultithreadArraySum arraySum = new MultithreadArraySum(nWorkers, array.get(loc));
                            sum[0] += findSum(arraySum);
                        } catch (Exception e) {}
                    }
                });
            }

            for (int j = 0; j < nWorkers; j++) {
                try {
                    threads[j].join();
                } catch (Exception e) {}
            }
        }
        return sum[0];
    }

    protected int findSum(MultithreadArraySum arraySum) throws InterruptedException {
        // findSum menerima parameter arraySum berupa kelas MultithreadArraySum yang diinisiasi
        // setiap baris pada array 2 Dimensi untuk menghitung total penjumlahan setiap baris
        return arraySum.calculateSum();
    }
}