package objects;

public class Animals {
    String kind;
    String voice;
    int age;
    int weight;

    public Animals(String kind, String voice, int age, int weight) {
        this.kind = kind;
        this.voice = voice;
        this.age = age;
        this.weight = weight;
    }

    public Animals() {
    }

    public void overloading() {
        System.out.println("It's a method without method overloading ");
    }

    public void overloading(String voice, int age) {
        this.voice = voice;
        this.age = age;
        System.out.println("It's a method with method overloading (name and age)  and My name is " + voice + " " + "and I am " + age + " years old");
    }

    public void overloading(String kind, String voice, int age) {
        this.kind = kind;
        this.voice = voice;
        this.age = age;
        System.out.println("It's a method with method overloading (kind, name and age) and My name is " + voice + " " + "and I am " + age + " years old and Iam a " + kind);
    }

    public void overloading(String kind, String voice, int age, int weight) {
        this.kind = kind;
        this.voice = voice;
        this.age = age;
        this.weight = weight;
        System.out.println("It's a method with method overloading (kind, name and age) and My name is " + voice + " " + "and I am " + age + " years old and Iam a " + kind);
    }

}
