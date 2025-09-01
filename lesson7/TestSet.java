package lesson7;

import java.util.Set;
import java.util.TreeSet;

public class TestSet {
    public static void main(String[] args) {
        Set<String> set = new TreeSet<>();
        //treeSets are sorted alphabetically
        set.add("one");
        set.add("two");
        set.add("three");
        set.add("three");//won't be added(no duplicates)
        System.out.println(set);
        //don't need to loop through
//        for(String s: set) {
//            System.out.println("Item: " + s);
//        }
    }
}
