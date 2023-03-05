public class NumberSum {
    public Number[] numberSum(Number[] numArr) {
        Number[] ans = new Number[numArr.length];
        int idx = 0;

        for (int i = 0; i < numArr.length; i++) {
            // System.out.println(i);
            if (numArr[i] != null) {
                ans[idx] = numArr[i];
                // System.out.println(ans[idx]);
                for (int j = i + 1; j < numArr.length; j++) {
                    // System.out.println(ans[idx] + ", " + numArr[j]);
                    if (numArr[j] == null) continue;
                    if (numArr[i].getClass().equals(numArr[j].getClass())) {
                        if (numArr[j] instanceof Byte) {
                            ans[idx] = (Byte) ans[idx] + (Byte) numArr[j];
                        } else if (numArr[j] instanceof Integer) {
                            ans[idx] = (Integer) ans[idx] + (Integer) numArr[j];
                        } else if (numArr[j] instanceof Double) {
                            ans[idx] = (Double) ans[idx] + (Double) numArr[j];
                        } else if (numArr[j] instanceof Float) {
                            ans[idx] = (Float) ans[idx] + (Float) numArr[j];
                        } else if (numArr[j] instanceof Short) {
                            ans[idx] = (Short) ans[idx] + (Short) numArr[j];
                        } else if (numArr[j] instanceof Long) {
                            ans[idx] = (Long) ans[idx] + (Long) numArr[j];
                        }
                        numArr[j] = null;
                    }
                }
                idx++;
            }

            // System.out.println(ans[idx]);

        }

        return ans;
    }
}