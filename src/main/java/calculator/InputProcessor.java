package calculator;

import java.util.List;

public class InputProcessor {

    public void processCalculation(String input) {
        InputChecker checker = new InputChecker();
        boolean isCustom = checker.isCustomDelimiter(input);
        List<String> splitInput = process(isCustom, input);
        checker.validateNumberList(splitInput);

        StringCalculator calculator = new StringCalculator();
        Integer result = calculator.calculate(splitInput);

        InputView inputView = new InputView();
        inputView.resultView(result);
    }

    private List<String> process(boolean isCustom, String input) {
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