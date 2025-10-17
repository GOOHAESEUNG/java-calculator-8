package calculator;

public class Application {

    public static void main(String[] args) {
        InputView inputView = new InputView();
        String input = inputView.inputView();

        InputChecker inputChecker = new InputChecker();
        Boolean isCustom = inputChecker.isCustomDelimiter(input);
    }
}
