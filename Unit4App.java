import java.util.Scanner;

public class Unit4App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int total = 0;
        int count = 0;

        System.out.println("Enter numbers to sum (enter 0 to stop):");

        while (count < 10) { 
            System.out.print("Enter number " + (count + 1) + ": ");
            try {
                int number = scanner.nextInt();
                if (number == 0) { 
                    break;
                }
                total += number;
                count++;
            } catch (Exception e) {
                System.out.println("Invalid input. Please enter an integer.");
                scanner.next(); 
            }
        }

        System.out.println("The total sum is: " + total);
        scanner.close();
    }
}