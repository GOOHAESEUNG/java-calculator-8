package calculator;

import java.util.ArrayList;
import java.util.List;

public class StringSplitter {
    public List<String> splitByDelimiter(String input) {
        input = trimInput(input);
        List<String> inputList = new ArrayList<>();

        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == ',' || input.charAt(i) == ';') {
                inputList.add(String.valueOf(input.charAt(i - 1)));
                inputList.add(String.valueOf(input.charAt(i + 1)));
            }
        }

        System.out.println(inputList);
        return inputList;
    }

    public List<String> splitByCustomDelimiter(String customDelimiter, String input) {
        input = trimInput(input);
        return List.of(input.split(customDelimiter));
    }

    private String trimInput(String input) {
        return input.trim();
    }
}