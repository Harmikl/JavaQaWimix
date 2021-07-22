package objects;


import java.util.Objects;

public class ObjectsEquals {
    int q =1;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ObjectsEquals that = (ObjectsEquals) o;
        return q == that.q;
    }

    @Override
    public int hashCode() {
        return Objects.hash(q);
    }

    public static void main(String[] args) {

        ObjectsEquals objects = new ObjectsEquals();
        ObjectsEquals objects1 = new ObjectsEquals();
        System.out.println(objects.equals(objects1));
        System.out.println(objects.hashCode());
        System.out.println(objects1.hashCode());
    }


}





