
package com.psl.day06.util;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
        Queue<String> stringQueue = new Queue<>();
        System.out.println("Enter each string and hit enter to enqueue (type 'STOP' to stop):");
        while (true) {
            String input = scanner.next();
            if (input.equalsIgnoreCase("STOP")) {
                break;
            }
            stringQueue.enqueue(input);
        }
        System.out.println("Dequeued elements:");
        while (!stringQueue.isEmpty()) {
            System.out.println(stringQueue.dequeue());
        }
    }
}