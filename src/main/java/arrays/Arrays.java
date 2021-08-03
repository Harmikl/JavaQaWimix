package arrays;

import java.nio.charset.StandardCharsets;
import java.util.Locale;

public class Arrays {
    public static void main(String[] args) {
        int[] numbers = new int[10]; //просто создали массив с пустыми ячейками
        for (int a = 0; a < numbers.length; a++ ){
            numbers[a] = a+1; // обращаемся к индексу массива и помещаем туда a+1
            System.out.println(numbers[a]);
        }
        System.out.println();
        int [] newNumber = {1,3,5,6}; // создали массив и поместили в него значения
        for (int a=0; a < newNumber.length;a++){
            System.out.println(newNumber[a]);
        }

        int [] a = new int[5];
        a[0]=1;
        System.out.println(a[0]);

        String[] strings = new String[3];
        strings[0]="Привет ";
        strings[1]="из космоса, ";
        strings[2]="ребята";

        for (int i=0;i< strings.length;i++) {
            System.out.println(strings[i]);
        }
        System.out.println();

        for (String foreach:strings // String- тип переменной, foreach имя переменной, :strings - имя массива
             ) {
            System.out.println(foreach);
        }
        System.out.println();

        for (String foreach:strings // String- тип переменной, foreach имя переменной, :strings - имя массива
        ) {
            System.out.println(foreach.toUpperCase(Locale.ROOT));
        }

        int[] some_numbers = {1,5,9,0};
        int sum=0;
        for (int x:some_numbers
             ) {
            sum = sum+x; // вывести сумму всех чисел
        }
        System.out.println(sum);
    }
}
