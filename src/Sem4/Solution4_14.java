package Sem4;

public class Solution4_14 {
    public static void main(String[] args) {
        System.out.println(Dream.HOBBY.toString());
        System.out.println(new Hobby().INDEX);
    }

    interface Desire {}

    interface Dream extends Desire {
        Hobby HOBBY = new Hobby();
    }

    static class Hobby implements Dream {
        static int INDEX = 1;

        @Override
        public String toString() {
            INDEX++;
            return "" + INDEX;
        }
    }
}