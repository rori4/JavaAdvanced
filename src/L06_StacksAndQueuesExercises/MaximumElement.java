package L06_StacksAndQueuesExercises;

import java.util.ArrayDeque;
import java.util.Scanner;

public class MaximumElement {
    public static ArrayDeque<Integer> stack = new ArrayDeque<>();
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.valueOf(scanner.nextLine());
        //System.out.printf("%d commands\n",n);

        for (int i = 0; i < n; i++) {
            String [] commands = scanner.nextLine().split(" ");
            int command = Integer.valueOf(commands[0]);

            if (command==1){
                int x = Integer.valueOf(commands[1]);
                stack.push(x);
                //System.out.println("Push " + x);
            } else if (command==2) {
                stack.pop();
                //System.out.println("Pop an element");
            } else if (command==3){
                int maxStackValue = Integer.MIN_VALUE;
                for (Integer integer : stack) {
                    if (integer>=maxStackValue){
                        maxStackValue=integer;
                    }
                }
                System.out.println(maxStackValue);
            }
        }

    }
}
