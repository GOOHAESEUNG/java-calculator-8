package calculator;

import java.util.List;

public class Application {

    public static void main(String[] args) {
        InputView inputView = new InputView();
        String rawInput = inputView.inputView();

        InputChecker inputChecker = new InputChecker();
        String input = inputChecker.validateRawInput(rawInput);
        //input 이 널일 경우 처리

        boolean isCustom = inputChecker.isCustomDelimiter(input);

        InputProcessor inputProcessor = new InputProcessor();
        List<String> splitInput = inputProcessor.process(isCustom, rawInput);

    }


}
