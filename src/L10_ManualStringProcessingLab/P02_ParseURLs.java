package L10_ManualStringProcessingLab;

import java.util.Scanner;

public class P02_ParseURLs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        //https://softuni.bg/courses/java-advanced
        String[] remainder = input.split("://");
        if (remainder.length != 2) {
            System.out.println("Invalid URL");
        } else {
            System.out.println(String.format("Protocol = %s", remainder[0]));
            int index = remainder[1].indexOf("/");
            String server = String.format("Server = %s", remainder[1].substring(0, index));
            System.out.println(server);
            String resources = String.format("Resources = %s", remainder[1].substring(index + 1));
            System.out.println(resources);
        }

    }
}
