public class MultithreadArraySum {
    // nWorkers menyatakan jumlah maximum threads yang tersedia
    private int nWorkers;
    // array menyatakan array masukan
    private Integer[] array;
    private Thread[] threads;

    MultithreadArraySum(int nWorkers, Integer[] array) {
       // Inisialisasi attributes
       // Please provide your solution in the space below
        threads = new Thread[nWorkers];
        this.nWorkers = nWorkers;
        this.array = array;
    }

    public int calculateSum() throws InterruptedException {
        // calculateSum akan membuat thread dan memetakan array masukan secara rata ke semua threads yang dapat dibuat
        // Please provide your solution in the space below
        final int[] sum = {0};
        int load = array.length, start = 0, end;

        for (int i = 0; i < nWorkers; i++) {
            end = start + (int)(load / (nWorkers - i));
            
            // System.out.println(i + " | " + start + " | " + end + " - " + (end - start)); // for debuging
            final int finalStart = start; 
            final int finalEnd = end;
            threads[i] = new Thread(new Runnable() {
                public void run() {
                    sum[0] += findSum(finalStart, finalEnd);
                } 
            });
            threads[i].start();

            load -= end - start;
            start = end;
        }

        for (int i = 0; i < nWorkers; i++) {
            try {
                threads[i].join();
            } catch (Exception e) {}
        }
        return sum[0];
    }

    protected int findSum(int start, int end) {
       // findSum akan melakukan penjumlahan elemen-elemen array pada index `start` sampai `end-1`
       // Please provide your solution in the space below
        int sum = 0;
        for (int i = start; i < end; i++) {
            sum += array[i];
        }
        return sum;
    }
}