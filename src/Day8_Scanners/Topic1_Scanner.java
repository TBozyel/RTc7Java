package Day8_Scanners;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.Scanner;

public class Topic1_Scanner {
    public static void main(String[] args) {
        //next() == > it will read a word from the console
        // Java Class
        //nextLine() == > it reads the whole line on the console
        //Java Class
        // is fun
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter your first name: ");
        String firstName = scan.next();
        System.out.println("Your first name is: "+firstName);
        System.out.println("Please enter your age: ");
        String age = scan.next();
        System.out.println("your age is: "+age);
        System.out.println("please enter your zipcode");
        String zipcode = scan.next();
        String zipcodeAge = age+zipcode;
        System.out.println("the age + zipcode: "+zipcodeAge);


    }
}
