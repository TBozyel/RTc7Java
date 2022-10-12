package Day3_OperationsandStrings;

public class Topic2_Strings {
    public static void main(String[] args) {
        //String-not-primitive data type. Can hold multiple values
        //Datatype name = a value

        String strng1 = "Some String Text";
        System.out.println(strng1);

        String prag = "This is a paragraph";
        System.out.println(prag);

        String spc = "6758940&%%&*(?>>:";
        System.out.println(spc);

        String numbers = "7578"; //this is not a number anymore, it's text
        System.out.println(numbers);

        // combine 2 text
        String txt1 = "This is text 1 ";
        String txt2 = "This is text 2";
        String txt3 = txt1+txt2;
        System.out.println(txt3);

        String stg2 = "98";
        String stg3 ="80";
        String stg4 = stg2+stg3;
        System.out.println(stg4);

        System.out.println("This is Hello World\t" + "This is the second hello World");

        int i8 = 89;
        System.out.println("This is the number from int: "+i8);



    }





}
