package L08_SetsAndMapsExercises;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

@SuppressWarnings("ALL")
public class P10_PopulationCounter {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        Map<String, Map<String, Long>> data = new LinkedHashMap<>();


        String line;
        while (!"report".equals((line = reader.readLine()))) {
            String[] tokens = line.split("\\|");
            String city = tokens[0];
            String country = tokens[1];
            Long population = Long.parseLong(tokens[2]);

            if (!data.containsKey(country)) {
                data.put(country, new LinkedHashMap<>());

            }
            data.get(country).put(city, population);
        }
//ALTERNATIVE METHOD//////////////////////////////////
//        populations.entrySet().stream()
//                .sorted((e1, e2) -> e2.getValue().compareTo(e1.getValue()))
//                .forEach(entry -> {
//                    System.out.println(String.format("%s (total population: %d)", entry.getKey(), entry.getValue()));
//                    data.get(entry.getKey()).entrySet().stream()
//                            .sorted((p1, p2) -> p2.getValue().compareTo(p1.getValue()))
//                            .forEach(pair -> System.out.println(String.format("=%s: %d", pair.getKey(), pair.getValue())));
//                });
        data.entrySet().stream().sorted((c1, c2) -> {
            final long[] p1 = {0};
            final long[] p2 = {0};
            c1.getValue().values().stream().forEach(count -> p1[0] += count);
            c2.getValue().values().stream().forEach(count -> p2[0] += count);
            return Long.compare(p2[0], p1[0]);
        }).forEach(contry -> {
            long totalPop = contry.getValue().values().stream().mapToLong(Long::longValue).sum();
            // can return min,max,average,and sum of avallues collection
            long REMEMBERTHIS = contry.getValue().values().stream().collect(Collectors.summarizingLong(Long::valueOf)).getSum();
            // IMOrtant
            System.out.println(String.format("%s (total population: %d)",contry.getKey(),totalPop));
            contry.getValue().entrySet().stream().sorted((p1,p2) -> p2.getValue().compareTo(p1.getValue()))
                    .forEach(pair -> System.out.println(String.format("=>%s: %d",pair.getKey(),pair.getValue())));
        });

    }
}
