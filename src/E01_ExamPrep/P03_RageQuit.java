package E01_ExamPrep;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class P03_RageQuit {
    public static Set<Character> symbols = new HashSet<>();
    public static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String input = reader.readLine().trim();
        Pattern pat = Pattern.compile("(\\D+)(\\d+)");
        Matcher matcher = pat.matcher(input);

        while (matcher.find()){
            Integer count = Integer.parseInt(matcher.group(2));
            String str = matcher.group(1).toUpperCase();
            if (count!=0){
                for (int i = 0; i < str.length(); i++) {
                    symbols.add(str.charAt(i));
                }
                for (int i = 0; i < count; i++) {
                    sb.append(str);
                }
            }
        }
        System.out.println(String.format("Unique symbols used: %s",symbols.size()));
        System.out.println(sb.toString());
    }
}
