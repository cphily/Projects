public class Runner {
    public static void main(String[] args) {
        // Instantiates an object of the Tests class
        Tests test = new Tests();

        // Calls the getAverage method to prompt user input and calculate the average
        test.getAverage();

        // Calls the toString method to display the results
        System.out.println(test.toString());
    }
}

