import java.util.Scanner;

public class Runner {
    public static void main(String[] args){
        //instantiates a Calc object
        Calc myCalculator = new Calc();
        Scanner scan = new Scanner(System.in);
        double n1 = 0, n2 = 0;

        //Gets user input for the first number with validation
        while (true) {
            System.out.println("Please enter the first number: ");
            String input = scan.nextLine();
            try {
                n1 = Double.parseDouble(input);
                break;
            } catch (NumberFormatException e) {
                System.out.println("Invalid input! Please enter a valid number.");
            }
        }

        //Gets user input for the second number with validation
        while (true) {
            System.out.println("Please enter the second number: ");
            String input = scan.nextLine();
            try {
                n2 = Double.parseDouble(input);
                break;
            } catch (NumberFormatException e) {
                System.out.println("Invalid input! Please enter a valid number.");
            }
        }

        //Passes the numbers to the Calc object
        myCalculator.setNum1(n1);
        myCalculator.setNum2(n2);

        //Output from Calc instance
        System.out.println(myCalculator);

        //Examines the instance private data fields by calling get methods
        System.out.println("Calling num1 get method: " + myCalculator.getNum1());
        System.out.println("Calling num2 get method: " + myCalculator.getNum2());

        //Calls Calc methods directly
        double sum = myCalculator.add();
        System.out.println("The sum is: " + sum);

        //Displays the difference, product, and quotient
        System.out.println("The difference is: " + myCalculator.subtract());
        System.out.println("The product is: " + myCalculator.multiply());
        System.out.println("The quotient is: " + myCalculator.divide());
    }
}
