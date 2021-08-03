package interfaces;

/**
 * created by maksimkharmak , 3.08.21
 */
public class Person  implements Info{  /* implements Info означает что класс теперь обязан использовать метод
 shownInfo() в интерфейсе Info*/
    String name;
    public Person(String name){
        this.name=name;
    }
    public void sayHello(){
        System.out.println("Hello ");
    }

    @Override
    public void showInfo() {
        System.out.println("My name is "+ this.name);
    }
}
