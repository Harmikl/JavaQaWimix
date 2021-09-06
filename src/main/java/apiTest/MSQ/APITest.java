package apiTest.MSQ;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.io.IOException;

import static apiTest.MSQ.RestServices.GENERATED_EMAIL;
import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * created by maksimkharmak , 22.08.21
 */
public class APITest extends TestRunner{
    private static final RestServices REST_SERVICES = new RestServices();
    private static String token;

    @BeforeAll
    static void getToken(){
       token = REST_SERVICES.getToken().getToken();
    }

    @Test
    public void emailIsWright(){
        assertEquals(REST_SERVICES.getToken().getEmail(),"xiharmikl57@gmail.com",
                " Email "+REST_SERVICES.getToken().getEmail()+"is incorrect");
    }

    @Test
    public void registerSuccessTrue() throws IOException {
        assertEquals(REST_SERVICES.registerUser(GENERATED_EMAIL).getMsg(),
                "Email successfully sent","Email is not successfully sent");
    }
}
