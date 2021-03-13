package be.kuleuven.groept.softdev.part4.demo;

import java.util.ArrayDeque;
import java.util.Queue;

public class QueueDemo {
    public static void main(String[] args) {
        Queue<Integer> queue = new ArrayDeque<>(); // FIFO

        queue.add(10);
        queue.offer(20);
        System.out.println(queue.peek()); //10

        Integer io = queue.remove();
        System.out.println(io); //10
        System.out.println(queue.element()); //20

        io = queue.poll();
        System.out.println(io); //20
        io = queue.poll(); // returns null
        System.out.println(io); //null
        io = queue.remove(); // NoSuchElementException
    }
}