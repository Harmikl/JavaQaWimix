/**
 * created by maksimkharmak , 20.08.21
 */
public class Test {
    private final static String LOGIN = "571854";
    private final static String PASSWORD = "Trader33";

    public static void main(String[] args) {

        String body = String.format("{\"email\": \"%s\"," +
                        "\"password\": \"%s\"}",
                LOGIN,
                PASSWORD);
        System.out.println(body);
    }
}
