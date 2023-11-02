package Sem4;

public class Solution4_1 {
    public static void main(String[] args) {
        Pet pet1 = new Cat();
        Cat cat = (Cat) pet1.getChild();
        Pet pet2 = new Dog();
        Dog dog = (Dog) pet2.getChild();
    }

    public static abstract class Pet {
        public abstract Pet getChild();
    }

    public static class Cat extends Pet {
        @Override
        public Cat getChild() {
            return new Cat();
        }
    }

    public static class Dog extends Pet {
        @Override
        public Dog getChild() {
            return new Dog();
        }
    }
}