package topCoderAlgos;
/**
 * This program generates topCoderAlgos.Fibonacii series till
 * the target number
 */

import java.util.ArrayList;

public class Fibonacii {
    private ArrayList<Integer> fibSeries;

    public ArrayList<Integer> generateFibonacii(int number) {
        fibSeries = new ArrayList<>();
        int leftNum = 0;
        int rightNum = 1;

        for (int num = 0; num <= number; num++) {
            fibSeries.add(leftNum);
            leftNum = leftNum + rightNum;
            rightNum = leftNum - rightNum;
        }
        return fibSeries;
    }
}
