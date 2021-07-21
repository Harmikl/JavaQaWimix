package objects;


import java.util.Objects;

public class ObjectsEquals {


    Object obj1 = new Object();
    Object obj2 = new Object();


    public static void main(String[] args) {
        ObjectsEquals objects = new ObjectsEquals();
        System.out.println(objects.obj1.equals(objects.obj2));
        System.out.println(objects.obj1.hashCode());
        System.out.println(objects.obj2.hashCode());
    }


}





