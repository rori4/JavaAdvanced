package L14_FunctionalProgramingLab;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.function.Predicate;

public class P03_CountUpperCaseWords {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String [] input = reader.readLine().split(" ");
        Predicate<String> checkUpperCase = s -> s.charAt(0) == s.toUpperCase().charAt(0);

        ArrayList<String> result = new ArrayList<>();
        for (String anInput : input) {
            if (checkUpperCase.test(anInput)) {
                result.add(anInput);
            }
        }
        System.out.println(result.size());
        for (String s : result) {
            System.out.println(s);
        }

    }
}
