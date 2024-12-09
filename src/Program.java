public class Program {

    public int countWords(String text) {
        int wordCount = 0;
        int length = text.length();
        boolean isInWord = false;

        for (int i = 0; i < length; i++) {
            char currentChar = text.charAt(i);

            if (currentChar != ' ') {
                if (!isInWord) {
                    wordCount++;
                    isInWord = true;
                }
            } else {
                isInWord = false;
            }
        }
        return wordCount;
    }

    public String reverseWords(String input) {
        String result = "";
        String word = "";

        for (int i = 0; i < input.length(); i++) {
            char currentChar = input.charAt(i);

            if (currentChar == ' ' || i == input.length() - 1) {
                if (word.length() > 0) {
                    if (!result.isEmpty()) {
                        result = word + " " + result;
                    } else {
                        result = word;
                    }
                }
                word = "";
            } else {
                word += currentChar;
            }
        }
        if (word.length() > 0) {
            if (!result.isEmpty()) {
                result = word + " " + result;
            } else {
                result = word;
            }
        }
        return result;
    }
}