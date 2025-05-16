package setexamples;

import java.util.HashSet;
import java.util.Set;

public class HashSetExample {
    public static void main(String[] args) {

        Set<String> set1 = new HashSet<String>();

        set1.add("Mango");
        set1.add("Orange");
        set1.add("Guava");
        set1.add(null);
        set1.add("Guava");
        set1.add("Grapes");
        set1.add(null);

        System.out.println("set1 is : "+set1);

        set1.remove("Orange");
        System.out.println("set1 after removing is : "+set1);

        System.out.println("set1 traversal");
        for(String s1:set1){
            System.out.println(s1);
        }

    }
}
