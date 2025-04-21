// src/Towers.java
public class Towers {

    public static void move(int n, char from, char to, char aux) {
        if (n == 1) {

            System.out.printf("Move disk 1 from %c to %c%n", from, to);
        } else {

            move(n - 1, from, aux, to);

            System.out.printf("Move disk %d from %c to %c%n", n, from, to);

            move(n - 1, aux, to, from);
        }
    }
}

