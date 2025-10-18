package calculator;

import java.util.List;

public class InputProcessor {
    public List<String> process(boolean isCustom, String input) {
        if (isCustom) {
            return processCustomDelimiter(input);
        } else {
            return processDefaultDelimiter(input);
        }
    }

    private List<String> processCustomDelimiter(String input) {
        DelimiterParser delimiterParser = new DelimiterParser();
        String customDelimiter = delimiterParser.parseDelimiter(input);

        StringSplitter splitter = new StringSplitter();
        return splitter.splitByCustomDelimiter(customDelimiter, input);
    }

    private List<String> processDefaultDelimiter(String input) {
        StringSplitter splitter = new StringSplitter();
        return splitter.splitByDelimiter(input);
    }
}