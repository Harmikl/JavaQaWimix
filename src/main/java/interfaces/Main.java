package interfaces;

/**
 * created by maksimkharmak , 3.08.21
 */
public class Main {
    public static void main(String[] args) {
        Info animal1 = new Animals(1); /*  можем ссылать переменную типа Info на обьект класса Animals
        следовательно у нас будут досиупны методы только из интерфейса Info*/
        animal1.showInfo();

        Person person1 = new Person("Mike");/*  можем ссылать переменную типа Person на обьект класса Person
        следовательно у нас будут досиупны методы как из интерфейса Info, так и из интерфейса Person */
        person1.sayHello();
        person1.name="Mike";
        person1.showInfo();

        /* и  можем в метод showMeInfo скормить обьекты классов Animals и Person так как они реализуют
        интерфейс Info*/
        showMeInfo(animal1);
        showMeInfo(person1);
    }
    public static void showMeInfo(Info info){ /* так же можем создать метод который принимает нечто из класса Info*/
        info.showInfo();
    }

}
