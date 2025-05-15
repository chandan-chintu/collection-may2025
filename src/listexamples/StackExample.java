package listexamples;

import java.util.Stack;

public class StackExample {
    public static void main(String[] args) {
        Stack<String> stk1 = new Stack<String>();

        stk1.push("Mango");
        stk1.push("Apple");
        stk1.push("Guava");
        stk1.push("Orange");
        stk1.push(null);
        stk1.push("Guava");

        System.out.println("stk1 is : "+stk1);

        stk1.pop();
        stk1.pop();

        System.out.println("after 2 pops : "+stk1);

        System.out.println("traversing stk1");
        for (String s1 : stk1){
            System.out.println(s1);
        }

    }
}
