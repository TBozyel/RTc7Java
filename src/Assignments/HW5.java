package Assignments;

public class HW5 {

        //Write a code where it has variable double data type named Temp.
        //check if Temp is So Cold, Cold, Good, Hot or So Hot.
        //If Temp is less than 10== > print "The Weather is So Cold"
        //If Temp is between 10 and 40 == > print "The Weather is Cold"
        //If Temp is  between 40 and 70 == > print "The Weather is Good"
        //If Temp is between 70-90 == > print "The Weather is Hot"
        //If Temp is greater than 90 == > print "The Weather is So Hot"

        public static void main(String[] args) {
            double Temp = 25;
            if (Temp < 10) {
                System.out.println("The Weather is So Cold");
            }
            if (Temp >= 10 && Temp<40){
                System.out.println("The Weather is Cold");
            }
            if (Temp >= 40 && Temp<70){
                System.out.println("The Weather is Good");
            }
            if (Temp >= 70 && Temp <90){
                System.out.println("The Weather is Hot");
            }
            if (Temp > 90) {
                System.out.println("The Weather is So Hot");
            }

        }

                    }