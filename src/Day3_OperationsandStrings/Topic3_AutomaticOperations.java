package Day3_OperationsandStrings;

import java.util.Arrays;

public class Topic3_AutomaticOperations {
    public static void main(String[] args) {
        //(+) Addition
        int i1 = 90;
        int i2 = 80;
        int i3 = i1+i2;
        System.out.println("The result : " +i3);
        System.out.println(i2+i1);
        System.out.println("This is the result in different way : " +(i1+i2));

        int i4 = 300;
        float fl1 = 98.79f;
        float fl2 = i4+fl1;
        System.out.println("the result : " +fl2);

        double d7 = 98.764;
        int i5 = 900;
        double d9 = d7+i5;
        System.out.println("The result for double class is: "+d9);

        //(-) subtraction
        int num10=67;
                int num11 = 9000;
                int result = num10-num11;
        System.out.println("the result is = "+result);

        //(*) multiplication
        int num12 = 95;
        int num13 = 98;
        int result1 = num13*num12;
        System.out.println("the result of multiplication is : "+result1);

// (/) division
        int num16 = 89;
        int num17 = 40;
        float nresult = (float)num16/num17;
        System.out.println(nresult);

double num18 = 89.78909098;
        double num21 = 3.678;
        double result8 = num18/num21;
        System.out.println("the result 8 is : "+result8);

        // (%) modulus (mod) // gets the remainder of the devision
        int num22 = 98;
        int num23 = 3;
        int num24 = num22%num23;
        System.out.println("the result of mod : "+num24);

double num25 = 90.45;
double num26  = 8.56;
double modres = num25%num26;
        System.out.println("The mode result for double : "+modres);

        
    }
}
