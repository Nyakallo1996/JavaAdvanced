package lesson7;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class TestMap {
    public static void main(String[] args) {
        //key value pairs
        Map<String, String> partList = new TreeMap<>();
        partList.put("S001", "Blue Polo Shirt");
        partList.put("S002", "Black Polo Shirt");
        partList.put("H001", "Duke Hat");

        //overwriting S002
        partList.put("S002", "Black T-Shirt");
        //creating set of keys (from map)
        Set<String> keys = partList.keySet();

        System.out.println("=== Part List ===");
        for(String key: keys) {
//            System.out.println("Part#: " + key + " " + partList.get(key));
            System.out.println(partList.get(key));
        }
    }
}
