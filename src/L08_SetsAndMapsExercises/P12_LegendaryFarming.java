package L08_SetsAndMapsExercises;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Map;
import java.util.TreeMap;

public class P12_LegendaryFarming {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        Map<String, Long> keyMaterials = new TreeMap<>();
        Map<String, Long> junkMaterial = new TreeMap<>();

        keyMaterials.put("fragments", 0L);
        keyMaterials.put("shards", 0L);
        keyMaterials.put("motes", 0L);

        while (true) {
            String[] input = reader.readLine().split(" ");
            boolean endIt = false;
            for (int i = 0; i < input.length; i += 2) {
                long quantity = Long.parseLong(input[i]);
                String element = input[i + 1].toLowerCase();
                if (keyMaterials.containsKey(element)) {
                    keyMaterials.put(element, keyMaterials.get(element) + quantity);
                    if (isObtained(keyMaterials)) {
                        endIt = true;
                        break;
                    }
                } else {
                    if (!junkMaterial.containsKey(element)) {
                        junkMaterial.put(element, quantity);
                    } else {
                        junkMaterial.put(element, junkMaterial.get(element) + quantity);
                    }
                }
            }
            if (endIt) break;
        }
        printOutput(keyMaterials, junkMaterial);
    }

    private static void printOutput(Map<String, Long> keyMaterials, Map<String, Long> junkMaterial) {
        keyMaterials.entrySet().stream().sorted((e1, e2) -> e2.getValue().compareTo(e1.getValue()))
                .forEach(entry -> {
                    System.out.println(String.format("%s: %d", entry.getKey().toLowerCase(), entry.getValue()));
                });
        for (String junk : junkMaterial.keySet()) {
            System.out.printf("%s: %d%n", junk.toLowerCase(), junkMaterial.get(junk));
        }
    }

    private static boolean isObtained(Map<String, Long> keyMaterials) {
        boolean obtained = false;
        for (String key : keyMaterials.keySet()) {
            if (keyMaterials.get(key) >= 250) {
                keyMaterials.put(key, keyMaterials.get(key) - 250);
                switch (key) {
                    case "fragments":
                        System.out.println("Valanyr obtained!");
                        break;
                    case "shards":
                        System.out.println("Shadowmourne obtained!");
                        break;
                    case "motes":
                        System.out.println("Dragonwrath obtained!");
                        break;
                }
                obtained = true;
            }
        }
        return obtained;
    }
}
