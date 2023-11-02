package Sem4;

public class Solution4_7 {
    public static void main(String[] args) {
        Cat cat = new Cat();
        Dog dog = new Dog();

        System.out.println(cat.getName());
        System.out.println(cat.getChild().getName());

        System.out.println(dog.getName());
        System.out.println(dog.getChild().getName());
    }

    public static abstract class Pet {
        public abstract String getName();
        public abstract Pet getChild();
    }

    public static class Cat extends Pet {
        @Override
        public String getName() {
            return "Cat";
        }

        @Override
        public Pet getChild() {
            return new Cat();
        }
    }

    public static class Dog extends Pet {
        @Override
        public String getName() {
            return "Dog";
        }

        @Override
        public Pet getChild() {
            return new Dog();
        }
    }
}