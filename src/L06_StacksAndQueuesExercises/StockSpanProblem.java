package L06_StacksAndQueuesExercises;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;

public class StockSpanProblem {
    public static void main(String[] args) throws IOException {
        BufferedReader scanner = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(scanner.readLine());
        double[] price = new double[n];
        for (int i = 0; i < n; i++) {
            double priceStocks = Double.valueOf(scanner.readLine());
            price[i] = priceStocks;
        }
        int[] spanCalculated = new int[n];
        Deque<Integer> elementIdexes = new ArrayDeque<>();
        elementIdexes.push(0);
        spanCalculated[0] = 1;
        for (int i = 1; i < n; i++)
        {
            while (!elementIdexes.isEmpty() && price[elementIdexes.peek()] <= price[i])
                elementIdexes.pop();
            spanCalculated[i] = (elementIdexes.isEmpty())? (i + 1) : (i - elementIdexes.peek());
            elementIdexes.push(i);
        }
        for (int i : spanCalculated) {
            System.out.println(i);
        }
        // Must optimise  the time with String builder
    }
}
