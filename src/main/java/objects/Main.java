package objects;

public class Main {
    public static void main(String[] args) {
        Cats cats = new Cats("Cat","Mike",5);
        cats.catOverloading();
        cats.catOverloadingWithNameAndAge();
        cats.catOverloadingWithKindNameAndAge();
        cats.useSuperInVariables();
        cats.overloading();

        Dogs dogs = new Dogs("Dog","PitBull",6);
        Dogs dogs2 = new Dogs("Dog","PitBull",6);
        dogs.overloading();
        System.out.println(dogs.equals(dogs2));
    }

}
