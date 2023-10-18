package StacksandQueues_L1;

import java.util.ArrayDeque;

import java.util.Arrays;
import java.util.Deque;
import java.util.Scanner;
import java.util.stream.Collectors;

public class QueueDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayDeque<Integer> queue1 = new ArrayDeque<>();
        //ArrayDeque<String> queue2 = new ArrayDeque<>();

        //1. Пълнене на опашка от конзолата int:
       /* queue1 = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt).collect(Collectors.toCollection(ArrayDeque::new));*/

         //2.  Пълнене на опашка от конзолата String:

        Deque<String> deque = Arrays.stream(scanner.nextLine().split("\\s+"))
                .collect(Collectors.toCollection(ArrayDeque::new));

        System.out.println();
    }
}
