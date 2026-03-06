import java.util.Scanner;
import java.util.Random;

public class HighLow {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Random gen = new Random();
        int target = gen.nextInt(10) + 1;
        int guess = 0;
        boolean done = false;

        do {
            System.out.print("Guess the number (1-10): ");
            if (in.hasNextInt()) {
                guess = in.nextInt();
                in.nextLine();
                if (guess >= 1 && guess <= 10) { done = true; }
                else { System.out.println("Out of range. 1-10 only."); }
            } else {
                System.out.println("Invalid input. Enter an integer.");
                in.nextLine();
            }
        } while (!done);

        System.out.println("The number was: " + target);
        if (guess < target) System.out.println("Too low!");
        else if (guess > target) System.out.println("Too high!");
        else System.out.println("On the money!");
    }
}