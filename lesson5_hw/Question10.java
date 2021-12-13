package lesson5_hw;

import java.util.HashMap;
import java.util.Map;

public class Question10 {
    public static void main(String[] args) {
        //Initialize the HashMap of username:password pairs
        Map<String, String> users = new HashMap<>();
        users.put("name1", "Homer");
        users.put("name2", "Marge");
        users.put("name3", "Bart");
        users.put("name4", "Lisa");

        //iterate through the hash map and print the pairs
        for (Map.Entry<String, String> m: users.entrySet())
        {
            System.out.println(m.getKey() + ":" + m.getValue());
        }
        //Check if a key exists
        System.out.println("\nHashMap contains name3 key: " + users.containsKey("name3"));
        //Retrieve the value by its key
        System.out.println("user3 value is: " + users.get("name3"));
    }
}
