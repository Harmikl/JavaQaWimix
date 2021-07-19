package objects;

import objects.Human;

public class ManAndWoman extends Human {


    public ManAndWoman(String MyName, int MyWeight) {
        super(MyName, MyWeight);
    }

    public void ManAnaWoman() {

        Human man = new Human("hhh",10);
        man.weight = 170;
        man.name = "Max";

        Human woman = new Human("Masha",150);
        Human woman2 = new Human("Olya",180);

        System.out.println(man.name + " "+ man.weight);
        System.out.println(woman.name + " "+ woman.weight);
        System.out.println(woman2.name + " "+ woman2.weight);

    }

}
