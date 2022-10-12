package Day8_Scanners;

import java.util.Scanner;

public class Topic2_nextVSnextLine {

    //next() == > it will read a word from the console
    // Java Class (just "Java" will be scanned
    //nextLine() == > it reads the whole line on the console.it will stop at the next line
    //Java Class 9the whole line "Java Class" will be scanned
    // is fun
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter your first name and last name: ");
        String name = scan.nextLine();
        System.out.println("Your first and last name is: "+name);

    }
}
