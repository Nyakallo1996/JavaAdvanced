package ex06_1_exercise;

public class Cat extends Animal implements Pet{

    public String name; // Declares a public instance variable name to store the cat's name

    public Cat(String name) { // Constructor that accepts a name
        super(4); // Calls the Animal superclass constructor with 4 (number of legs)
        this.name = name;// Sets the cat's name
    }

    public Cat() {
        this("Fluffy");
    }// No-argument constructor. Uses constructor chaining to call the other constructor with "Fluffy" as the default name

    @Override
    public String getName() {
        return name;
    } // Overrides the getName() method from the Pet interface. Returns the cat’s name

    @Override
    public void setName(String name) {
        this.name = name;
    } // Overrides setName() from Pet. Sets the cat’s name

    @Override
    public void play() {
        System.out.println(name + " likes to play with string.");
    } // Overrides play() from Pet. Prints how the cat plays (with string)

    @Override
    public void eat() {
        System.out.println("Cats like to eat spiders and fish.");
    } // Overrides the eat() method from the Animal class. Specifies what cats like to eat
}
