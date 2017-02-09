package StacksAndQueuesExercises;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class StackFibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        Deque<Long> fibonacci = new ArrayDeque<>();
        fibonacci.add((long) 1);
        fibonacci.add((long) 1);
        for (int i = 0; i < n; i++) {
            long first = fibonacci.poll();
            long second = fibonacci.poll();
            fibonacci.add(second);
            fibonacci.add(first + second);
        }
        if (n <= 1) {
            System.out.println(1);
        } else {
            System.out.println(fibonacci.poll());
        }
    }
}
