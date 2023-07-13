package kata;

import java.util.ArrayList;
import java.util.List;

public class LineNumbering {
    public static List<String> number(List<String> lines) {
//        lines.stream().map(l -> l.concat("blah: ")).collect(Collectors.toList())

        List<String> myUpdatedList = new ArrayList<>();

        for (int i = 0; i < lines.size(); i++) {
            myUpdatedList.add(i + 1 + ": " + lines.get(i));
        }

        return myUpdatedList;
    }
}
