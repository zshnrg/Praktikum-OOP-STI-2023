/**
 * @author 18221121 Rozan Ghosani
 */
public class DelayedCounting extends Thread {
    private int delayMillisec;
    private int maxCount;

    public DelayedCounting(int delayMillisec, int maxCount) {
        this.delayMillisec = delayMillisec;
        this.maxCount = maxCount;
    }

    public void run() {
        try {
            for (int i = 1; i <= maxCount; i++) {
                Thread.sleep(delayMillisec);
                System.out.println(i);
            }
        } catch (Exception e) {
        }
    }

    public static void printDelayed(int delayMillisec, int maxCount) {
        new DelayedCounting(delayMillisec, maxCount).start();
    }
}