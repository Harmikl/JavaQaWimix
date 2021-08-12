package exception;

import java.util.Locale;

/**
 * created by maksimkharmak , 11.08.21
 */
public class SomeExceptions {
    public static void main(String[] args) throws MyException {
        String string = null;
        try {
            string.hashCode();
        }catch (NullPointerException e){
            System.out.println("Попытка извлечь hashCode из ничего");
        }
        /////////////////////////////////
        int[] ints = {1,2,3,4,5};
        try {
            ints[5]=1;
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Я вышел за пределы массива");

        }
        /////////////////////////////////
        try {
            int x = 1 / 0;
        }catch (ArithmeticException e){
            System.out.println("Я поделил на 0");
        }
        /////////////////////////////////
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        while (true){
            int x = Integer.parseInt(scanner.nextLine());
            if (x==5){
                throw new MyException("Я ввел число 5");
            }
        }
    }
}
