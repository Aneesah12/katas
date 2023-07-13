package kata;

import java.util.Arrays;

public class FindParityOutlier {
    public static int parityOutlier(int[] arrayOfInts) {

        int[] intsOdd = Arrays.stream(arrayOfInts)
                .filter(value -> value % 2 != 0)
                .toArray();

        int[] intsEven = Arrays.stream(arrayOfInts)
                .filter(value -> value % 2 == 0)
                .toArray();

        return intsOdd.length == 1 ? intsOdd[0] : intsEven[0];
    }
}
