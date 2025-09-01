package ex06_1_exercise;

public class PetMain {

    public static void main(String[] args) {
        Animal a; // Declares a variable a of type Animal (likely a superclass or interface).
        //test a spider with a spider reference
        Spider s = new Spider();
        s.eat(); // Calls eat() and walk() methods on the spider object directly.
        s.walk();
        //test a spider with an animal reference
        a = new Spider(); // Creates a new Spider object, but stores it in an Animal reference (a).
        a.eat(); // Calls eat() and walk() on the spider using the Animal reference (polymorphism at play).
        a.walk();

        Pet p; // Declares a variable p of type Pet (likely an interface or abstract class).

        Cat c = new Cat("Tom"); // Creates a Cat object named "Tom" using the Cat reference.
        c.eat(); // Calls eat(), walk(), and play() on the cat object directly.
        c.walk();
        c.play();

        a = new Cat();
        a.eat();
        a.walk();

        p = new Cat();
        p.setName("Mr. Whiskers");
        p.play();

        Fish f = new Fish();
        f.setName("Guppy");
        f.eat();
        f.walk();
        f.play();

        a = new Fish();
        a.eat();
        a.walk();

        playWithAnimal(s); // Calls the playWithAnimal() method with a spider, a cat, and a fish. This method checks if the animal is also a pet and lets it play; otherwise, warns of a wild animal.
        playWithAnimal(c);
        playWithAnimal(f);
    }
    
    public static void playWithAnimal(Animal a) { // Accepts any Animal.
        if(a instanceof Pet) {
            Pet p = (Pet)a;
            p.play();
        } else {
            System.out.println("Danger! Wild Animal");
        }
    }
    
}

// This code demonstrates polymorphism, inheritance, and interfaces using a simple pet simulation:
//
//It tests different animal objects (Spider, Cat, Fish) through their own class, superclass (Animal), and interface (Pet) references.
//
//The playWithAnimal() method safely plays with pets and warns about wild animals like spiders.
//
//Concepts illustrated:
//
//Dynamic method dispatch
//
//instanceof checks and downcasting
//
//Interface usage (Pet)
//
//Method overriding (eat(), walk(), play())