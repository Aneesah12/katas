package methodReferences.constructor;

public class StringCreator {
    public static void main(String[] args) {
        EmptyStringCreator methodRef = String::new;

        String myString = methodRef.create();

        System.out.println("My String =" + myString + "*");
    }
}
