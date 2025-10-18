package calculator;

import java.util.List;

public class InputChecker {
    public boolean isCustomDelimiter(String input) {
        return input.startsWith("//");
    }

    public String validateRawInput(String input) {
        if (input == null || input.isBlank()) {
            return null;
        } else {
            return input.trim();
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
