package calculator;

import java.util.List;

public class StringCalculator {
    public int calculate(List<String> input) {
        int sum = 0;

        for (String s : input) {
            sum += Integer.parseInt(s);
        }

        System.out.println("결과 : " + sum);
        return sum;
    }
}
