import java.util.Scanner;
public class demoInherit {
    public static void main(String[] args) {
        int nquestions;
        int nmissed;
        Scanner inp = new Scanner(System.in); System.out.println("Enter Number of Questions");
        nquestions = inp.nextInt();
        System.out.println("Eneter Number of missed Questions"); nmissed = inp.nextInt();
        FinalExam exam1 = new FinalExam(nquestions, nmissed); // with inheritance object is created for sub class
        System.out.println("Points for each Question is exam1: "+exam1.getPointsEach());
        System.out.println("Lettergade for exam1: "+exam1.getGrade());
    }
}