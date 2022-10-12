package Day5_IfElseStatements;

public class Topic4_IfStatementCont {
    public static void main(String[] args) {
        int num1 = 96;
        int num2 = 35;

        int ans = num1-num2;
        if(ans>0){
            System.out.println("the answer is positive and the answer :"+ans);
        }
        if(ans<0){
            System.out.println("the answer is negative and the answer is: "+ans);
        }
        if(ans == 0){
            System.out.println("the answer is 0");
        }
    }
}
