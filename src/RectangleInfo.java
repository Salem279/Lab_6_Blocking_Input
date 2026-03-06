import java.util.Scanner;

public class RectangleInfo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double width = 0, height = 0;
        boolean done;

        do {
            done = false;
            System.out.print("Enter rectangle width: ");
            if (in.hasNextDouble()) {
                width = in.nextDouble();
                in.nextLine();
                done = true;
            } else {
                System.out.println("Invalid input. Try again.");
                in.nextLine();
            }
        } while (!done);

        do {
            done = false;
            System.out.print("Enter rectangle height: ");
            if (in.hasNextDouble()) {
                height = in.nextDouble();
                in.nextLine();
                done = true;
            } else {
                System.out.println("Invalid input. Try again.");
                in.nextLine();
            }
        } while (!done);

        System.out.println("Area: " + (width * height));
        System.out.println("Perimeter: " + (2 * (width + height)));
        System.out.println("Diagonal: " + Math.sqrt((width * width) + (height * height)));
    }
}