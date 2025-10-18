package calculator;

import java.util.List;

public class StringSplitter {
    private static final String CUSTOM_DELIMITER_SUFFIX = "\\n";

    public List<String> splitByDelimiter(String input) {
        return List.of((input.split("[,:]")));
    }

    public List<String> splitByCustomDelimiter(String customDelimiter, String input) {
        input = input.substring(input.indexOf(CUSTOM_DELIMITER_SUFFIX) + CUSTOM_DELIMITER_SUFFIX.length());
        return List.of(input.split(customDelimiter));
    }
}