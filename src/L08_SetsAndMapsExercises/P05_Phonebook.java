package L08_SetsAndMapsExercises;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class P05_Phonebook {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, String> phonebook = new HashMap<>();
        while (true) {
            String input = scanner.nextLine();
            if ("search".equals(input)) {
                break;
            } else {
                String[] namePhone = input.split("-");
                phonebook.put(namePhone[0],namePhone[1]);
            }
        }
        while (true){
            String input = scanner.nextLine();
            if ("stop".equals(input)){
                break;
            } else {
                if (phonebook.containsKey(input)){
                    System.out.printf("%s -> %s\n",input,phonebook.get(input));
                } else {
                    System.out.printf("Contact %s does not exist.\n", input);
                }
            }
        }
    }
}
