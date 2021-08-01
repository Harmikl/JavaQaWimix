package patterns.Singletone;

public class Singletone {
    private static Singletone mySingleton;

    private Singletone() {
    }

    public static Singletone getMySingleton() {
        if (mySingleton == null) { //можно поставить брейкпоинты и посмотреть что при выполнении soutSingletone обьект
            //создался потому как  mySingleton не создан (равен null)
            // а вот при отработке soutSingletoneAgain будет видно что mySingleton не равен null поэтому условие внутри оператора
            // if не выполняется и просто возвращается mySingleton
            mySingleton = new Singletone();
        }
        return mySingleton;
    }
}
