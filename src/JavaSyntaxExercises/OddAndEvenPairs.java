package JavaSyntaxExercises;
import java.util.Scanner;

public class OddAndEvenPairs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] array = scanner.nextLine().split(" ");
        if (array.length%2==0) {
            for (int i = 0; i < array.length-1; i+=2) {
                int firstNumber = Integer.parseInt(array[i]);
                int secondNumber = Integer.parseInt(array[i + 1]);
                if (firstNumber % 2 == 0 && secondNumber % 2 == 0) {
                    System.out.printf("%d, %d -> both are even\n", firstNumber, secondNumber);
                } else if (firstNumber % 2 == 1 && secondNumber % 2 == 1) {
                    System.out.printf("%d, %d -> both are odd\n", firstNumber, secondNumber);
                } else {
                    System.out.printf("%d, %d -> different\n", firstNumber, secondNumber);
                }
            }
        } else {
            System.out.println("invalid length\n");
        }
    }
}
