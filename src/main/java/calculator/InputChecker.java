package calculator;

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
}
