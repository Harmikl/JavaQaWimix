package objects;

public class Girls extends Human{
    public static void main(String[] args) {
        Girls girls = new Girls("Alesya",65);
    }

    public Girls(String MyName, int MyWeight){

        super(MyName,MyWeight);

        System.out.println(MyName+" "+MyWeight+" ");
    }
}
