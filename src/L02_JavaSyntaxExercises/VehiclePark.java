package L02_JavaSyntaxExercises;

import java.util.*;

public class VehiclePark {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> vehicles = new LinkedList<String>(Arrays.asList(scanner.nextLine().split(" ")));
        String input = scanner.nextLine();

        int vehiclesSold = 0;

        while (!(input.equals("End of customers!"))) {
            String[] data = input.split(" ");
            String query = data[0].toLowerCase().charAt(0) + data[2];

            int wantedIndex = -1;
            for (int i = 0; i < vehicles.size(); i++) {
                if (query.equals(vehicles.get(i))){
                    wantedIndex=i;
                    break;
                }
            }
            if (wantedIndex==-1){
                System.out.println("No");

            } else {
                String vehicle = vehicles.get(wantedIndex);
                int price = vehicle.charAt(0)*Integer.parseInt(vehicle.substring(1));
                System.out.printf("Yes, sold for %d$\n",price);
                vehiclesSold++;
                vehicles.remove(wantedIndex);

            }

            input = scanner.nextLine();
        }

        System.out.printf("Vehicles left: %s\n", String.join(", ", vehicles));
        System.out.printf("Vehicles sold: %d\n", vehiclesSold);
    }
}
