package collection;

import java.util.ArrayList;
import java.util.List;

/**
 * created by maksimkharmak , 3.08.21
 */
public class Test {
    public static void main(String[] args) {
        List<Integer> arrayList = new ArrayList<>();
        for (int i=0;i<10; i++){
            arrayList.add(i);
        }
        System.out.println(arrayList);

        arrayList.remove(4);

        System.out.println(arrayList);
    }

}
