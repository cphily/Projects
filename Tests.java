import java.text.DecimalFormat;

public class Tests {
    public static void main(String[] args) {
        double testScore1 = 88.2;
        double testScore2 = 78.9;
        double testScore3 = 97.6;

        double average = (testScore1 + testScore2 + testScore3) / 3;

        DecimalFormat df = new DecimalFormat("0.00");

        System.out.println("Test score 1:   " + testScore1);
        System.out.println("Test score 2:   " + testScore2);
        System.out.println("Test score 3:   " + testScore3);
        System.out.println("The average of 3 test scores is:  " + df.format(average));
    }
}

