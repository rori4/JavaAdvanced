package L15_StreamAPILab;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class P03_FirstName {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        List<String> names =
                Arrays.asList(reader.readLine().split(" "));

        HashSet<Character> chars = new HashSet<>();

        Arrays.stream(reader.readLine().split("\\s+"))
                .map(s -> s.charAt(0))
                .forEach(chars::add);

        Optional<String> first = names.stream()
                .filter(n -> chars.contains(n.toLowerCase().charAt(0)))
                .sorted()
                .findFirst();

        if (first.isPresent()){
            System.out.println(first.get());
        } else {
            System.out.println("No match");
        }
    }
}
