package StacksAndQueuesLab;

import com.sun.org.apache.xpath.internal.SourceTree;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class PalindromeChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String palidromCandidate = scanner.nextLine();
        Deque<Character> queue = new ArrayDeque<>();
        for (char c : palidromCandidate.toCharArray()) {
            queue.offer(c);
        }
        boolean isPalidrome = true;
        while (queue.size()>1){
            char first = queue.poll();
            char last = queue.pollLast();

            if (first != last){
                isPalidrome= false;
                break;
            }
        }
        System.out.println(isPalidrome);
    }
}
