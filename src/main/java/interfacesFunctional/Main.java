package interfacesFunctional;

/**
 * created by maksimkharmak , 4.08.21
 */
public class Main {
    public static void main(String[] args) {
//        MyNewInterface myNewInterface=(a)->a+100;
//        System.out.println(myNewInterface.calculate(5));
        multiply(100,(b)->b+1);
    }
    public static void multiply(int a,MyNewInterface b){
        System.out.println(a+b.calculate(9));
    }
}
