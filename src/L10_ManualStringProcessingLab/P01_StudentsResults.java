package L10_ManualStringProcessingLab;

import java.util.*;

public class P01_StudentsResults {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());
        Map<String,List<Double>> result = new TreeMap<>();
        for (int i = 0; i < number; i++) {
            String[] input = scanner.nextLine().split(" - ");
            String[] examResultsLikeString = input[1].split(",");
            List<Double> examResults = new ArrayList<>();
            double sum = 0;
            for (String res : examResultsLikeString) {
                double remainder = Double.parseDouble(res);
                sum+= remainder;
                examResults.add(Double.parseDouble(res));
            }
            examResults.add(sum/3);
            result.put(input[0],examResults);
        }
        //Ask what happens in a 0 input!
        if (number!=0){
            System.out.println(String.format("%1$-10s|%2$7s|%3$7s|%4$7s|%5$7s|","Name","JAdv","JavaOOP","AdvOOP","Average"));
            for (String name : result.keySet()) {
                System.out.println(String.format("%1$-10s|%2$7.2f|%3$7.2f|%4$7.2f|%5$7.4f|",name,
                        result.get(name).get(0),
                        result.get(name).get(1),
                        result.get(name).get(2),
                        result.get(name).get(3))
                        .replace(".",","));
            }
        }
    }
}
