import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String scan = sc.nextLine();

        if (scan.isEmpty()) {
            System.out.println("[]");
            return;
        }

        String[] input = scan.split("\\s+");
        
        Set<Integer> set = new HashSet<Integer>();
        for (String in : input) {
            set.add(Integer.parseInt(in));
        }

        List<Integer> list = new ArrayList<Integer>(set);
        Collections.sort(list);;
        
        System.out.println(list);

        sc.close();
    }
}