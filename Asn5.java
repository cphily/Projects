import java.util.ArrayList;

public class Asn5 {
    public static void main(String[] args) {
        //Creates first ArrayList for Strings
        ArrayList<String> stringList = new ArrayList<>();
        stringList.add("Apple");
        stringList.add("Banana");
        stringList.add("Cherry");
        stringList.add("Date");

        //Creates second ArrayList for Integers
        ArrayList<Integer> intList = new ArrayList<>();
        intList.add(10);
        intList.add(20);
        intList.add(30);
        intList.add(40);

        //Displays contents using different loops
        System.out.println("String List:");
        for (int i = 0; i < stringList.size(); i++) {
            System.out.print(stringList.get(i) + " ");
        }
        System.out.println();

        System.out.println("Integer List:");
        for (Integer num : intList) {
            System.out.print(num + " ");
        }
        System.out.println();

        //Tries out two more methods
        stringList.remove("Cherry"); // Removing an element
        intList.add(50); // Adding another element

        //Displays updated lists using forEach method
        System.out.println("Updated String List:");
        stringList.forEach(item -> System.out.print(item + " "));
        System.out.println();

        System.out.println("Updated Integer List:");
        intList.forEach(num -> System.out.print(num + " "));
        System.out.println();
    }
}

