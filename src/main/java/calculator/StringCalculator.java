package calculator;

import java.util.List;

public class StringCalculator {
    public Integer calculate(List<String> input) {
        int sum = 0;

        for (String s : input) {
            sum += Integer.parseInt(s);
        }
        return sum;
    }
}
