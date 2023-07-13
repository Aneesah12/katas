package kata;

public class MyPattern {
    public static String pattern(int n) {

        String result = "";


        if (n > 0) {
            for (int i = 1; i <= n; i++) {
                for (int j = i; j <= n; j++) {
                    result += j;
                }
                if (i != n) {
                    result += "\n";
                }
            }
        }

        return result;
    }
}
