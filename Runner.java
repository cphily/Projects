import java.util.Scanner;

public class Runner {
    public static void main(String[] args) {
        // Creates the first Pet object using the default constructor
        Pet pet1 = new Pet();
        System.out.println(pet1);

        // Creates the second Pet object using the custom constructor
        Pet pet2 = new Pet("Buster", "Dog", 11);
        System.out.println(pet2);

        // Scanner for user input
        Scanner scanner = new Scanner(System.in);

        // Creates the third Pet object with user input
        System.out.print("Enter animal type: ");
        String type = scanner.nextLine();

        System.out.print("Enter animal name: ");
        String name = scanner.nextLine();

        System.out.print("Enter animal age: ");
        int age = scanner.nextInt();

        Pet pet3 = new Pet(name, type, age);
        System.out.println(pet3);

        // Closes scanner
        scanner.close();
    }
}
