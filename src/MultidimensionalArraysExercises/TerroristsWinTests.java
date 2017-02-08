package MultidimensionalArraysExercises;

import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public class TerroristsWinTests {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split("");

        int impact1 = 0;
        int impact2 = 0;
        for (int i = 0; i < input.length; i++)
        {
            if (input[i].equals("|"))
            {
                impact1 = i;
                i++;
                StringBuilder sb = new StringBuilder();
                while (!Objects.equals(input[i], "|"))
                {
                    sb.append(input[i]);
                    i++;
                }
                impact2 = i;
                Explosion(input, sb, impact1, impact2);
            }
        }
        for (String s : input) {
            System.out.printf("%s",s);
        }
    }

    private static void Explosion(String[] input, StringBuilder sb, int impact1, int impact2)
    {
        String bomb = sb.toString();
        int sum = 0;
        for (int j = 0; j < bomb.length(); j++)
        {
            sum += bomb.charAt(j);
        }
        int radius = sum % 10;
        for (int h = (impact1 - radius < 0 ? 0 : impact1 - radius);
             h <= (impact2 + radius > input.length - 1 ? input.length - 1 : impact2 + radius); h++)
        {
            input[h] = String.valueOf('.');
        }
    }
}

