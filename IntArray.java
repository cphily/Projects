import java.util.Arrays;
import java.util.Random;

public class IntArray {
    private int length;
    private int[] myArray;

    //Constructor to initialize the array with a given length
    public IntArray(int l) {
        this.length = l;
        this.myArray = new int[l];
    }

    //Fills the array with random numbers between 1 and 6
    public void fillRand() {
        Random rand = new Random();
        for (int i = 0; i < length; i++) {
            myArray[i] = rand.nextInt(6) + 1;
        }
    }

    //Returns the value at a specific index
    public int get(int element) {
        if (element >= 0 && element < length) {
            return myArray[element];
        } else {
            throw new IndexOutOfBoundsException("Invalid index: " + element);
        }
    }

    //Sets a specific element to a new value
    public void set(int element, int newValue) {
        if (element >= 0 && element < length) {
            myArray[element] = newValue;
        } else {
            throw new IndexOutOfBoundsException("Invalid index: " + element);
        }
    }

    //Returns the size of the array
    public int size() {
        return length;
    }

    //Checks if the array is empty
    public boolean isEmpty() {
        return length == 0;
    }

    //Clears the array by setting all elements to 0
    public void clear() {
        Arrays.fill(myArray, 0);
    }

    //Sorts the array in ascending order
    public void sort() {
        Arrays.sort(myArray);
    }

    //Returns a string representation of the array
    @Override
    public String toString() {
        return Arrays.toString(myArray);
    }
}

