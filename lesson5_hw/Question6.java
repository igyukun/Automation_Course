package lesson5_hw;

import java.util.HashMap;
import java.util.Map;

public class Question6 {
    public static void main(String[] args) {

        //Initialize the HashMap of username:password pairs
        Map<String, String> users = new HashMap<>();
        users.put("user1", "QWERTY");
        users.put("user2", "AZERTY");
        users.put("user3","smartAss56");

        //iterate thorugh the hash map and print the pairs
        for (Map.Entry<String, String> m: users.entrySet())
        {
            System.out.println(m.getKey() + ":" + m.getValue());
        }
    }
}
