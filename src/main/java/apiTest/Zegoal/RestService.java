package apiTest.Zegoal;

import io.restassured.RestAssured;
import io.restassured.filter.log.RequestLoggingFilter;
import io.restassured.filter.log.ResponseLoggingFilter;
import io.restassured.http.ContentType;

import java.util.HashMap;
import java.util.Map;

import static io.restassured.RestAssured.given;

/**
 * created by maksimkharmak , 31.08.21
 */
public class RestService {
    private final static String BASE_URL = "https://testing7.zgdev.info",
    LOGIN_END_POINT = "/api/auth/token/",
    CLIENT_LIST_END_POINT = "/api/aufatmen/client/",
    USER_SETTINGS_ENDPOINT = "/api/v1/user_settings/",
    USERNAME = "22ww@mail.com",
    PASSWORD = "Wimix1";



    static {
        RestAssured.filters(new RequestLoggingFilter(), new ResponseLoggingFilter());
    }

    public Token getToken (){
        return given()
                .contentType(ContentType.JSON)
                .body(initLoginBody())
                .when()
                .post(BASE_URL+LOGIN_END_POINT)
                .then()
                .assertThat()
                .contentType(ContentType.JSON)
                .statusCode(200)
                .extract()
                .as(Token.class);
    }

    public ListOfSettings getListOfSettings(String access_token){
        return given()
                .contentType(ContentType.JSON)
                .auth()
                .oauth2(access_token)
//                .header("Authorization","Bearer "+access_token)
                .when()
                .get(BASE_URL+USER_SETTINGS_ENDPOINT)
                .then()
                .assertThat()
                .contentType(ContentType.JSON)
                .statusCode(200)
                .extract()
                .as(ListOfSettings.class);
    }

    private Map<String,Object> initLoginBody(){
        Map<String,Object> body = new HashMap<>();
        body.put("client_id","UdT5Nmlm9x42vq3CvQ4H7S7VOcQVJzCVIKeeIDer");
        body.put("client_secret","Ncptw156EextrVGNxuTslUSM1etS2JBoPYbRn1W2GGj87eJ96aXQJ85HZziIhOtTTUsMgaDeRTNo1rmydglfJMYo8tp4Cxz4WHm7stKyIucVW3gMLdwWg5XHKqo3Uszb");
        body.put("grant_type", "password");
        body.put("username",USERNAME);
        body.put("password",PASSWORD);
        body.put("device_id", "990000862471854");
        body.put("client_app_version", "2.10");
        return body;
    }
}
