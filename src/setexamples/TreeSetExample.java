package setexamples;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetExample {
    public static void main(String[] args) {

        Set<String> set1 = new TreeSet<String>();

        set1.add("Mango");
        set1.add("Orange");
        set1.add("Guava");
       // set1.add(null);
        set1.add("Guava");
        set1.add("Grapes");
       // set1.add(null);

        System.out.println("set1 is : "+set1);
    }
}
