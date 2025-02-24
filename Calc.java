public class Calc {
    //Private data fields for the numbers
    private double num1;
    private double num2;

    //Setter methods to assign values to num1 and num2
    public void setNum1(double num1) {
        this.num1 = num1;
    }

    public void setNum2(double num2) {
        this.num2 = num2;
    }

    //Getter methods to retrieve values of num1 and num2
    public double getNum1() {
        return num1;
    }

    public double getNum2() {
        return num2;
    }

    //Method to add num1 and num2
    public double add() {
        return num1 + num2;
    }

    //Method to subtract num2 from num1
    public double subtract() {
        return num1 - num2;
    }

    //Method to multiply num1 and num2
    public double multiply() {
        return num1 * num2;
    }

    //Method to divide num1 by num2
    public double divide() {
        if (num2 != 0) {
            return num1 / num2;
        } else {
            System.out.println("Error: Division by zero is not allowed.");
            return 0;
        }
    }

    //Override the toString() method to display num1 and num2
    @Override
    public String toString() {
        return "Displaying private data fields using toString():\n" +
                "Num1: " + num1 + "\n" +
                "Num2: " + num2;
    }
}
