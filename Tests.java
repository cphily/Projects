import java.util.Scanner;
import java.text.DecimalFormat;

public class Tests {
    //Private fields that hold test scores sum and count
    private double sum = 0;
    private int count = 0;

    //Constructor
    public Tests() {
    }

    //Gets the average of test scores
    public void getAverage() {
        Scanner scanner = new Scanner(System.in);

        //Prompts the user to input test scores
        System.out.println("Enter test scores (enter -1 to quit):");

        double score;

        //Loop to enter test scores
        while (true) {
            score = scanner.nextDouble();

            if (score == -1) {
                break;
            }

            sum += score;
            count++;
        }

        scanner.close();
    }

    //Returns the average
    public String toString() {
        DecimalFormat df = new DecimalFormat("0.00");
        double average = (count == 0) ? Double.NaN : sum / count;
        return "The average of the " + count + " scores entered is " + df.format(average) + ".";
    }
}


