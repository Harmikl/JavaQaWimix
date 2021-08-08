package serialization;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.*;

/**
 * created by maksimkharmak , 8.08.21
 */
public class WriteObject  {
    public static void main(String[] args) throws IOException {
//        Person Max = new Person(1,"Max",30,"QA");
//        Person Katya = new Person(2,"Kate",21,"Designer");
//        Person Nastya = new Person(3,"Nastya",31,"QA automation");
//        Person Andrey = new Person(4,"Andrey",36,"QA automation");
//        Person Bob = new Person(5,"Bob",33,"Dev");
//
//        FileOutputStream fileOutputStream = new FileOutputStream("people.json");
//        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
//        objectOutputStream.writeObject(Max);
//        objectOutputStream.writeObject(Katya);
//        objectOutputStream.writeObject(Nastya);
//        objectOutputStream.writeObject(Andrey);
//        objectOutputStream.writeObject(Bob);
//
//        objectOutputStream.close();


        ObjectMapper mapper = new ObjectMapper();
        mapper.writeValue(new File("src/main/java/serialization/people.json"),
                new Person(1,"Max",30,"QA"));

        ObjectMapper mapper1 = new ObjectMapper();
        mapper.writeValue(new File("src/main/java/serialization/people1.json"),
                new Person(2,"Kate",21,"Designer"));

        ObjectMapper mapper2 = new ObjectMapper();
        mapper.writeValue(new File("src/main/java/serialization/people2.json"),
                new Person(3,"Nastya",33,"QA"));

        ObjectMapper mapper3 = new ObjectMapper();
        mapper.writeValue(new File("src/main/java/serialization/people3.json"),
                new Person(4,"Andrey",36,"QA"));

        ObjectMapper mapper4 = new ObjectMapper();
        mapper.writeValue(new File("src/main/java/serialization/people4.json"),
                new Person(5,"Bob",39,"Dev"));
    }
}
