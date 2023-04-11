import java.util.*;

public class Main {
    public static List<String> findCommonElements(List<String> list1, List<String> list2) {
        TreeSet<String> word2 = new TreeSet<String>();

        for (String l2 : list2) {
            word2.add(l2);
        }

        TreeSet<String> result = new TreeSet<String>();
        List<String> res = new ArrayList<String>();

        for (String l1 : list1) {
            if (word2.contains(l1) && !result.contains(l1)) {
                result.add(l1);
                res.add(l1);
            }
        }

        return res;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] s1 = sc.nextLine().split(" ");
        String[] s2 = sc.nextLine().split(" ");

        List<String> list1 = new ArrayList<String>(Arrays.asList(s1));
        List<String> list2 = new ArrayList<String>(Arrays.asList(s2));

        List<String> res = findCommonElements(list1, list2);
        System.out.println(res);
    }
}