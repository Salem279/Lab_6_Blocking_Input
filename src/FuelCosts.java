import java.util.Scanner;

public class FuelCosts {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double gallons = 0, mpg = 0, price = 0;
        boolean done;

        do {
            done = false;
            System.out.print("Enter gallons of gas in tank: ");
            if (in.hasNextDouble()) {
                gallons = in.nextDouble();
                in.nextLine();
                done = true;
            } else {
                System.out.println("Invalid input. Please enter a number.");
                in.nextLine();
            }
        } while (!done);

        do {
            done = false;
            System.out.print("Enter fuel efficiency (MPG): ");
            if (in.hasNextDouble()) {
                mpg = in.nextDouble();
                in.nextLine();
                done = true;
            } else {
                System.out.println("Invalid input. Please enter a number.");
                in.nextLine();
            }
        } while (!done);

        do {
            done = false;
            System.out.print("Enter price of gas per gallon: ");
            if (in.hasNextDouble()) {
                price = in.nextDouble();
                in.nextLine();
                done = true;
            } else {
                System.out.println("Invalid input. Please enter a number.");
                in.nextLine();
            }
        } while (!done);

        System.out.println("Cost per 100 miles: $" + (100 / mpg * price));
        System.out.println("The car can go " + (gallons * mpg) + " miles with a full tank.");
    }
}