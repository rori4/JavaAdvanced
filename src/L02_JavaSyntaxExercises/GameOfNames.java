package L02_JavaSyntaxExercises;

import java.util.Scanner;

public class GameOfNames {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String winnerName = "";
        int highScore = -100000;
        for (int i = 0; i < n; i++) {
            String player = scanner.next();
            int score = scanner.nextInt();

            for (int j = 0; j < player.length(); j++) {
                int currentChar =(int)player.charAt(j);
                if (currentChar%2==0){
                    score += currentChar;
                } else {
                    score -= currentChar;
                }
            }
            if (score>highScore){
                highScore=score;
                winnerName = player;
            }
        }
        System.out.printf("The winner is %s - %d points", winnerName,highScore);
    }
}
