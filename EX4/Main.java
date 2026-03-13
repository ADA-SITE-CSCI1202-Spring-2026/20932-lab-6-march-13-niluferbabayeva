package EX4;

public class Main {
    public static void main(String[] args) {
        Animal a = new Animal("Buddy", "Alice", 3);
        System.out.println(a);

        Dog d = new Dog("Rex", "Bob", 5, "Labrador");
        System.out.println(d);

        System.out.println(a.equals(d));
    }
}