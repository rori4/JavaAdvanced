package StacksAndQueuesExercises;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class RecursiveFibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n  =Integer.parseInt(scanner.nextLine());
        Deque<Integer> fibonacci = new ArrayDeque<>();
        fibonacci.add(1);
        fibonacci.add(1);

        for (int i = 0; i < n; i++) {
            int first = fibonacci.poll();
            int second = fibonacci.poll();
            fibonacci.add(second);
            fibonacci.add(first+second);
        }
        if (n==1 || n ==2){
            System.out.println(1);
        } else {
            System.out.println(fibonacci.poll());
        }
    }
}
