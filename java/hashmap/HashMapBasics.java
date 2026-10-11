import java.util.HashMap;
import java.util.Map;

public class HashMapBasics{
    public static void main(String[] args){
        //A HashMap stores key -> value pairs.
        Map<String, Integer> ages= new HashMap<>();

        // 1. Add values
        ages.put("Alice",25);
        ages.put("Albion",16);
        ages.put("Alban",39);

        System.out.println("Initial map:");
        System.out.println(ages);

        //2. Read a value by key
        int aliceAge = ages.get("Alice");
        System.out.println("Age of Alice: "+aliceAge);
    }
}