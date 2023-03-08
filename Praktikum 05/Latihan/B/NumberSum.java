public class NumberSum {
    public Number[] numberSum(Number[] numArr) {
        Number[] ans = new Number[numArr.length];
        int idx = 0;

        for (int i = 0; i < numArr.length; i++) {
            if (numArr[i] != null) {
                ans[idx] = numArr[i];
                for (int j = i + 1; j < numArr.length; j++) {
                    if (numArr[j] == null) continue;
                    if (numArr[i].getClass().equals(numArr[j].getClass())) {
                        if (numArr[j] instanceof Byte) {
                            ans[idx] = (byte) (ans[idx].byteValue() + numArr[j].byteValue());
                        } else if (numArr[j] instanceof Integer) {
                            ans[idx] = (int) (ans[idx].intValue() + numArr[j].intValue());
                        } else if (numArr[j] instanceof Double) {
                            ans[idx] = (double) (ans[idx].doubleValue() + numArr[j].doubleValue());
                        } else if (numArr[j] instanceof Float) {
                            ans[idx] = (float) (ans[idx].floatValue() + numArr[j].floatValue());
                        } else if (numArr[j] instanceof Short) {
                            ans[idx] = (short) (ans[idx].shortValue() + numArr[j].shortValue());
                        } else if (numArr[j] instanceof Long) {
                            ans[idx] = (long) (ans[idx].longValue()+ numArr[j].longValue());
                        } 
                        numArr[j] = null;
                    }
                }
                idx++;
            }
        }
        return ans;
    }
}