package methodReferences.instanceMethodsParameter;


public class ParameterCheck {
    public static void main(String[] args) {
        LowerCaseString methodRef1 = String::toLowerCase;
        TwoStringParameterCheck methodRef2 = String::startsWith;
        String textToTest = "Hello";

        String modifiedText = methodRef1.modifyString(textToTest);
        boolean check = methodRef2.check(textToTest, "h");
        System.out.println(modifiedText);
        System.out.println(check);

    }
}
