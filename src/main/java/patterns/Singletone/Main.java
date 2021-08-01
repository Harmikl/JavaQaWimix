package patterns.Singletone;

public class Main {
    public static void main(String[] args) {
        Singletone soutSingletone = Singletone.getMySingleton();
        Singletone soutSingletoneAgain = Singletone.getMySingleton();
    }
}
