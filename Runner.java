// src/Runner.java
import java.util.Scanner;

public class Runner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of disks (keep it small, e.g. 3): ");
        int n = scanner.nextInt();
        System.out.println("\nTowers of Hanoi solution:");
        Towers.move(n, 'A', 'C', 'B');
        scanner.close();
    }
}
