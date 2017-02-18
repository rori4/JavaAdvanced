package L08_SetsAndMapsExercises;

import java.util.*;

public class P08_HandsOfCards {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String,HashSet<String>> results = new LinkedHashMap<>();
        while (true){
            String input = scanner.nextLine();
            if ("JOKER".equals(input)){
                break;
            } else {
                String[] nameCards = input.split(": ");
                String name = nameCards[0];
                String[] cardsTemp = nameCards[1].split(", ");
                HashSet<String> cards = new HashSet<>();
                Collections.addAll(cards, cardsTemp);

                if (!results.containsKey(name)){
                    results.put(name,cards);
                } else {
                    for (String card : cards) {
                        results.get(name).add(card);
                    }
                }
            }
        }
        for (String s : results.keySet()) {
            int score = calculateScore(results.get(s));
            System.out.printf("%s: %d%n",s,score);
        }
    }

    private static int calculateScore(HashSet<String> cards) {
        int result = 0;
        for (String card : cards) {
            String power = card.substring(0,card.length()-1);
            String type = card.substring(card.length()-1);
            switch (power) {
                case "1": power = "1"; break;
                case "2": power = "2"; break;
                case "3": power = "3"; break;
                case "4": power = "4"; break;
                case "5": power = "5"; break;
                case "6": power = "6"; break;
                case "7": power = "7"; break;
                case "8": power = "8"; break;
                case "9": power = "9"; break;
                case "10": power = "10"; break;
                case "J": power = "11"; break;
                case "Q": power = "12"; break;
                case "K": power = "13"; break;
                case "A": power = "14"; break;
            }
            switch (type) {
                case "S": type = "4"; break;
                case "H": type = "3"; break;
                case "D": type = "2"; break;
                case "C": type = "1"; break;
            }
            result+=Integer.parseInt(power)*Integer.parseInt(type);
        }
        return result;
    }
}
