import java.util.HashMap;
import java.util.Map;

public class Scrabble {
    private final static Map<Character, Integer> values = new HashMap<>();
    private final String word;

    public Scrabble(String s) {
        this.word = s == null ? "" : s.trim().toLowerCase();
        initValues();
    }

    public int getScore() {
        int score = 0;
        for (int i = 0; i < word.length(); i++)
            score += values.get(word.charAt(i));
        return score;
    }

    private void initValues() {
        values.put('a', 1);
        values.put('b', 3);
        values.put('c', 3);
        values.put('d', 2);
        values.put('e', 1);
        values.put('f', 4);
        values.put('g', 2);
        values.put('h', 4);
        values.put('i', 1);
        values.put('j', 8);
        values.put('k', 5);
        values.put('l', 1);
        values.put('m', 3);
        values.put('n', 1);
        values.put('o', 1);
        values.put('p', 3);
        values.put('q', 10);
        values.put('r', 1);
        values.put('s', 1);
        values.put('t', 1);
        values.put('u', 1);
        values.put('v', 4);
        values.put('w', 4);
        values.put('x', 8);
        values.put('y', 4);
        values.put('z', 10);
    }
}
