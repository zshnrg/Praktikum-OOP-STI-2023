/* Untuk mengaktifkan assertion, jalankan driver dengan flag -ea
   Contoh:
   $ javac MultithreadArraySum.java MultithreadArraySumDriver.java
   $ java -ea MultithreadArraySumDriver
 */
public class MultithreadArraySumDriver {
    public static void main(String[] args) throws InterruptedException {
       int nWorkers = 4;
       Integer[] arr = {1, 2, 3, 4, 5, 12, 2323, 32, 532, 12};

       MultithreadArraySum arraySum = new MultithreadArraySum(nWorkers, arr);

       int expectedArraySum = 0;
         for (int i = 0; i < arr.length; i++) {
            expectedArraySum += arr[i];
         }
       int actualArraySum = arraySum.calculateSum();

       System.out.println(expectedArraySum + " " + actualArraySum);
    }
}