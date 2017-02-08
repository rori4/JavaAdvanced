package StacksAndQueuesExercises;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class TruckTour {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        Deque<Integer> pumps = new ArrayDeque<>();
        for (int i = 0; i < n; i++) {
            String[] pump = scanner.nextLine().split(" ");
            int petrolGiven = Integer.parseInt(pump[0]);
            int toNextPump = Integer.parseInt(pump[1]);
            int difference = petrolGiven - toNextPump;
            pumps.add(difference);
        }
        int fuel = 0;
        for (int i = 0; i < n; i++) {
            if ((fuel + pumps.peek()) >= 0) {
                for (Integer pump : pumps) {
                    fuel += pump;
                    if (fuel<0){
                        break;
                    }
                }
                if (fuel >= 0) {
                    System.out.println(i);
                    break;
                } else {
                    pumps.offer(pumps.poll());
                    fuel=0;
                }
            } else {
                pumps.offer(pumps.poll());
            }
        }
    }
}
