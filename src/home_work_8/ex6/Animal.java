package home_work_8.ex6;

import java.util.Objects;

public class Animal {
    private String name;
    private int age;
    private boolean tail;

    public Animal(String name, int age, boolean tail) {
        this.name = name;
        this.age = age;
        this.tail = tail;
    }

    @Override
    public String toString() {
        return "Ім'я: " + name  +
                ", вік: " + age +
                ", хвіст: " + (tail ? "так" : "ні");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Animal animal = (Animal) o;
//        return age == animal.age && tail == animal.tail && Objects.equals(name, animal.name);
        return age == animal.age
                && tail == animal.tail
                && (name == animal.name || (name != null && name.equals(animal.name)));
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, tail);
    }
}

