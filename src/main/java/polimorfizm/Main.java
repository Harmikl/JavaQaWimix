package polimorfizm;

public class Main {
    public static void main(String[] args) {
        Human human = new Man(); //создали обькет класса Human в классе Man
        Man man = new Man(); // создали обькет класса man в классе Man
        human.eat(); //в классе Human нет метода manIsBrutal иными словами когда мы создаем обьект родительского класса,
        //мы не имеем доступ к полям и методам класса - наследника
        man.manIsBrutal();//в классе Man есть  метод manIsBrutal иными словами когда мы создаем обьект класса- наследника,
        //мы  имеем доступ к полям и методам класса - наследника и класса-родителя
    }

    public static void test(Human human){
        human.eat();
    }
}
