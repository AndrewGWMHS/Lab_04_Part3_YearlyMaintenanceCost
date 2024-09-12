import java.util.Scanner;
public class YearlyMaintenanceCostCalculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double springCost;
        double summerCost;
        double fallCost;
        double winterCost;
        double totalYearCost;

        System.out.println("Enter the cost of your maintenance during spring:");
        springCost = scan.nextDouble();
        System.out.println("Enter the cost of your maintenance during summer:");
        summerCost = scan.nextDouble();
        System.out.println("Enter the cost of your maintenance during fall:");
        fallCost = scan.nextDouble();
        System.out.println("Enter the cost of your maintenance during winter:");
        winterCost = scan.nextDouble();

        totalYearCost = springCost + summerCost + fallCost + winterCost;
        System.out.println("Your yearly cost is $" + totalYearCost + ".");
    }
}