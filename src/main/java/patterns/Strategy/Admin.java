package patterns.Strategy;

public class Admin extends BaseUser {

    public Admin() {
        super(new AdminSignUp());
    }


}