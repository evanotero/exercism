public class Bob {
    private static final String YELL = "Whoa, chill out!";
    private static final String EMPTY = "Fine. Be that way!";
    private static final String QUESTION = "Sure.";
    private static final String OTHER = "Whatever.";

    public String hey(String s) {
        String output;

        s = s.replaceAll("\\s+", "");

        if (s.isEmpty())
            output = EMPTY;
        else if (isYell(s))
            output = YELL;
        else if (isQuestion(s))
            output = QUESTION;
        else
            output = OTHER;

        return output;
    }

    private boolean isYell(String s) {
        int numOfLetters = 0; // Must be at least one letter
        for (int i = 0; i < s.length(); i++) {
            int c = s.charAt(i);
            if (Character.isLetter(c)) {
                if (Character.isLowerCase(c))
                    return false;
                numOfLetters++;
            }
        }
        return numOfLetters >= 1;
    }

    private boolean isQuestion(String s) {
        return s.charAt(s.length() - 1) == '?';
    }
}
