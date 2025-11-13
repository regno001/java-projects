class Animal {
    void makeSound() { System.out.println("Animal sound"); }
    void describe() { System.out.println("This is an animal."); }
}
class Lion extends Animal {
    void makeSound() { System.out.println("Roar!"); }
    void describe() { System.out.println("Lion: The king of the jungle."); }
}
class Bird extends Animal {
    void makeSound() { System.out.println("Chirp!"); }
    void describe() { System.out.println("Bird: A small creature that can fly."); }
}
class Frog extends Animal {
    void makeSound() { System.out.println("Ribbit!"); }
    void describe() { System.out.println("Frog: An amphibian that lives in water and on land."); }
}
public class AnimalMain {
  public static void main(String[] args) {
        System.out.println("Name: rahul");
        System.out.println("Roll No: 47");
        System.out.println("Course: BCA G1");
        Animal a1 = new Lion();
        Animal a2 = new Bird();
        Animal a3 = new Frog();
        a1.makeSound(); a1.describe();
        a2.makeSound(); a2.describe();
        a3.makeSound(); a3.describe();
    }
}
