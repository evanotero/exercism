import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;


public class Anagram {
    private String word;
    private Map<Character, Integer> wordmap = new HashMap<>();

    public Anagram (String s) {
        word = s.toLowerCase();

        int length = word.length();
        for (int i = 0; i < length; i++)
            wordmap.merge(word.charAt(i), 1, (a, b) -> a + b);
    }

    private boolean isAnagram(String other) {
        boolean result = false;
        Map<Character, Integer> othermap = new HashMap<>();
        other = other.toLowerCase();

        int length = other.length();
        if (length == word.length())
            for (int i = 0; i < length; i++)
                othermap.merge(other.charAt(i), 1, (a, b) -> a + b);
        return othermap.equals(wordmap) && !other.equals(word.toLowerCase());
    }

    public List<String> match(List<String> words) {
        List<String> matches = new ArrayList<>();
        for (String word : words)
            if (isAnagram(word)) matches.add(word);
        return matches;
    }
}