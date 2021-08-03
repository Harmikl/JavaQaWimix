package collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Person> list = new ArrayList<>();
        Person person0 = new Person("Oleg");
        Person person1 = new Person("Nikita");
        Person person2 = new Person("Ihor");
        Person person3 = new Person("Max");

        list.add(person0);
        list.add(person1);
        list.add(person2);
        list.add( person3);
        list.stream().forEach(person -> System.out.println(person.getName()));


        System.out.println(list.contains(person0));
        System.out.println(list.get(0));
        System.out.println(list.size());
        System.out.println(list.indexOf(person2));

        LinkedList<Person> linkedList = new LinkedList<>();
        linkedList.add(person0);
        linkedList.add(person1);
        linkedList.add(person2);
        linkedList.add(person3);
    }
}
