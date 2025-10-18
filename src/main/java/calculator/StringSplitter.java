package calculator;

import java.util.List;

public class StringSplitter {
    public List<String> splitByDelimiter(String input) {
        input = trimInput(input);
        return List.of((input.split("[,:]")));
    }

    public List<String> splitByCustomDelimiter(String customDelimiter, String input) {
        input = trimInput(input);
        return List.of(input.split(customDelimiter));
    }

    private String trimInput(String input) {
        return input.trim();
    }
}