import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;


public class Anagram {
    private String word;
    private String sorted;

    public Anagram (String s) {
        word = s.toLowerCase();
        sorted = sort(word);
    }

    private String sort(String s) {
        char[] chars = s.toCharArray();
        Arrays.sort(chars);
        return new String(chars);
    }

    private boolean isAnagram(String other) {
        other = other.toLowerCase();
        return !other.equals(word) && sort(other).equals(sorted);
    }

    public List<String> match(List<String> words) {
        List<String> matches = new ArrayList<>();
        for (String word : words)
            if (isAnagram(word)) matches.add(word);
        return matches;
    }
}