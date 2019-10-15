public class FinalExam extends GradeActivity { // sub class
    private int nQuestions; // Number of questions
    private double pointsEach; // Points for each question
    private int nMissed;

    public FinalExam(int questions, int missed) {
        double numericScore;
        nQuestions = questions;
        nMissed = missed;
        pointsEach = 100.0 / nQuestions;
        numericScore = 100 - (pointsEach * missed);
        setScore(numericScore); // setting the vlaue of score in Super class
    }

    double getPointsEach() {
        return pointsEach;
    }

    double getNumMissed() {
        return nMissed;
    }
}