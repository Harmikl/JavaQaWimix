package objects;

public class Dogs extends Animals {
    public Dogs(String kind, String name, int age) {
        super(kind, name, age);
    }

    @Override
    public void overloading(){
        System.out.println("I've'override overloading method for dogs class");
    }
}
