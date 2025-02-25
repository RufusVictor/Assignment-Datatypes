import java.util.Scanner;

public class AverageWeightCalculator {
    public static void main(String[] args) {
        final int NUMBER_OF_PEOPLE = 10;
        double totalWeight = 0.0;
        
        Scanner scanner = new Scanner(System.in);
        
        for (int personIndex = 1; personIndex <= NUMBER_OF_PEOPLE; personIndex++) {
            System.out.print("Enter the weight of person " + personIndex + " (kg): ");
            double personWeight = scanner.nextDouble();
            totalWeight += personWeight;
        }
        
        scanner.close();
        
        double averageWeight = totalWeight / NUMBER_OF_PEOPLE;
        System.out.println("The average weight of " + NUMBER_OF_PEOPLE + " people is: " + averageWeight + " kg");
    }
}
