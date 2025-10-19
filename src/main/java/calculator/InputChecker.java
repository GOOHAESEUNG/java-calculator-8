package calculator;

import java.util.List;

public class InputChecker {
    private static final String CUSTOM_DELIMITER_PREFIX = "//";

    public boolean isCustomDelimiter(String input) {
        return input.startsWith(CUSTOM_DELIMITER_PREFIX);
    }

    public void validateRawInput(String input) {
        if (input == null || input.isBlank()) {
            InputView inputView = new InputView();
            inputView.resultView(0);
        } else {
            input.trim();

            boolean isCustom = isCustomDelimiter(input);

            InputProcessor inputProcessor = new InputProcessor();
            List<String> splitInput = inputProcessor.process(isCustom, input);

            validateNumberList(splitInput);

            StringCalculator calculator = new StringCalculator();
            Integer result = calculator.calculate(splitInput);

            InputView inputView = new InputView();
            inputView.resultView(result);
        }
    }

    public void validateNumberList(List<String> values) {
        for (String value : values) {
            if (!value.matches("\\d+")) {
                throw new IllegalArgumentException("숫자가 아닌 값이 포함되어 있습니다" + value);
            }
        }
    }
}
