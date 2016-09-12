import java.util.HashSet;
import java.util.Set;
import java.util.Random;

public class Robot {
    private static final String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    private static final Set<String> names = new HashSet<>();
    private String name;

    public String getName() {
        while ((names.contains(name)) || name == null) {
            name = generateName();
        }

        names.add(name);
        return name;
    }

    public void reset() {
        names.remove(name);
        name = null;
    }

    private String generateName() {
        Random r = new Random();
        StringBuilder sb = new StringBuilder();
        sb.append(alphabet.charAt(r.nextInt(26)));
        sb.append(alphabet.charAt(r.nextInt(26)));
        sb.append(r.nextInt(10));
        sb.append(r.nextInt(10));
        sb.append(r.nextInt(10));
        return sb.toString();
    }
}
