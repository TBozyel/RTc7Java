package Day5_IfElseStatements;

public class Topic6_ifElseexmpl {
    public static void main(String[] args) {
        //check if a student will be accepted to school;
        //1) SAT score must be 90 or more
        //2) writing skill 5 or above;
        double stScore = 90;
        int wrScore = 7;
        if(stScore>=90 && wrScore>=5){
            System.out.println("Student can be accepted");
        }else{
            System.out.println("the student is rejected");
        }
    }
}
