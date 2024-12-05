package Level_1_Exercise_5;

public class Main {
    public static void main(String[] args) {
        PiProvider piProvider = () -> 3.1415;
        System.out.println("The PI value is: " + piProvider.getPiValue());
    }
}
