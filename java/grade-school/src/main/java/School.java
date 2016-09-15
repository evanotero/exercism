import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.List;
import java.util.Set;
import java.util.Collections;

public class School {
    private Map<Integer, List<String>> database = new HashMap<>();

    public Map<Integer, List<String>> db() {
        return database;
    }

    public void add(String name, int grade) {
        List<String> students;

        if (database.containsKey(grade))
            students = database.get(grade);
        else
            students = new ArrayList<>();

        students.add(name);
        database.put(grade, students);
    }

    public List<String> grade(int grade) {
        return database.containsKey(grade) ? database.get(grade) : new ArrayList<>();
    }

    public Map<Integer, List<String>> sort() {
        Set<Map.Entry<Integer, List<String>>> entries = database.entrySet();
        for (Map.Entry<Integer, List<String>> e : entries) {
            List<String> students = e.getValue();
            Collections.sort(students);
            e.setValue(students);
        }
        return database;
    }
}
