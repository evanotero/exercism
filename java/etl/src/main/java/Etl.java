import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.HashMap;

public class Etl {
    public Map<String, Integer> transform(Map<Integer, List<String>> old) {
        Map<String, Integer> newSystem = new HashMap<>();
        Set<Map.Entry<Integer, List<String>>> entries = old.entrySet();

        for (Map.Entry<Integer, List<String>> e : entries) {
            int score = e.getKey();
            List<String> letters = e.getValue();

            for (String letter : letters) {
                newSystem.put(letter.toLowerCase(), score);
            }
        }
        return newSystem;
   }
}
