package Assignments;


        /*
        write a code where it check the credit score for a person.
The code should have First Name, Last name and Credit Score of a person. (think about what datatype of variables you need to use)
If a person have a credit score less then 500 == > print "<person First Name>  <Person Last Name> has Bad Credit Score"
if a person have credit between 500-700 ==> print "<person First Name>  <Person Last Name> has Average Credit Score"
if a person have credit between 700-750 ==> print "<person First Name>  <Person Last Name> has Good Credit Score"
if a person have credit between greater than 750==> print "<person First Name>  <Person Last Name> has Great Credit Score"
         */
        public class HW8 {
            public static void main(String[] args) {
        String FirstName = "Abdul ";
        String LastName = "Abi";
        int CreditScore = 800;
        if (CreditScore < 500){
            System.out.println(FirstName + LastName + " has Average Credit Score");
        }
        if(CreditScore >=500 && CreditScore <=700){
            System.out.println(FirstName + LastName + " has Average Credit Score");
        }
        if (CreditScore >=700 && CreditScore <=750){
            System.out.println(FirstName + LastName + " has Good Credit Score");}
        if (CreditScore >750 ) {
            System.out.println(FirstName + LastName + " has Great Credit Score");

        }

        }
}
