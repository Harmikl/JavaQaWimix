package objects;

public class Cats extends Animals {
    public Cats(String kind, String voice, int age, int weight) {
        super(kind, voice, age, weight);
    }

    public void catOverloading(){
        this.overloading();
    }

    public void catOverloadingWithNameAndAge(){
        this.overloading("Jon",4);
    }

    public void catOverloadingWithKindNameAndAge(){
        this.overloading("Cat","Mike",2);
    }

    public void useSuperInVariables() {
        int age = super.age;
        String voice = super.voice;
        System.out.println("I use super in variables and my voice is "+voice+" and I am "+age+" years old");
    }

    @Override
    public void overloading(){
        System.out.println("I've'override overloading method for cats class");
    }

}
