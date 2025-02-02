public class Pet {
    private String name;

    // Default constructor
    public Pet() {
        this.name = "Pet Name";  // Default name
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    // toString method to return object state as a String
    @Override
    public String toString() {
        return "Pet information:\nName: " + this.name;
    }


    public static void main(String[] args) {
        // Creating the first Pet object using the default constructor
        Pet pet1 = new Pet();
        System.out.println(pet1);

        // Creating the second Pet object and setting its name
        Pet pet2 = new Pet();
        pet2.setName("Buster");
        System.out.println(pet2); 
    }
}

