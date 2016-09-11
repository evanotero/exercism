import java.util.HashSet;
import java.util.Set;

public class Pangrams {
    public static boolean isPangram(String s) {
        Set<Character> letters = new HashSet<>();
        int length = s.length();
        for (int i = 0; i < length; i++) {
            char c = Character.toLowerCase(s.charAt(i));
            if (!((int)c > 127) && Character.isLetter(c)) letters.add(c); // Letters greater than 127 are non-ASCII
        }
        return letters.size() == 26;
    }
}