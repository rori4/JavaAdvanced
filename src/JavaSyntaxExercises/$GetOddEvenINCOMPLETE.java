package JavaSyntaxExercises;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class $GetOddEvenINCOMPLETE {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split(" ");
        String[] commands = scanner.nextLine().split(" ");

        List<Integer> result = getOddOrEven(input,commands);
        for (int number: result) {
            System.out.printf("%d ",number);
        }
    }

    public static List<Integer> getOddOrEven(String[] input, String[] commands){

        int howMany = Integer.parseInt(commands[1]);
        String oddOrEven = commands[2];
        int counter = 0;
        List<Integer> result = new ArrayList<Integer>();
        if (commands[0].equals("Get")){
            for (int i = 0; i < input.length; i++) {
                int currentNumber = Integer.parseInt(input[i]);

                if (oddOrEven.equals("odd") && currentNumber%2==1 && counter<howMany){
                    result.add(currentNumber);
                    counter++;
                } else if(oddOrEven.equals("even") && currentNumber%2==0 && counter<howMany) {
                    result.add(currentNumber);
                    counter++;
                }
            }
        }
        return result;
    }
}
