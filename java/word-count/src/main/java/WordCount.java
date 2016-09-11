import java.util.*;

public class WordCount {
    public Map<String, Integer> phrase (String str) {
        String[] words = str.split("\\W+");
        Map<String, Integer> counts = new HashMap<>();

        for (String word : words)
            counts.merge(word.toLowerCase(), 1, (a, b) -> a + b);
        return counts;
    }
}
