package objects;

import java.util.Objects;

public class Crow extends Birds{
    int q =1;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Crow crow = (Crow) o;
        return q == crow.q;
    }

    @Override
    public int hashCode() {
        return Objects.hash(q);
    }

    public Crow(String kind, String voice, int age, int weight) {
        super(kind, voice, age, weight);
    }

    public static void someCrows(){
        Crow crow1 = new Crow("Crow","Crooooow",1,21);
        Crow crow2 = new Crow("Crow","Crooooow",2,22);
        Crow crow3 = new Crow("Crow","Crooooow",3,23);
        Crow crow4 = new Crow("Crow","Crooooow",4,24);
        Crow crow5 = new Crow("Crow","Crooooow",5,25);
        System.out.println(crow1.equals(crow2));
        System.out.println(crow1.equals(crow3));
        System.out.println(crow1.equals(crow4));
        System.out.println(crow1.equals(crow5));
    }
}
