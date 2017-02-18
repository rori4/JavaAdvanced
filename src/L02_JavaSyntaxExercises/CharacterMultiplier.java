package L02_JavaSyntaxExercises;

import java.util.Scanner;

public class CharacterMultiplier {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String first = scanner.next();
        String second = scanner.next();

        int result = characterMultiplier(first,second);

        System.out.println(result);
    }

    private static int characterMultiplier(String first, String second) {

        int result = 0;
        int smallestInput = Math.min(first.length(),second.length());
        int largestInput = Math.max(first.length(),second.length());

        for (int i = 0; i <smallestInput ; i++) {
            result += (int)first.charAt(i)*(int)second.charAt(i);
        }
        for (int i = smallestInput; i < largestInput; i++) {
            if (first.length()>second.length()){
                result+= (int) first.charAt(i);
            } else {
                result+= (int) second.charAt(i);
            }
        }

        return result;
    }
}
