package L12_RegularExpressionsLab;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class P07_ValidTime {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        Pattern pattern = Pattern.compile("^(\\d{2}):(\\d{2}):(\\d{2}) (?:AM|PM)$");
        String line = reader.readLine();

        while (!line.equals("END")) {
            Matcher matcher = pattern.matcher(line);

            if (matcher.find()) {
                int hour = Integer.valueOf(matcher.group(1));
                int minutes = Integer.valueOf(matcher.group(2));
                int seconds = Integer.valueOf(matcher.group(3));
                if (isValidTime(hour, minutes, seconds)) {
                    System.out.println("valid");
                } else {
                    System.out.println("invalid");
                }
            } else {
                System.out.println("invalid");
            }
            line = reader.readLine();
        }
    }

    private static boolean isValidTime(int hour, int minutes, int seconds) {
        return (1 <= hour && hour <= 12) && (0 <= minutes && minutes <= 59) && (0 <= seconds && seconds <= 59);

    }
}
