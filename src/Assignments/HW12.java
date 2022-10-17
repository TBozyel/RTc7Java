import java.sql.SQLOutput;
import java.util.Scanner;

public class HW12 {
    /*
    -Write a code where a teacher is entering student's first name, last name and the point they received from the exam.
- based on the point the code should automatically determine the grade of Student with the full name of the student
- This should be done for each student
- Assuming we do not know how many student are there but your code should still handle this situation
-  example input (first name = From the teacher, Last name=  from the teacher Point= from the teacher (90.5)
- When the point is between 90 to 100 the grade should be A
- When the point is between 80 to 90(excluded) the grade should be B
- When the point is between 70 to 80(excluded) the grade should be C
- When the point is between 60 to 70 (excluded) the grade should be D
- When the point is less than 60 the grade should be F
- Example output (First Name = Ziya Last Name = Yilmaz Grade: A )
     */
    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);

        System.out.println("Enter student's First Name: ");
        String firstName = scan.next();
        System.out.println("Enter Student's Last Name: ");
        String lastname = scan.next();
        System.out.println("Enter student's points: ");
      double points = scan.nextDouble();

        if (points < 0 || points > 100) {
            System.out.println("The Point is Not Valid");
        } else if (points >= 90) {
            System.out.println("First Name = " + firstName + " Last Name = " + lastname + " Grade: A");
        } else if (points >= 80) {
            System.out.println("First Name = " + firstName + " Last Name = " + lastname + " Grade: B");
        } else if (points >= 70) {
            System.out.println("First Name = " + firstName + " Last Name= " + lastname + " Grade: C");
        } else if (points >= 60) {
            System.out.println("First Name = " + firstName + " Last Name = " + lastname + " Grade: D");
        } else {
            System.out.println("First Name = " + firstName + " Last Name = " + lastname + " Grade: D");
        }
    }
}