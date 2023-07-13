package kata;

public class Blah {

    public static void main(String[] args) {

//        Circle myCircle = new Circle(0, 0);
//
//        myCircle.moveCircle(myCircle, 23, 56);
//
//        Rectangle rectangle = new Rectangle();
//
//        System.out.println(rectangle.getHeight());
//        System.out.println(rectangle.getX());

        int hungryHippopotamus = 8;

        OUTER_LOOP: while (hungryHippopotamus > 0) {
            INNER_LOOP: do {
                hungryHippopotamus -= 2;
            } while (hungryHippopotamus > 5);
            hungryHippopotamus--;
            System.out.println(hungryHippopotamus + ", ");


        }

    }
}
