import java.util.Scanner;

public class HW9 {
    /*Write a code where User is being asked for the first number, second number and third number.
    Then Compare those number print the maximum number.
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Write first number: ");
        int number1 = scan.nextInt();

        System.out.println("Write second number : ");
        int number2 = scan.nextInt();
        System.out.println("Write third number: ");
        int number3 = scan.nextInt();

        System.out.println("Your numbers are: " +number1 + " and " + number2 + " and " + number3 + ".");

        if(number1<number2 && number2>number3){
            System.out.println("The biggest number is: " + number2);
        }
        else if(number1>number2 && number1>number2){
            System.out.println("The maximum number is: " + number1);
        }
        else if(number1<number3 && number2<number3){
            System.out.println("And the maximum number is: " + number3);
        }
        else if(number1==number2 || number1==number3 || number2==number3){
            System.out.println("You typed the same numbers. Try again");
        }
        else{
            System.out.println("Type different numbers please.");
        }
    }
}
