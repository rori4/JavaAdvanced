package StacksAndQueuesExercises;

import java.util.*;

public class PoisonousPlants {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int[] plants = new int[n];
        for (int i = 0; i < plants.length; i++) {
            plants[i] = scanner.nextInt();
        }
        int[] days = new int[n];
        Deque<Integer> proximityStack = new ArrayDeque<>();
        proximityStack.push(0);

        for (int i = 1; i < plants.length; i++) {
            int maxDays = 0;
            while (!proximityStack.isEmpty() && plants[proximityStack.peek()] >= plants[i]) {
                maxDays = Math.max(maxDays, days[proximityStack.pop()]);
            }
            if (!proximityStack.isEmpty()) {
                days[i] = maxDays + 1;
            }
            proximityStack.push(i);
        }
        System.out.println(Arrays.stream(days).max().getAsInt());
    }
}
