package Level_1_Exercise_6;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Object> elements = new ArrayList<>();
        elements.add("Hello");
        elements.add("goodbye");
        elements.add(3.141516);
        elements.add(23);
        elements.add("One");
        elements.add("Two");

        List<String> SortedStrings = elements.stream()
                .filter(element -> element instanceof String)
                .map(element -> (String) element)
                .sorted(Comparator.comparingInt(String::length))
                .collect(Collectors.toList());

        System.out.println("Chains ordered by length: " + SortedStrings);
    }
}
