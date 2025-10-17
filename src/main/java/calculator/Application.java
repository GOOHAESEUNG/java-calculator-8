package calculator;

import java.util.List;

public class Application {

    public static void main(String[] args) {
        InputView inputView = new InputView();
        String input = inputView.inputView();

        StringSplitter splitter = new StringSplitter();
        List<String> inputList = splitter.splitByDelimiter(input);
    }
}
