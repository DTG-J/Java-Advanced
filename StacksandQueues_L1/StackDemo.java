package StacksandQueues_L1;

import java.util.ArrayDeque;
import java.util.Scanner;
import java.util.stream.Collectors;

public class StackDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayDeque <Integer> stack = new ArrayDeque<>();

        // Stack - LIFO - Last in First out
        // push(element) - insert element on the top of the stack
        // pop() - remove topmost element
        // peek() - get topmost element

        //1. Stack fill
       // Arrays.stream(scanner.nextLine().split("\\s+")).map (Integer::parseInt).forEach(stack::push);

        stack.push(2);
        stack.push(3);
        stack.push(5);
        stack.push(13);

        //2. Stack print
        System.out.println(stack.stream().map (String::valueOf).collect(Collectors.joining(", ")));

        System.out.println(stack.peek());

        int lastElement = stack.pop();
        System.out.println(lastElement);

        System.out.println(stack.size()); //3
        System.out.println(stack.contains(3)); //true
        System.out.println(stack.contains(32)); //false
        System.out.println(stack.isEmpty()); //false

        stack.forEach(System.out::println);

     //   while (!stack.isEmpty()) {
            //        System.out.println(stack.pop());
            //        }





    }
}
