public class Pet {
    private String name;
    private String type;
    private int age;

    // Default constructor
    public Pet() {
        this.name = "Pet Name";
        this.type = "Animal";
        this.age = 1;
    }

    // Custom constructor
    public Pet(String name, String type, int age) {
        this.name = name;
        this.type = type;
        this.age = age;
    }

    // The setter and getter for name
    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    // The setter and getter for type
    public void setType(String type) {
        this.type = type;
    }

    public String getType() {
        return this.type;
    }

    // The setter and getter for age
    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return this.age;
    }

    // The method to return the sound based on the pet type
    public String speak() {
        if (this.type.equalsIgnoreCase("dog")) {
            return "Woof";
        } else if (this.type.equalsIgnoreCase("cat")) {
            return "Meow";
        } else {
            return "Noise";
        }
    }

    // toString method to return object state as a String
    @Override
    public String toString() {
        return "Pet information:\nType: " + this.type + "\nName: " + this.name + "\nSound: " + speak() + "\nAge: " + this.age;
    }
}



