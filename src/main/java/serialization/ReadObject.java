package serialization;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.*;

/**
 * created by maksimkharmak , 8.08.21
 */
public class ReadObject {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
//        FileInputStream fileInputStream = new FileInputStream("people.json");
//        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
//
//        Person Max = (Person) objectInputStream.readObject();
//        Person Katya = (Person) objectInputStream.readObject();
//        Person Nastya = (Person) objectInputStream.readObject();
//        Person Andrey = (Person) objectInputStream.readObject();
//        Person Bob = (Person) objectInputStream.readObject();
//
//        System.out.println(Max);
//        System.out.println(Katya);
//        System.out.println(Nastya);
//        System.out.println(Nastya);
//        System.out.println(Andrey);
//        System.out.println(Bob);
//
//        objectInputStream.close();


        ObjectMapper mapper = new ObjectMapper();
        Person Max = mapper.readValue(new File("src/main/java/serialization/people.json"),Person.class);
        ObjectMapper mapper1 = new ObjectMapper();
        Person Katya = mapper1.readValue(new File("src/main/java/serialization/people1.json"),Person.class);
        ObjectMapper mapper2 = new ObjectMapper();
        Person Nastya = mapper2.readValue(new File("src/main/java/serialization/people2.json"),Person.class);
        ObjectMapper mapper3 = new ObjectMapper();
        Person Andrey = mapper3.readValue(new File("src/main/java/serialization/people3.json"),Person.class);
        ObjectMapper mapper4 = new ObjectMapper();
        Person Bob = mapper4.readValue(new File("src/main/java/serialization/people4.json"),Person.class);
    }
}
