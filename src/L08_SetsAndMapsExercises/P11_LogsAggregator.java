package L08_SetsAndMapsExercises;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class P11_LogsAggregator {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());
        Map<String,TreeSet<String>> userIps = new TreeMap<>();
        Map<String,Integer> userDuration = new TreeMap<>();
        for (int i = 0; i < n; i++) {
            String[] inputArgs = reader.readLine().split(" ");
            String ipAdress = inputArgs[0];
            String user = inputArgs[1];
            int duratuon = Integer.parseInt(inputArgs[2]);

            if (!userIps.containsKey(user)){
                userIps.put(user, new TreeSet<>());
                userDuration.put(user,0);
            }
            userIps.get(user).add(ipAdress);
            userDuration.put(user,userDuration.get(user)+duratuon);
        }
        for (String user : userIps.keySet()) {
            String ipAll = String.join(", ",userIps.get(user));
            System.out.printf("%s: %d [%s]%n",user,userDuration.get(user),ipAll);
        }

    }
}
