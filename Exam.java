public class Exam extends Assessment {
    private int totalQuestions; // Total number of questions
    private int numMissed;      // Number of questions missed

    // Constructor initializes the total number of questions and missed questions
    public Exam(int questions, int missed) {
        this.totalQuestions = questions;
        this.numMissed = missed;

        // Calculates the score based on missed questions
        int score = (totalQuestions - numMissed) * 100 / totalQuestions;
        setScore(score); // Set the calculated score using the inherited setScore method
    }

    // Method that gets the number of missed questions
    public int getNumMissed() {
        return this.numMissed;
    }

    // Method that calculates and returns points each question is worth
    public int getPointsEach() {
        return 100 / totalQuestions; // Each question is worth an equal share of 100 points
    }
}
