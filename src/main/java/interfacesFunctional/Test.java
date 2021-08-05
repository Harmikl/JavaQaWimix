package interfacesFunctional;

/**
 * created by maksimkharmak , 4.08.21
 */
public class Test {
    public static void main(String[] args) {
        Speak speak;
        speak=()->"Hello";
        System.out.println(speak.speak());
    }
}
