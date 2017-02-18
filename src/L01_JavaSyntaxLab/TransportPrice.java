package L01_JavaSyntaxLab;
import java.util.Scanner;

public class TransportPrice {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String dayNight = scanner.next();
        double totalPaid = 0;
        if (n<20){
            if (dayNight.equals("day")){
                totalPaid = 0.7 + n*0.79;
            }
            else if (dayNight.equals("night")){
                totalPaid = 0.7 + n*0.90;
            }
        }
        else if (n>=20 && n<100) {
            totalPaid = n * 0.09;
        }
        else if (n>=100){
            totalPaid = n*0.06;
        }
        System.out.printf("%.2f",totalPaid);

    }
}
