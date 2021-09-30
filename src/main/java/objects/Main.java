package objects;

import static objects.Crow.someCrows;

public class Main {
    public static void main(String[] args) {
//        Cats cats = new Cats("Cat","Mike",5);
//        cats.catOverloading();
//        cats.catOverloadingWithNameAndAge();
//        cats.catOverloadingWithKindNameAndAge();
//        cats.useSuperInVariables();
//        cats.overloading();
//
//        Dogs dogs = new Dogs("Dog","PitBull",6);
//        Dogs dogs2 = new Dogs("Dog","PitBull",6);
//        System.out.println(dogs.equals(dogs2));
//        someCrows();

        String str = "Java is a mood thinm 111";
        String str1 = str.replaceAll("m","g");
        String str2 = str1.replaceAll("\\S+","0");// заменил все не пробелы на 0
        String str3 = str1.replaceAll("\\s+","-"); // заменил все пробелы на '-'
        String str4 = str3.replaceAll("\\W+"," "); // заменил любой символ, кроме буквенного, цифрового или знака подчёркивания на пробел
        String str5 = str1.replaceAll("\\d+","!!!");// заменил цифровые символы на !!!
        String str6 = str5.replaceAll("^[a-zA-Z]{4}","Relaxing massage ");// заменил слово из 4 латинских символов сначала строки
        String str7 = str.replaceAll("a","");

        System.out.println(str);
        System.out.println(str1);
        System.out.println(str2);
        System.out.println(str3);
        System.out.println(str4);
        System.out.println(str5);
        System.out.println(str6);
        System.out.println(str7);
    }

}
