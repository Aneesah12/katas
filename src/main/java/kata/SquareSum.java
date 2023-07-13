package kata;

import java.util.Arrays;

public class SquareSum {
    public static int squareIt(int[] ints) {
//        int lastInt = 0;
//
//        for (int i = 0; i < ints.length; i++) {
//            lastInt += ints[i] * ints[i];
////            lastInt = lastInt + sumInt;
//        }
//        return lastInt;
        return Arrays.stream(ints).map(x -> x * x).sum();
    }
}
