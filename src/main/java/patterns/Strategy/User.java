package patterns.Strategy;

public class User extends BaseUser {

    public User() {
        super(new UserSignUp());
    }
}