/**
 * @author 18221121 Rozan Ghosani
 */
public class SimpleWordCountServer extends Thread{
    private int nWorker;
    private Thread[] threads;

    public SimpleWordCountServer(int nWorker) {
        threads = new Thread[nWorker];
        this.nWorker = nWorker;
    }

    public Integer[] processRequests(String[] requests) {
        Integer[] count = new Integer[requests.length];

        for (int i = 0; i <= requests.length / nWorker; i++) {
            for (int j = 0; j < nWorker; j++) {
                int loc = i * nWorker + j;
                threads[j] = new Thread(new Runnable() {
                    public void run() {
                        try{
                            count[loc] = countWords(requests[loc]);
                        } catch (Exception e) {}
                    }
                });
                threads[j].start();
            }

            for (int j = 0; j < nWorker; j++) {
                try {
                    threads[j].join();
                } catch (Exception e) {}
            }
        }

        return count;
    }

    protected int countWords(String request) {
        String[] word = request.trim().split("\\s+");
        return word.length;
    }
}