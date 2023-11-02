package Sem4;

public class Solution4_6 {
    public static void main(String[] args) {
        Cow cow = new Cow();
        System.out.println(cow.getName());
    }

    public static abstract class Animal {
        public abstract String getName();
    }

    public static class Cow extends Animal {
        @Override
        public String getName() {
            return "Cow";
        }
    }
}