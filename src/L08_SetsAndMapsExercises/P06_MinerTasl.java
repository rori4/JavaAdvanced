package L08_SetsAndMapsExercises;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class P06_MinerTasl {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String,Integer> elementQuantity = new HashMap<>();
        while (true){
            String element = scanner.nextLine();
            if ("stop".equals(element)){
                break;
            } else {
                int quantity = Integer.parseInt(scanner.nextLine());
                if (!elementQuantity.containsKey(element)){
                    elementQuantity.put(element,quantity);
                } else {
                    elementQuantity.put(element,elementQuantity.get(element)+quantity);
                }
            }
        }
        for (String key : elementQuantity.keySet()) {
            System.out.println(key + " -> " + elementQuantity.get(key));
        }
    }
}
