package L08_SetsAndMapsExercises;

import java.util.*;

public class P09_UserLogs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, LinkedHashMap<String, Integer>> ipTracker = new TreeMap<>();
        String input = scanner.nextLine();
        while (!"end".equals(input)) {
            String[] inputArgs = input.split(" ");
            String ipAdresses = inputArgs[0].substring(3);
            String name = inputArgs[2].substring(5);

            if (!ipTracker.containsKey(name)){
                ipTracker.put(name,new LinkedHashMap<>());
                ipTracker.get(name).put(ipAdresses,1);
            } else {
                if (ipTracker.get(name).containsKey(ipAdresses)){
                    ipTracker.get(name).put(ipAdresses,ipTracker.get(name).get(ipAdresses)+1);
                } else {
                    ipTracker.get(name).put(ipAdresses,1);
                }
            }
            input = scanner.nextLine();
        }
        for (String names : ipTracker.keySet()) {
            System.out.println(names + ":");
            String ipString = "";
            for (Map.Entry<String, Integer> tracker : ipTracker.get(names).entrySet()) {
                ipString+=String.format("%s => %d, ", tracker.getKey(), tracker.getValue());
            }
            ipString = ipString.substring(0,ipString.length()-2);
            ipString+=".";
            System.out.println(ipString);
        }
    }
}
