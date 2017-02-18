package L07_SetsAndMapsLab;

import java.util.HashMap;
import java.util.Scanner;

public class P04_CountSameValuesinArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");

        HashMap<String, Integer> results = new HashMap<>();

        for (int i = 0; i < input.length; i++) {
            if (!results.containsKey(input[i])) {
                results.put(input[i], 1);
            } else {
                results.put(input[i], results.get(input[i]) + 1);
            }
        }
        for (String key : results.keySet()) {
            System.out.println(key + " - " + results.get(key) + " times");
        }
    }
}
