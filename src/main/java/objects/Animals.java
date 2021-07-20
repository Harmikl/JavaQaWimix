package objects;

public class Animals {
    String kind;
    String name;
    int age;

    public Animals(String kind, String name, int age) {
        this.kind = kind;
        this.name = name;
        this.age = age;
        System.out.println("I am an animal constructor");
    }

    public void overloading(){
        System.out.println("It's a method without method overloading ");
    }

    public void overloading(String name, int age){
        this.name = name;
        this.age = age;
        System.out.println("It's a method with method overloading (name and age)  and My name is "+name+" "+ "and I am "+age+" years old" );
    }

    public void overloading(String kind, String name, int age){
        this.kind = kind;
        this.name = name;
        this.age = age;
        System.out.println("It's a method with method overloading (kind, name and age) and My name is "+name+" "+ "and I am "+age+" years old and Iam a "+kind );
    }

}
