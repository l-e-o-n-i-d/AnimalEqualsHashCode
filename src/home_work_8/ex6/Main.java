package home_work_8.ex6;

public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal(null, 45, false);
        Animal animal1 = new Animal("Васька", 45, false);
        Animal animal2 = new Animal("Васька", 45, false);
        Animal animal3 = animal2;
        System.out.println(animal);
        System.out.println(animal1);
        System.out.println(animal.equals(animal1));
        System.out.println(animal.hashCode());
        System.out.println(animal1.equals(animal2));
        System.out.println(animal1.hashCode());
        System.out.println(animal2.hashCode());
        System.out.println(animal1 == animal3);
        System.out.println(animal1.equals(animal3));
    }
}
