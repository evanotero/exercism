import java.util.Map;
import java.util.HashMap;

public class DNA {
    private char[] nucleotides;
    private int length;

    public DNA(String s) {
        nucleotides = s.toCharArray();
        length = nucleotides.length;
    }

    public int count(char target) {
        if (target != 'G' && target != 'C' && target != 'A' && target != 'T')
            throw new IllegalArgumentException("That is not a valid nucleotide.");

        int count = 0;
        for (int i = 0; i < length; i++)
            if (nucleotides[i] == target) count++;
        return count;
    }

    public Map<Character, Integer> nucleotideCounts() {
        Map<Character, Integer> counts = new HashMap<>();
        counts.put('A', 0);
        counts.put('G', 0);
        counts.put('C', 0);
        counts.put('T', 0);

        for (int i = 0; i < length; i++)
            counts.merge(nucleotides[i], 1, (a, b) -> a + b);
        return counts;
    }
}
