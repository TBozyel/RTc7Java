import java.util.Scanner;

public class HW10 {
    //write a code where user is being asked to enter a number and based on the entered number print the number is positive, negative or zero
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = scan.nextInt();
        if (number > 0) {
            System.out.println("The number is positive");
        } else if (number < 0) {
            System.out.println("The number is negative");

        } else {
            System.out.println("The number is zero");
        }
    }
}
