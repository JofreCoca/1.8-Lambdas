package Level_1_Exercise_2;

import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<String> list = List.of("one","two","three","four","five","six");
        List<String> stringsContainingTheLetterO = getStringsWithO(list);

        System.out.println("Result: " + stringsContainingTheLetterO);
    }
    public static List<String> getStringsWithO(List<String> stringsContainingTheLetterO) {
        return stringsContainingTheLetterO.stream()
                .filter(chain -> chain.toLowerCase().contains("o"))
                .collect(Collectors.toList());
    }
}