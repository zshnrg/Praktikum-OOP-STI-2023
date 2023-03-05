import java.util.ArrayList;

public class MinOp {
    private ArrayList<Integer> array = new ArrayList<Integer>();
    private int numOp = 0;

    public int minimumOperationsNeeded(Number[] arrNum) {
        // mengembalikan operasi minimum untuk mencapai array yang diinginkan
        for (Number n : arrNum) {
            array.add(n.intValue());
        }
        
        while (!allZero()) {
            while (searchOdd() != array.size()) {
                array.set(searchOdd(), array.get(searchOdd()) - 1);
                numOp++;
            }
            if (!allZero()) {
                for (int i = 0; i < array.size(); i++) {
                    array.set(i, array.get(i) / 2);
                }
                numOp++;
            }
        }

        return numOp;
    }

    private int searchOdd() {
        for (int i = 0; i < array.size(); i++) {
            if (array.get(i) % 2 == 1) return i;
        }
        return array.size();
    }

    private boolean allZero() {
        for (int i = 0; i < array.size(); i++) {
            if (array.get(i) != 0) return false;
        } return true;
    }
}
