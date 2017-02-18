package L06_StacksAndQueuesExercises;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class SequenceWithQueue {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long number = Long.parseLong(scanner.nextLine());

        Deque<Long> sequeance = new ArrayDeque<>();

        sequeance.add(number);

        for (int i = 0; i < 50; i++) {
            Long element = sequeance.poll();

            System.out.printf("%d ", element);

            long s2 = element+1;
            long s3 = 2*element+1;
            long s4 = element+2;

            sequeance.add(s2);
            sequeance.add(s3);
            sequeance.add(s4);

        }
    }
}
