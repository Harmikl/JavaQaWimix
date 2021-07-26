package collection;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Person> list = new ArrayList<>();
        Person person0 = new Person("Oleg");
        Person person1 = new Person("Nikita");

        list.add(person0);
        list.add(person1);

        list.get(0);

        System.out.println(list.contains(person1));

    }
}
