package kata;

public class FruitGuy {
    public static String[] removeRotten(String[] fruitBasket) {

        StringBuilder fruit = new StringBuilder();

        if(fruitBasket != null) {
            for (String rf : fruitBasket) {
                if (rf.contains("rotten")) {
                    fruit.append(rf.substring(6).toLowerCase()).append(" ");
                } else {
                    fruit.append(rf).append(" ");
                }
            }
        }


        return fruit.length() > 1 ? fruit.toString().split(" ") : new String[0];
    }
}
