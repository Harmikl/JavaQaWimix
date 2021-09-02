package apiTest.MSQ;

import org.junit.jupiter.api.Test;

import static apiTest.MSQ.RestServices.GENERATED_EMAIL;
import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * created by maksimkharmak , 22.08.21
 */
public class APITest extends TestRunner{
    private static final RestServices REST_SERVICES = new RestServices();
    private static String token;

    @Test
    public void getToken(){
       token = REST_SERVICES.getToken().getToken();
    }

    @Test
    public void emailIsWright(){
        assertEquals(REST_SERVICES.getToken().getEmail(),"xiharmikl57@gmail.com",
                " Email "+REST_SERVICES.getToken().getEmail()+"is incorrect");
    }@Test
    public void emailIsWright1(){
        assertEquals(REST_SERVICES.getToken().getStatus(),"confirmed",
                " Token broken");
    }
    @Test
    public void registerSuccessTrue(){
        assertEquals(REST_SERVICES.registerUser(GENERATED_EMAIL,"Qwe12345*").getSuccess(),true,
                "success is not true");

    }
}
