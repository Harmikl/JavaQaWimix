package objects;

import java.util.Arrays;

public class Dogs extends Animals {
    public Dogs(String kind, String voice, int age, int weight) {
        super(kind, voice, age, weight);
    }
    public static void main(String[] args) {
        String[] users = new String[2];
        users[0]="max";
        users[1]="john";
        System.out.println("Hello, " + Arrays.toString(users));
    }
    public void dogsSaysGav(){
        System.out.println("Gav");
    }

}
