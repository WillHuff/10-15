public class GradeActivity { //base class
    private double score; // Numeric score
    public void setScore(double s){ //assigns value to score
        score=s;
    }
    public double getScore(){
        return score;
    } //returns the score
    public char getGrade(){ //obtains the letter grade
        char lgrade;
        if(score>=90) lgrade='A';
        else if (score>=80)
            lgrade='B';
        else if (score>=70)
            lgrade='C'; else if (score>=60) lgrade='D';
        else
            lgrade='F';
        return lgrade; } }