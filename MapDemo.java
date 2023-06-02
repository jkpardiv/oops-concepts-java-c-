import java.util.*;

public class MapDemo {
    public static void main(String[] args) {
        Map<String, Integer> studentScores = new HashMap<>();

        studentScores.put("Koushik", 90);
        studentScores.put("ajay", 85);
        studentScores.put("Dube", 95);

        int KoushikScore = studentScores.get("Koushik");
        System.out.println("Alice's score: " + KoushikScore);

        studentScores.put("Dube", 100);

        studentScores.remove("ajay");

        boolean IsDube = studentScores.containsKey("Dube");
        System.out.println("Does the map contain Dave? " + IsDube);

        System.out.println("Keys in the map:");
        for (String key : studentScores.keySet()) {
            System.out.println(key);
        }

        System.out.println("Values in the map:");
        for (int value : studentScores.values()) {
            System.out.println(value);
        }

        System.out.println("Key-value pairs in the map:");
        for (Map.Entry<String, Integer> entry : studentScores.entrySet()) {
            String key = entry.getKey();
            int value = entry.getValue();
            System.out.println(key + " : " + value);
        }

        int mapSize = studentScores.size();
        System.out.println("Size of the map: " + mapSize);

    }
}

