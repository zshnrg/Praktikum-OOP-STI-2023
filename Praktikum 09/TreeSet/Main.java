import java.util.TreeSet;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        TreeSet<Integer> treeSet = new TreeSet<Integer>();
        Scanner sc = new Scanner(System.in);

        int Q = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < Q; i++) {
            String op = sc.nextLine();

            String[] command = op.split(" ");
            switch (command[0]) {
                case "add":
                    treeSet.add(Integer.valueOf(command[1]));    
                    break;
                case "remove":
                    if (treeSet.contains(   )) {
                        treeSet.remove(Integer.valueOf(command[1]));
                    } else {
                        System.out.println("Element " + command[1] + " is not in The TreeSet");
                    }
                    break;
                case "first":
                    if (treeSet.isEmpty()) {
                        System.out.println("EMPTY");
                    } else {
                        System.out.println(treeSet.first());
                    }
                    break;
                case "last":
                    if (treeSet.isEmpty()) {
                        System.out.println("EMPTY");
                    } else {
                        System.out.println(treeSet.last());
                    }
                    break;
                default:
                    break;
            }
        }

        sc.close();
    }
}