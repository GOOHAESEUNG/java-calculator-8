package calculator;

public class InputChecker {
    public boolean isCustomDelimiter(String input) {
        return input.startsWith("//");
    }
}
