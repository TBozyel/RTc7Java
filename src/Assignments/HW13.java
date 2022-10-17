import java.util.Scanner;

public class HW13 {
    /*
    Write a calculator program by following instructions:
1) Ask the user to enter 1st number
2) Ask the user to enter second number
3) Ask the user to select the operation ( ask user to enter 1 for Summation, 2 for Subtraction, 3 for Multiplication, and 4 for division.)
4) based on the selection perform operation and print the result of the operation
(Ex. enter 1st number : 20
	enter 2nd number: 25
	Select operation  enter 1 for Summation, 2 for Subtraction, 3 for Multiplication, and 4 for division.: 1
	The result is : 45.)
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        double number1 = scan.nextDouble();
        System.out.println("Enter the second number: ");
        double number2 = scan.nextDouble();
        System.out.println("Select the operation: \n enter 1 for Summation; \n enter 2 for Subtraction; \n enter 3 for Multiplication; \n enter 4 for Division; ");
        double operation = scan.nextDouble();

            if (operation == 1) {
                System.out.println("The result is: " + (number1 + number2));
            } else if (operation == 2) {
                System.out.println("The result is: " + (number1 - number2));
            } else if (operation == 3) {
                System.out.println("The result is: " + (number1 * number2));
            } else if (operation == 4) {
                System.out.println("The result is: " + (number1 / number2));
            } else {
                System.out.println("There is no operation for your number. Please try again.");
            }


        }
    }

