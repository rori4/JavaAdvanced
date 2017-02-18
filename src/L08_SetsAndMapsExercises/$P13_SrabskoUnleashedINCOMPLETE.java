package L08_SetsAndMapsExercises;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Map;
import java.util.TreeMap;

public class $P13_SrabskoUnleashedINCOMPLETE {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Map<String,Map<String,Double>> data = new TreeMap<>();

        String[] input = reader.readLine().split(" ");
        while ("End".equals(input)) {
            String singer = input[0];
            String venue = input[1];
            double ticketPrice = Double.parseDouble(input[2]);
            int ticketCount = Integer.parseInt(input[3]);
            if ("@".equals(input[1].charAt(1))){

            }

            if (!data.containsKey(venue)){
                data.put(venue,new TreeMap<>());
            }

            input = reader.readLine().split(" ");
        }
    }
}
