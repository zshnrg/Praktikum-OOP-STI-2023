import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] input = sc.nextLine().split("\\s+");
        
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