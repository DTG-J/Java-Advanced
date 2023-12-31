package StacksandQueues_L1;

import java.util.*;

import java.util.stream.Collectors;

public class QueueDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Queue - FIFO - First in First out
        // offer(element) - add element at the start of the Queue
        // poll() - remove first element of the Queue
        // peek() - get first element of the Queue

        //ArrayDeque<Integer> queue1 = new ArrayDeque<>();
        //ArrayDeque<String> queue2 = new ArrayDeque<>();

        //1. Пълнене на опашка от конзолата int:
       /* queue1 = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt).collect(Collectors.toCollection(ArrayDeque::new));*/

         //2.  Пълнене на опашка от конзолата String:

        /*Deque<String> deque = Arrays.stream(scanner.nextLine().split("\\s+"))
                .collect(Collectors.toCollection(ArrayDeque::new));*/

      /*  2.2 Втори начин за пълнене на String данни от конзолата:
        String [] children = scanner.nextLine().split("\\s+");

        ArrayDeque <String> queue = new ArrayDeque<>();

        for (String child : children) {
            queue.offer(child);
        }*/

        /*3. Отпечатване на данни от опашката:*/

        /* Първи начин:
        for (String element: deque) {
            System.out.print(element + " ");

        }*/
        //Втори начин
        /*deque.forEach(System.out::print);*/

        //Трети начин
      /*  System.out.println(deque.stream().map(String::valueOf)
                .collect(Collectors.joining(", ")));*/


       /* 4. Additional operations: */
        ArrayDeque<Integer> queue = new ArrayDeque<>();
        queue.add(2);
        queue.offer(3);
        queue.add(5);
        queue.offer(13);

        //System.out.println(queue.peek()); //2

        int firstElement = queue.remove(); //2
        System.out.println(firstElement);

        System.out.println(queue.size()); //2
        System.out.println(queue.contains(3)); //true
        System.out.println(queue.contains(32)); //false
        System.out.println(queue.isEmpty()); //false

        queue.forEach(System.out::println);

       // while (!queue.isEmpty()) {
            //            System.out.println(queue.poll());
            //        }
// PriorityQueue
        PriorityQueue<Character> priorityQueue = new PriorityQueue<>(Collections.reverseOrder());

        priorityQueue.offer('1');
        priorityQueue.offer('2');
        priorityQueue.offer('3');
        priorityQueue.offer('4');
        priorityQueue.offer('5');

        while (!priorityQueue.isEmpty()) {
            System.out.println(priorityQueue.poll());
        }

    }
}

