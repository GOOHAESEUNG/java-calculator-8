package calculator;

public class InputProcessor {
    public void process(boolean isCustom, String input) {
        if (isCustom) {
            processCustomDelimiter(input);
        } else {
            processDefaultDelimiter(input);
        }
    }

    private void processCustomDelimiter(String input) {
        DelimiterParser delimiterParser = new DelimiterParser();
        String customInput = delimiterParser.parseDelimiter(input);
        processDefaultDelimiter(customInput);
    }

    private void processDefaultDelimiter(String input) {
        StringSplitter splitter = new StringSplitter();
        splitter.splitByDelimiter(input);
    }
}