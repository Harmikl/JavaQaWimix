package apiTest.Zegoal;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

/**
 * created by maksimkharmak , 31.08.21
 */
public class ApiTests {
    private static final RestService REST_SERVICE = new RestService();
    private static String token;

    @BeforeAll
    public static void getToken(){
        token = REST_SERVICE.getToken().getAccessToken();
    }

    @Test
    public void getUserSettings(){
        REST_SERVICE.getListOfSettings(token);
    }
}

