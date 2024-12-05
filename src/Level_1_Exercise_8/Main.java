package Level_1_Exercise_8;

public class Main {
    public static void main(String[] args) {
        ReverseString reverseFunction = input -> new StringBuilder(input).reverse().toString();

        String stringOriginal = "Hello world";
        String stringReverse = reverseFunction.reverse(stringOriginal);

        System.out.println("string Original: " + stringOriginal);
        System.out.println("String Reverse: " + stringReverse);
    }
}
