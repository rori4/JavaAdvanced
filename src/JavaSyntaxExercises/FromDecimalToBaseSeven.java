package JavaSyntaxExercises;

import java.util.Scanner;

public class FromDecimalToBaseSeven {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long x = scanner.nextLong();
        int baseToConvertTo = 7;
        System.out.println(Long.toString(x, baseToConvertTo));
    }
}
