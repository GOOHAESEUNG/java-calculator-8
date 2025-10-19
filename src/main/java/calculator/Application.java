package calculator;

public class Application {
    public static void main(String[] args) {
        InputView inputView = new InputView();
        String rawInput = inputView.inputView();

        InputChecker inputChecker = new InputChecker();
        inputChecker.validateRawInput(rawInput);
    }
}
