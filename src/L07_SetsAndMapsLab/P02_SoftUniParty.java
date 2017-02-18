package L07_SetsAndMapsLab;

import java.util.HashSet;
import java.util.Scanner;
import java.util.TreeSet;

public class P02_SoftUniParty {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        HashSet<String> regular = new HashSet<>();
        TreeSet<String> vip = new TreeSet<>();

        while (true) {
            String input = scanner.nextLine();
            if ("PARTY".equals(input)) { // Better then input.equals("END") because if is null it breaks
                break;
            }
            if (isNumeric(input.charAt(0))) {
                vip.add(input);
            } else {
                regular.add(input);
            }
        }

        while (true) {
            String guestCome = scanner.nextLine();
            if ("END".equals(guestCome)) { // Better then input.equals("END") because if is null it breaks
                break;
            }
            if (isNumeric(guestCome.charAt(0))) {
                vip.remove(guestCome);
            } else {
                regular.remove(guestCome);
            }
        }
        vip.addAll(regular);
        System.out.println(vip.size());
        for (String s : vip) {
            System.out.println(s);
        }

    }

    private static boolean isNumeric(char input) {
        return String.valueOf(input).matches("\\d+");
    }
}
