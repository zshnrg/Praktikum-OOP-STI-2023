import java.util.Deque;
import java.util.ArrayDeque;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Deque<Integer> deque = new ArrayDeque<Integer>();
        boolean isReverse = false;

        int q = sc.nextInt();
        sc.nextLine();
        while (--q >= 0) {
            String op = sc.next();
            int x;
            switch (op) {
                case "addFirst":
                    x = sc.nextInt();
                    if (!isReverse) deque.addFirst(x);
                    else deque.addLast(x);
                    break;
                case "addLast":
                    x = sc.nextInt();
                    if (!isReverse) deque.addLast(x);
                    else deque.addFirst(x);
                    break;
                case "pollFirst":
                    if (deque.isEmpty()) {
                        System.out.println("EMPTY");
                    } else {
                        if (!isReverse) System.out.println(deque.pollFirst());
                        else System.out.println(deque.pollLast());
                    }
                    break;
                case "pollLast":
                    if (deque.isEmpty()) {
                        System.out.println("EMPTY");
                    } else {
                        if (!isReverse) System.out.println(deque.pollLast());
                        else System.out.println(deque.pollFirst());
                    }
                    break;
                case "reverse":
                    isReverse = !isReverse;
                    break;
            }
        }

        sc.close();
    }
}