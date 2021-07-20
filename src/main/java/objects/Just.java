package objects;

import java.util.Objects;

public class Just {


    Object obj1 = new Object();
    Object obj2 = new Object();

    public static void main(String[] args) {
        Just just = new Just();
        System.out.println(just.obj1.equals(just.obj2));
    }

}
