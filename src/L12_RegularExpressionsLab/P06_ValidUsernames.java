package L12_RegularExpressionsLab;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class P06_ValidUsernames {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Pattern pattern = Pattern.compile("^[\\w-]{3,16}$");
        String line = reader.readLine();
        while (! line.equals("END")){
            Matcher matcher = pattern.matcher(line);
            if (matcher.find()){
                System.out.println("valid");
            } else {
                System.out.println("invalid");
            }
            line=reader.readLine();
        }
    }
}
