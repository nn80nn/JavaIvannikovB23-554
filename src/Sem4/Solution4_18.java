package Sem4;

import java.util.ArrayList;
import java.util.List;

public class Solution4_18 {
    public static void main(String[] args) {
        List<Person> plot = new ArrayList<Person>();
        plot.add(new Person("Репка", "Репку"));
        plot.add(new Person("Дедка", "Дедку"));
        plot.add(new Person("Бабка", "Бабку"));
        plot.add(new Person("Внучка", "Внучку"));
        RepkaStory.tell(plot);
    }

    public static class Person implements RepkaItem {
        private String name;
        private String namePadezh;

        public Person(String name, String namePadezh) {
            this.name = name;
            this.namePadezh = namePadezh;
        }

        public String getNamePadezh() {
            return namePadezh;
        }

        @Override
        public void pull(Person person) {
            System.out.println(name + " за " + person.getNamePadezh());
        }
    }

    public interface RepkaItem {
        void pull(Person person);
    }

    public static class RepkaStory {
        public static void tell(List<Person> plot) {
            for (int i = plot.size() - 1; i > 0; i--) {
                Person person = plot.get(i);
                Person nextPerson = plot.get(i - 1);
                person.pull(nextPerson);
            }
        }
    }
}