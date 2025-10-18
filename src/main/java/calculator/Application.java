package calculator;

import java.util.List;

public class Application {

    public static void main(String[] args) {
        InputView inputView = new InputView();
        String input = inputView.inputView();

        InputChecker inputChecker = new InputChecker();
        boolean isCustom = inputChecker.isCustomDelimiter(input);

        InputProcessor inputProcessor = new InputProcessor();
        List<String> splitInput = inputProcessor.process(isCustom, input);

    }


}
