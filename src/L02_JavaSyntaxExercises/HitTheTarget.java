package L02_JavaSyntaxExercises;
import java.util.Scanner;

public class HitTheTarget {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int inputNumber = scanner.nextInt();
        for (int firstNumber = 1; firstNumber <= 20; firstNumber++) {
            for (int secondNumber = 1; secondNumber <= 20 ; secondNumber++) {
                if (firstNumber+secondNumber==inputNumber){
                    System.out.printf("%d + %d = %d\n", firstNumber, secondNumber, inputNumber);
                }else if (firstNumber-secondNumber==inputNumber){
                    System.out.printf("%d - %d = %d\n", firstNumber, secondNumber, inputNumber);
                }
            }
        }
    }
}
