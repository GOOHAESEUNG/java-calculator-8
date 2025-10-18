package calculator;

public class DelimiterParser {
    private static final String CUSTOM_DELIMITER_PREFIX = "//";
    private static final String CUSTOM_DELIMITER_SUFFIX = "\\n";

    public String parseDelimiter(String input) {
        int start = CUSTOM_DELIMITER_PREFIX.length();
        int end = input.indexOf(CUSTOM_DELIMITER_SUFFIX);
        String delimiter = input.substring(start, end);

        return delimiter.trim();
    }
}