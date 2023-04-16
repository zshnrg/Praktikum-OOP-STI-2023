import java.util.Deque;
import java.util.ArrayDeque;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Deque<Integer> deque = new ArrayDeque<Integer>();

        int q = sc.nextInt();
        sc.nextLine();
        while (--q >= 0) {
            String[] op = sc.nextLine().split(" ");
            switch (op[0]) {
                case "addFirst":
                    deque.addFirst(Integer.parseInt(op[1]));
                    break;
                case "addLast":
                    deque.addLast(Integer.parseInt(op[1]));
                    break;
                case "pollFirst":
                    if (deque.isEmpty()) {
                        System.out.println("EMPTY");
                    } else {
                        System.out.println(deque.pollFirst());
                    }
                    break;
                case "pollLast":
                    if (deque.isEmpty()) {
                        System.out.println("EMPTY");
                    } else {
                        System.out.println(deque.pollLast());
                    }
                    break;
                case "reverse":
                    Deque<Integer> temp = new ArrayDeque<Integer>();
                    while (!deque.isEmpty()) {
                        temp.addFirst(deque.pollFirst());
                    }
                    deque = temp;
                    break;
            }
        }

        sc.close();
    }
}