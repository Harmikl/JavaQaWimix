package patterns.Strategy;

public class AdminSignUp implements SignUpStrategy {

    @Override
    public void makeSignUp() {
        System.out.println("[Admin] sign up");
    }
}