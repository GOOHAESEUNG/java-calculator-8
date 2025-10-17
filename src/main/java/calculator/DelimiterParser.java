package calculator;

public class DelimiterParser {
    public String parseDelimiter(String input) {
        StringBuffer stringBuffer = new StringBuffer();
        int index = 0;

        for (int i = 1; i < input.length(); i++) {
            if (input.charAt(i) != '\n') {
                stringBuffer.append(input.charAt(i));
            } else {
                index = i;
                break;
            }
        }

        return stringBuffer.toString();
    }
}
