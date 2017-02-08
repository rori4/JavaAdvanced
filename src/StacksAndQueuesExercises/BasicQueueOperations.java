package StacksAndQueuesExercises;

import java.util.ArrayDeque;
import java.util.Scanner;

public class BasicQueueOperations {
    private static boolean found = false;
    private static int smallest = Integer.MAX_VALUE;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] commands = scanner.nextLine().split("\\s+");
        String[] input = scanner.nextLine().split("\\s+");
        ArrayDeque<Integer> stack = new ArrayDeque<>();

        int toAdd = Integer.valueOf(commands[0]);
        int toPop = Integer.valueOf(commands[1]);
        int toFind = Integer.valueOf(commands[2]);

        pushPopFind(input, stack, toAdd, toPop, toFind);
        PrintResults(stack);

    }

    private static void PrintResults(ArrayDeque<Integer> stack) {
        if (found){
            System.out.println("true");
        } else if (stack.isEmpty()){
            System.out.println(0);
        } else if (!found){
            System.out.println(smallest);
        }
    }

    private static void pushPopFind(String[] input, ArrayDeque<Integer> stack, int toAdd, int toPoll, int toFind) {
        for (int i = 0; i < toAdd; i++) {
            stack.add(Integer.valueOf(input[i]));
        }
        for (int i = 0; i < toPoll; i++) {
            stack.poll();
        }

        for (Integer integer : stack) {
            if (integer<=smallest){
                smallest=integer;
            }
            if (integer==toFind){
                found=true;
            }
        }
    }
}
