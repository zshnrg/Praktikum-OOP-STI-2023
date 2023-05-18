/**
 * @author 18221121 Rozan Ghosani
 */
public class DelayedCharacterPrinting extends Thread {
    String str;
    int delay;
    
    public DelayedCharacterPrinting(int delay, String str) {
        this.str = str;
        this.delay = delay;
    }

    public void run() {
        try {
            for (int i = 0; i < str.length(); i++) {
                Thread.sleep(delay);
                System.out.println(str.charAt(i));
            }
        } catch (Exception e) {}
    }

    public static void printDelayed(int delay, String str) {
        new DelayedCharacterPrinting(delay, str).start();
    }
}