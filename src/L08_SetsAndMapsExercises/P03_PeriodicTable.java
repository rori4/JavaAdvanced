package L08_SetsAndMapsExercises;

import java.util.*;

public class P03_PeriodicTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        Set<String> elements = new TreeSet<>();
        for (int i = 0; i < n; i++) {
            String[] inputLine = scanner.nextLine().split(" ");
            for (String element : inputLine) {
                elements.add(element);
            }
        }
        System.out.println(String.join(" ",elements));
    }
}
