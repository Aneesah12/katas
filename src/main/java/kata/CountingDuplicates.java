package kata;

import java.util.Arrays;

public class CountingDuplicates {
    public static int numberOfDuplicates(String text) {

        char[] textCharArray = text.toLowerCase().toCharArray();
        Arrays.sort(textCharArray);

        String sortedText = new String(textCharArray);
        System.out.println(sortedText + "*****");

        int count = 1;
        int duplicateCount = 0;
        for (int i = 0; i < sortedText.length(); i++) {
            char first = sortedText.charAt(i);
            for (int j = i + 1; j < sortedText.length(); j++) {
                char second = sortedText.charAt(j);
                if (first == second) {
                    count++;
                }
            }
            if (count >= 2) {
                duplicateCount++;
                count = 0;
                sortedText = sortedText.replace(Character.toString(first), "");
            }
        }

        return duplicateCount;

    }
}

//    String textLowerCase = text.toLowerCase();
//    int count = 1;
//    int duplicateCount = 0;
//        for (int i = 0; i < textLowerCase.length(); i++) {
//        char first = textLowerCase.charAt(i);
//        for (int j = i + 1; j < textLowerCase.length(); j++) {
//        char second = textLowerCase.charAt(j);
//        if(first == second) {
//        count ++;
//        }
//        }
//        if(count > 2) {
//        duplicateCount++;
//        count = 0;
//        }
//        }
//        return duplicateCount;