package patterns.Strategy;

public class UserSignUp implements SignUpStrategy {

    @Override
    public void makeSignUp() {
        System.out.println("[User] sign up");
    }
}