package collection;

import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        List<Person> list = new ArrayList<>();
        Person person0 = new Person("Oleg");
        Person person1 = new Person("Nikita");
        Person person2 = new Person("Ihor");
        Person person3 = new Person("Max");

        list.add(person0);
        list.add(person1);
        list.add(person2);
        list.add(person3);

        Person Ihor = list.stream().filter(person ->
            person.getName().equals("Ihor")
        ).findAny().orElseThrow(Exception::new);

        System.out.println(Ihor.getName());

        list.stream().forEach(person ->{
            if (person.getName().equals("Ihor")){
                System.out.println("I am found Ihor");
            }
        });

//
//        System.out.println(list.contains(person0));
//        System.out.println(list.get(0));
//        System.out.println(list.size());
//        System.out.println(list.indexOf(person2));
//
//        LinkedList<Person> linkedList = new LinkedList<>();
//        linkedList.add(person0);
//        linkedList.add(person1);
//        linkedList.add(person2);
//        linkedList.add(person3);
    }
}
