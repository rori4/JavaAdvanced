package L08_SetsAndMapsExercises;

import java.util.*;

public class P02_SetsOfElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Scanner to Integer array!!!
        int[] setSize = Arrays.stream(scanner.nextLine().split( " "))
                .mapToInt(Integer::parseInt).toArray();
        
        Set<String> set1 = new LinkedHashSet<>();
        Set<String> set2 = new HashSet<>();

        for (int i = 0; i < setSize[0]+setSize[1]; i++) {
            if (i<setSize[0]){
                set1.add(scanner.nextLine());
            } else {
                set2.add(scanner.nextLine());
            }
        }

        set1.retainAll(set2);

        System.out.println(String.join(" ",set1));
    }
}
