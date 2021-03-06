package L10_ManualStringProcessingLab;

import java.util.Scanner;

public class P03_ParseTags {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String upcase = "<upcase>";
        String upcaseClose = "</upcase>";

        while (input.contains(upcase)){
            int indexOfStart = input.indexOf(upcase);
            int indexOfEnd = input.indexOf(upcaseClose);

            String remainder = input.substring(indexOfStart+upcase.length(),indexOfEnd);
            input = input.replace(upcase+remainder+upcaseClose,remainder.toUpperCase());
        }
        System.out.println(input);
    }
}
