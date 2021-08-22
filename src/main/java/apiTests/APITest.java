package apiTests;

import junit.textui.TestRunner;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

import static apiTests.Assets.ADAUSD;
import static apiTests.OrderTypes.CLOSED;
import static apiTests.OrderTypes.OPEN;
import static org.junit.jupiter.api.Assertions.assertEquals;



@TestMethodOrder(MethodOrderer.OrderAnnotation.class   )
public class APITest extends TestRunner {

    private static final RestService REST_SERVICE = new RestService();
    private static String token;

    @BeforeAll
    static void setUp() {
        token = REST_SERVICE.getToken().getAccessToken();
    }

    @Test
    public void symbolNameShouldBeEqualToExpectedValue() {
        assertEquals(ADAUSD.name(), REST_SERVICE.getAssetLeverage(token).getSymbol(),
                "Asset name is incorrect");
    }

    @Test
    public void getClosedOrdersHistory() {
        int numberOfClosedOrders = REST_SERVICE.getOrderHistory(token, ADAUSD.getAssetType(), CLOSED.getType()).length;
        assertEquals(0, numberOfClosedOrders, "Number of closed orders is incorrect");
    }

    @Test
    public void getOpenOrdersHistory() {
        int numberOfOpenOrders = REST_SERVICE.getOrderHistory_2(token, ADAUSD.getAssetType(), OPEN.getType()).length;
        assertEquals(1, numberOfOpenOrders, "Number of open orders is incorrect");
    }
}