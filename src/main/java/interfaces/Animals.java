package interfaces;

public class Animals implements Info {
     int id;

    public Animals(int id) {
        this.id = id;
    }

    public void sleep(){
        System.out.println("I am sleeping");
    }
    @Override
    public void showInfo() {
        System.out.println("My Id is - "+this.id);
    }
}
