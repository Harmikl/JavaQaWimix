package objects;

import java.util.Objects;

public class Just {

int q =1;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Just just = (Just) o;
        return q == just.q;
    }


    public static void main(String[] args) {
        Just just = new Just();
        Just just2 = new Just();
        System.out.println(just.equals(just2));
    }
}
