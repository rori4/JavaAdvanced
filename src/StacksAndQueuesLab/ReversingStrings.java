package StacksAndQueuesLab;

import java.util.ArrayDeque;
import java.util.Scanner;

public class ReversingStrings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inputString = scanner.nextLine();
        ArrayDeque<Character> reversd = new ArrayDeque<>();
        for (char ch : inputString.toCharArray()) {
            reversd.push(ch);
        }

        while (!reversd.isEmpty()){
            System.out.print(reversd.pop());
        }
    }
}
