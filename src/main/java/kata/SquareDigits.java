package kata;

public class SquareDigits {
    public static int toSquare(int digit) {
        String digitString = Integer.toString(digit);
        String[] digitArray = digitString.split("");
        String result = "";

        for (String s : digitArray) {
            Integer integer = Integer.parseInt(s);
            int i1 = integer * integer;
            result += i1;

        }

        return Integer.parseInt(result);
    }
}
