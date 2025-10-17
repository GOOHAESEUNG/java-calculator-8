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
        delimiterParser.parseDelimiter(input);
    }

    private void processDefaultDelimiter(String input) {
        StringSplitter splitter = new StringSplitter();
        splitter.splitByDelimiter(input);
    }
}