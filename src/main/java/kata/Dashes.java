package kata;

public class Dashes {
    public static String insertDashes(int num) {
        String s = String.valueOf(num);
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i <= s.length() - 1; i++) {
            if (s.charAt(i) % 2 != 0) {
                sb.append(s.charAt(i));
                if (i == s.length() - 1) {
                    break;
                }
                if (s.charAt(i + 1) % 2 != 0) {
                    sb.append("-");
                }
            } else {
                sb.append(s.charAt(i));
            }
        }
        return sb.toString();
    }
}
