import java.util.Scanner;

public class HW11 {

    /*Write a Revenue program, Where user enters the quantity of the products sold and  the price for each product.
     Then Calculate the revenue based on giving information (hint: Revenue = quantity x price)
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the quantity of sold products: " );
        double quantity=scan.nextDouble();
        System.out.println("Enter the price for each product: ");
        double prodPrice = scan.nextDouble();
        System.out.println("The revenue is: "+quantity*prodPrice+"$" );
    }
}
