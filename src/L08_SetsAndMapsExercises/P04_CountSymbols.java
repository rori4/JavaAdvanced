package L08_SetsAndMapsExercises;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class P04_CountSymbols {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        Map<Character,Integer> results = new TreeMap<>();
        for (int i = 0; i < input.length(); i++) {
            if (!results.containsKey(input.charAt(i))){
                results.put(input.charAt(i),1);
            } else {
                results.put(input.charAt(i), results.get(input.charAt(i)) + 1);
            }
        }
        for (Character key : results.keySet()) {
            System.out.println(key + ": " + results.get(key) + " time/s");
        }
    }
}
