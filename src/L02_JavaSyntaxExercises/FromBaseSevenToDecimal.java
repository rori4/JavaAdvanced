package L02_JavaSyntaxExercises;
import java.util.Scanner;

public class FromBaseSevenToDecimal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String converted = Integer.toString(Integer.parseInt(input, 7),10);
        System.out.println(converted);
    }
}
