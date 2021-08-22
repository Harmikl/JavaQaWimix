package apiTestMSQ;

import apiTests.RestService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * created by maksimkharmak , 22.08.21
 */
public class APITest extends TestRunner{
    private static final apiTestMSQ.RestServices REST_SERVICES = new RestServices();
    private static String token;

    @Test
    public void getToken(){
       token = REST_SERVICES.getToken().getToken();
    }

    @Test
    public void emailIsWright(){
        assertEquals(REST_SERVICES.getToken().getEmail(),"xiharmikl57@gmail.com",
                " Email "+REST_SERVICES.getToken().getEmail()+"is incorrect");
    }
}
