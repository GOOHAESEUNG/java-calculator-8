package calculator;

public class Application {
    public static void main(String[] args) {
        InputView inputView = new InputView();
        String rawInput = inputView.inputView();

        InputProcessor inputProcessor = new InputProcessor();
        inputProcessor.processCalculation(rawInput);
    }
}
